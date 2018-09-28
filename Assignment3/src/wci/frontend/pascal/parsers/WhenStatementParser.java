package wci.frontend.pascal.parsers;

import java.util.EnumSet;

import wci.frontend.*;
import wci.frontend.pascal.*;
import wci.intermediate.*;
import wci.intermediate.icodeimpl.*;

import static wci.frontend.pascal.PascalTokenType.*;
import static wci.frontend.pascal.PascalErrorCode.*;
import static wci.intermediate.icodeimpl.ICodeNodeTypeImpl.*;
import static wci.intermediate.icodeimpl.ICodeKeyImpl.*;

/**
 * <h1>IfStatementParser</h1>
 *
 * <p>Parse a Pascal IF statement.</p>
 *
 * <p>Copyright (c) 2009 by Ronald Mak</p>
 * <p>For instructional purposes only.  No warranties.</p>
 */
public class WhenStatementParser extends StatementParser
{
    /**
     * Constructor.
     * @param parent the parent parser.
     */
    public WhenStatementParser(PascalParserTD parent)
    {
        super(parent);
    }

    // Synchronization set for THEN.
    private static final EnumSet<PascalTokenType> EQUALS_GREATER_SET =
        StatementParser.STMT_START_SET.clone();
    static {
        EQUALS_GREATER_SET.add(EQUALS_GREATER);
        EQUALS_GREATER_SET.addAll(StatementParser.STMT_FOLLOW_SET);
    }

    /**
     * Parse a WHEN statement.
     * @param token the initial token.
     * @return the root node of the generated parse tree.
     * @throws Exception if an error occurred.
     */
    /*
		 WHEN
		 i = 1 => f := 10;
		 i = 2 => f := 20;
		 i = 3 => f := 30;
		 i = 4 => f := 40;
		 OTHERWISE => f := -1
		END
     */
    public ICodeNode parse(Token token)
        throws Exception
    {
        token = nextToken();  // consume the WHEN

        // Create an IF node. This is will be a root of the whole when statement.
        ICodeNode ifNode = ICodeFactory.createICodeNode(ICodeNodeTypeImpl.IF);

        //We will need expression parser and statement parser to parse every line
        //expression=>statement;
        ExpressionParser expressionParser = new ExpressionParser(this);
        StatementParser statementParser = new StatementParser(this);
        ICodeNode curNode = ifNode;

        // I think this should work. 
        // However, I need to look more if expressionParser and StatementParser will eventually get me to the new line.

        // Loop to parse each 'expression => statement;' until the OTHERWISE token
        // or the end of the source file.
        while (!(token instanceof EofToken) && (token.getType() != OTHERWISE)) {
            // Parse the expression.
        	curNode.addChild(expressionParser.parse(token));

            // Synchronize at =>
            token = synchronize(EQUALS_GREATER_SET);
            if (token.getType() == EQUALS_GREATER) {
                token = nextToken();  // consume =>
            }
            else {
                errorHandler.flag(token, MISSING_EQUALS_GREATER, this);
            }

            // Parse the statement.
        	curNode.addChild(statementParser.parse(token));
            // synchronize on ; between the statements.

            // Look for the semicolon after statement and before expression.
            token = currentToken();
            TokenType tokenType = token.getType();

            // Look for the semicolon between CASE branches.
            if (tokenType == SEMICOLON) {
                token = nextToken();  // consume the ;
            }

            // If at the start of the next constant, then missing a semicolon.
            else if (EQUALS_GREATER_SET.contains(tokenType)) {
                errorHandler.flag(token, MISSING_SEMICOLON, this);
            }

            if (token.getType() == END) {
            	errorHandler.flag(token, MISSING_OTHERWISE, this);
            	break;
            }

            // if we have more conditions, then we need add the third child as IF
            // and start building the tree under that if.
            if (token.getType() != OTHERWISE) {
                curNode = curNode.addChild(ICodeFactory.createICodeNode(ICodeNodeTypeImpl.IF));
            }
        }

        
        /* Means that this token type is OTHERWISE.
         * By now, the current node should have at least 2 children.
         * Whatever is followed by otherwise should become the 3 child.	
         */
        if (token.getType() == OTHERWISE) {
            token = nextToken();  // consume OTHERWISE
        }

        // Synchronize at =>
        token = synchronize(EQUALS_GREATER_SET);
        if (token.getType() == EQUALS_GREATER) {
            token = nextToken();  // consume =>
        }
        else {
            errorHandler.flag(token, MISSING_EQUALS_GREATER, this);
        }

        // the curNode should have only 2 children now.
        curNode.addChild(statementParser.parse(token));

        token = currentToken();
        // Look for the END token.
        if (token.getType() == END) {
            token = nextToken();  // consume END
        }
        else {
            errorHandler.flag(token, MISSING_END, this);
        }

        return ifNode;
    }
}

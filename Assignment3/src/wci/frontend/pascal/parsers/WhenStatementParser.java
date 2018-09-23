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
    
    /* TODO: This is something that we should work on. */
    // Synchronization set for THEN.
    private static final EnumSet<PascalTokenType> THEN_SET =
        StatementParser.STMT_START_SET.clone();
    static {
        THEN_SET.add(THEN);
        THEN_SET.addAll(StatementParser.STMT_FOLLOW_SET);
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
        
        /* We will need expression parser and statement parser to parse every line
        *  expression=>statement;	
        */
        ExpressionParser expressionParser = new ExpressionParser(this);
        StatementParser statementParser = new StatementParser(this);
        ICodeNode curNode = ifNode;
        // I think this should work. 
        // However, I need to look more if expressionParser and StatementParser will eventually get me to the new line.
        while(token.getType() != OTHERWISE)
        {
        	
        	curNode.addChild(expressionParser.parse(token));
        	// need to consume => here.
        	curNode.addChild(statementParser.parse(token));
        	// not sure if semicolon is consumed here.
        	
        	// if we have more conditions, then we need add the third child as IF
        	// and start building the tree under that if.
        	if(token.getType() != OTHERWISE)
        			curNode = curNode.addChild(ICodeFactory.createICodeNode(ICodeNodeTypeImpl.IF));
        }
        
        /* Means that this token type is OTHERWISE.
         * By now, the current node should have at least 2 children.
         * Whatever is followed by otherwise should become the 3 child.	
         */
        token = nextToken();  // consume OTHERWISE
        // need to consume => here.
        // the curNode should have only 2 children now.
        curNode.addChild(statementParser.parse(token));
        //need to consume the END here.
        
        
        
        // TODO: Looks like here there should a synchronization on =>
        // I haven't looked too closely at synchronization and why we need it.
        // Synchronize at the THEN.
        
//        token = synchronize(THEN_SET);
//        if (token.getType() == THEN) {
//            token = nextToken();  // consume the THEN
//        }
//        else {
//            errorHandler.flag(token, MISSING_THEN, this);
//        }

        return ifNode;
    }
}

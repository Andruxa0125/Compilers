package wci.frontend.java;

import wci.frontend.*;
import wci.frontend.java.tokens.*;

import static wci.frontend.Source.EOF;
import static wci.frontend.Source.EOL;
import static wci.frontend.java.JavaErrorCode.*;

/**
 * <h1>JavaScanner</h1>
 *
 * <p>The Java scanner.</p>
 *
 * <p>Copyright (c) 2009 by Ronald Mak</p>
 * <p>For instructional purposes only.  No warranties.</p>
 */
public class JavaScanner extends Scanner
{
    /**
     * Constructor
     * @param source the source to be used with this scanner.
     */
    public JavaScanner(Source source)
    {
        super(source);
    }

    /**
     * Extract and return the next Java token from the source.
     * @return the next token.
     * @throws Exception if an error occurred.
     */
    protected Token extractToken()
        throws Exception
    {
        skipWhiteSpace();

        Token token = null;
        char currentChar = currentChar();

        // Construct the next token.  The current character determines the
        // token type.
        if (currentChar == EOF) {
            token = new EofToken(source);
        }
        else if (Character.isLetter(currentChar) ||
        		 currentChar == '_') {
            token = new JavaIdentifierToken(source);
        }
        else if (Character.isDigit(currentChar)) {
            token = new JavaNumberToken(source);
        }
        else if (currentChar == '\"') {
            token = new JavaStringToken(source);
        }
        else if (currentChar == '\'') {
        	token = new JavaCharToken(source);
        }
        else if (JavaTokenType.SPECIAL_SYMBOLS
                 .containsKey(Character.toString(currentChar))) {
            token = new JavaSpecialSymbolToken(source);
        }
        else {
            token = new JavaErrorToken(source, INVALID_CHARACTER,
                                         Character.toString(currentChar));
            nextChar();  // consume character
        }

        return token;
    }

    /**
     * Skip whitespace characters by consuming them.  A comment is whitespace.
     * @throws Exception if an error occurred.
     */
    private void skipWhiteSpace()
        throws Exception
    {
        char currentChar = currentChar();

        while (Character.isWhitespace(currentChar) || (currentChar == '/')) {

            // Start of a comment?
            if (currentChar == '/') {
                if (source.peekChar() == ' ') {
                    break;
                }
                currentChar = nextChar();

                // comment using /* */
                if (currentChar == '*') {
                    boolean isStillComment = true;
                    currentChar = nextChar();
                    do {
                        while ((currentChar != '*') && (currentChar != EOF)) {
                           currentChar = nextChar();
                        }

                        // Check closing '*' or non closing '*'?
                        if (currentChar == '*') {

                            currentChar = nextChar();  // consume the '*'
                            if (currentChar == '/') {
                                currentChar = nextChar();  // consume the '/' which means the end of comment
                                isStillComment = false;
                            }
                        }
                    }  while (isStillComment);
                }

                // comment using //
                else if (currentChar == '/') {
                    do {
                        currentChar = nextChar();
                    } while ((currentChar != EOL) && (currentChar != EOF));

                    // Found EOL?
                    if (currentChar == EOL) {
                        currentChar = nextChar(); // consume EOL and go to the next line
                    }
                }
            }

            // Not a comment.
            else {
                currentChar = nextChar();  // consume whitespace character
            }
        }
    }
}

package wci.frontend.java.tokens;

import wci.frontend.*;
import wci.frontend.java.*;

import static wci.frontend.Source.EOF;
import static wci.frontend.java.JavaTokenType.*;
import static wci.frontend.java.JavaErrorCode.*;

/**
 * TODO: Remove value quotes
 * <h1>JavaStringToken</h1>
 *
 * <p> Java string tokens.</p>
 *
 * <p>Copyright (c) 2009 by Ronald Mak</p>
 * <p>For instructional purposes only.  No warranties.</p>
 * <p>Modified by Brian Tan</p>
 */
public class JavaStringToken extends JavaToken
{
    /**
     * Constructor.
     * @param source the source from where to fetch the token's characters.
     * @throws Exception if an error occurred.
     */
    public JavaStringToken(Source source)
        throws Exception
    {
        super(source);
    }

    /* Appends all characters from currentChar till " or EOF. */
    private char advanceTillEnd(StringBuilder textBuffer, char currentChar)
    	throws Exception
    {
    	// keep looping until it sees a quote
    	while((currentChar != '\"') && (currentChar != EOF))
    	{
    		// if this current character is a backslash, then consume and append two characters
    		if (currentChar == '\\') {
    			textBuffer.append(currentChar);
    			currentChar = nextChar();
    		}
    		// else consume one
    		textBuffer.append(currentChar);
			currentChar = nextChar();
    	}
    	return currentChar;
    }
    
    /**
     * Extract a Java string token from the source.
     * @throws Exception if an error occurred.
     */
    protected void extract()
        throws Exception
    {
        StringBuilder textBuffer = new StringBuilder();
        StringBuilder valueBuffer = new StringBuilder();

        char currentChar = nextChar();  // consume initial quote
        textBuffer.append('\"');
        boolean errorFlag = false;

        // Get string characters.
        do {
            // Replace any whitespace character with a blank.
            if (Character.isWhitespace(currentChar)) {
                currentChar = ' ';
            }
            //	check if this current character is not a quote, end of file, or a backslash, if not then add to buffer
            if ((currentChar != '\"') && (currentChar != EOF) && (currentChar != '\\')) {
                textBuffer.append(currentChar);
                valueBuffer.append(currentChar);
                currentChar = nextChar();  // consume character
            }

            //Checks if there is a backslash at the current character.
            if (currentChar == '\\') {
            	//loops if the first two characters in current position is an escape character
                while ((currentChar == '\\')) {
                	//if the next character is not part of the escape character set, throw error and get out of loop
                	if(!escapeCharacters.contains(peekChar())) {
                		type = ERROR;
            			value = MISSING_ESCAPE_CHAR;
            			errorFlag = true;	//set error flag so it doesn't continue in this loop
            			currentChar = advanceTillEnd(textBuffer, currentChar);	//iterate to the end of the string
            			currentChar = nextChar();	// consume last character in the string
            			break;
                	}
                	//Concatenate both characters two create an escape character string
                	String fromChar = new String(new char[] {'\\', peekChar()});
                	//add the string into the buffer
                    textBuffer.append(fromChar);
                    //Call the insertEscape method to create the literal escape character
                    valueBuffer.append(getCorrectChar(peekChar())); // append
                    currentChar = nextChar();        // consume the backslash
                    currentChar = nextChar();		 // consume the escape character
                }
            }
        } while ((currentChar != '\"') && (currentChar != EOF) && (!errorFlag));	//keep looping till the end of quote, file, or flag raised        
        
        //  after iterating, check if flag isn't raised
        if(!errorFlag) {
        	// check to make sure there is a closing quote
            if (currentChar == '\"') {
                nextChar();  // consume final quote
                textBuffer.append('\"');
                type = STRING;
                value = valueBuffer.toString();
            }
            // if not then throw end of file error
            else {
                type = ERROR;
                value = UNEXPECTED_EOF;
            }
        }

        text = textBuffer.toString();
    }
}

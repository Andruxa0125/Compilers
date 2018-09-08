package wci.frontend.java.tokens;

import wci.frontend.*;
import wci.frontend.java.*;

import static wci.frontend.Source.EOF;
import static wci.frontend.java.JavaTokenType.*;
import static wci.frontend.java.JavaErrorCode.*;

/**
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

        // Get string characters.
        do {
            // Replace any whitespace character with a blank.
            if (Character.isWhitespace(currentChar)) {
                currentChar = ' ';
            }

            if ((currentChar != '\"') && (currentChar != EOF)) {
                textBuffer.append(currentChar);
                valueBuffer.append(currentChar);
                currentChar = nextChar();  // consume character
            }

            //Checks if there is a backslash at the current character.
            if (currentChar == '\\') {
            	//loops if the first two characters in current position is an escape character
                while ((currentChar == '\\') && (checkEscapeChar(peekChar()))) {
                	//Concatenate both characters two create an escape character string
                	String fromChar = new String(new char[] {'\\', peekChar()});;
                	//add the string into the buffer
                    textBuffer.append(fromChar);
                    //Call the insertEscape method to create the literal escape character
                    valueBuffer.append(insertEscape(peekChar())); // append
                    currentChar = nextChar();        // consume the backslash
                    currentChar = nextChar();		 // consume the escape character
                }
            }
        } while ((currentChar != '\"') && (currentChar != EOF));	//keep looping till the end of quote or file

        if (currentChar == '\"') {
            nextChar();  // consume final quote
            textBuffer.append('\"');

            type = STRING;
            value = valueBuffer.toString();
        }
        else {
            type = ERROR;
            value = UNEXPECTED_EOF;
        }

        text = textBuffer.toString();
    }
    
    protected boolean checkEscapeChar(char input) {
    	//checks the character after the backslash if it is escape character
    	if (input == '\"' || input == 't' || input == 'n' || input == '\'' || input == '\\') { 
    		return true;
    	}
    	return false;
    }
    
    protected char insertEscape(char input) {
    	char value;
    	//gets the 2nd character and returns the literal escape character; if not found, then returns @ 
    	switch(input) {
    	case '\"' : value = '\"';
    				break;
    	case 't'  : value = '\t';
    				break;
    	case 'n'  : value = '\n';
    				break;
    	case '\'' : value = '\'';
    				break;
    	case '\\' : value = '\\';
    				break;
    	default   : value = '@';
    				break;
    	}
    	return value;	
    	
    }
}

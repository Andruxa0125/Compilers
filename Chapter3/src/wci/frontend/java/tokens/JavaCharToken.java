package wci.frontend.java.tokens;

import wci.frontend.*;
import wci.frontend.java.*;

import static wci.frontend.Source.EOF;
import static wci.frontend.java.JavaTokenType.*;
import static wci.frontend.java.JavaErrorCode.*;

public class JavaCharToken extends JavaToken
{
	// this count will be used in advanceTillEnd.
	private int count;
    /**
     * Constructor.
     * @param source the source from where to fetch the token's characters.
     * @throws Exception if an error occurred.
     */
    public JavaCharToken(Source source)
        throws Exception
    {
        super(source);
        count = 0;
    }
    /* Appends all characters from currentChar till ' or EOF. */
    private char advanceTillEnd(StringBuilder textBuffer, char currentChar)
    	throws Exception
    {
    	while((currentChar != '\'') && (currentChar != EOF))
    	{
    		textBuffer.append(currentChar);
    		currentChar = nextChar();
    		count++;
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
    	value = null;
    	
        StringBuilder textBuffer = new StringBuilder();
        StringBuilder valueBuffer = new StringBuilder();

        // consume initial single quote and append to the nextBuffer.
        char currentChar = nextChar();
        textBuffer.append('\'');
        
        int index = 0;
        // Get string characters.
        while ((currentChar != '\'') && (currentChar != EOF))
        {
            // Replace any whitespace character with a blank.
            if (Character.isWhitespace(currentChar)) {
                currentChar = ' ';
            }

            if ((currentChar != '\'') && (currentChar != EOF) &&
            	(currentChar != '\\')) {
            	/*we have read one character and there are more coming up
            	 and it is not backslash. */
            	if(index != 0)
            	{
            		type = ERROR;
                    value = TOO_MANY_CHARS;
                    currentChar = advanceTillEnd(textBuffer, currentChar);
                    break;
            	}
            	
                textBuffer.append(currentChar);
                valueBuffer.append(currentChar);
                currentChar = nextChar();  // consume character
                index++;
            }
            else if(currentChar == '\\')
            {
            	// we have handled some characters and now we see backslash
            	// should throw an exception here.
            	if(index != 0)
            	{
            		type = ERROR;
                    value = TOO_MANY_CHARS;
                    currentChar = advanceTillEnd(textBuffer, currentChar);
                    break;
            	}
            	// it is backslash. Next character should belong to escape character.
            	else {
            		// appending backslash.
            		textBuffer.append(currentChar);
            		// advancing to the next one and appending it too.
            		currentChar = nextChar();
            		
            		if(currentChar == EOF)
            			break;
            		// if the next char isn't in our set of chars that should be escaped.
            		else if(!escapeCharacters.contains(currentChar)) {
            			type = ERROR;
            			value = MISSING_ESCAPE_CHAR;
            			System.out.println("Some character wasn't escaped.");
            			currentChar = advanceTillEnd(textBuffer, currentChar);
            			break;
            		}
            		/* At this point we know that it was escaped correctly. 
            		 * Get appropriate char and advance till end. */
            		char ch = getCorrectChar(currentChar);
            		textBuffer.append(currentChar);
            		currentChar = nextChar();
            		currentChar = advanceTillEnd(textBuffer, currentChar);
            		if(count != 0){
            			type = ERROR;
                        value = TOO_MANY_CHARS;
                        break;
            		}
            		value = ch;
            		type = CHAR;
            	}
            }
        }
        if (currentChar == '\'') {
            nextChar();  // consume final quote
            textBuffer.append('\'');
            
            /* If we haven't set it yet, 
             * valueBuffer should have a right thing. */
            if(value == null) {
            	type = CHAR;
            	value = valueBuffer.toString();
            }
        }
        // set the error unless it is done already.
        else if(value == null){
            type = ERROR;
            value = UNEXPECTED_EOF;
        }
        text = textBuffer.toString();
    }
}

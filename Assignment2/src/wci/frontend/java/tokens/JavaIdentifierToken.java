package wci.frontend.java.tokens;

import wci.frontend.*;
import wci.frontend.java.*;

import static wci.frontend.java.JavaTokenType.*;

/**
 * <h1>JavaWordToken</h1>
 *
 * <p> Java word tokens (identifiers and reserved words).</p>
 *
 * <p>Copyright (c) 2009 by Ronald Mak</p>
 * <p>For instructional purposes only.  No warranties.</p>
 */
public class JavaIdentifierToken extends JavaToken
{
    /**
     * Constructor.
     * @param source the source from where to fetch the token's characters.
     * @throws Exception if an error occurred.
     */
    public JavaIdentifierToken(Source source)
        throws Exception
    {
        super(source);
    }

    /**
     * Extract a Java word token from the source.
     * @throws Exception if an error occurred.
     */
    protected void extract()
        throws Exception
    {
        StringBuilder textBuffer = new StringBuilder();
        char currentChar = currentChar();

        // Get the word characters (letter or digit or _).  The scanner has
        // already determined that the first character is a letter.
        while (Character.isLetterOrDigit(currentChar) || currentChar == '_') {
            textBuffer.append(currentChar);
            currentChar = nextChar();  // consume character
        }

        text = textBuffer.toString();

        // Case sensitivity check
        // Check if all chars are lowercase in text
        boolean isLowerCase = text.equals(text.toLowerCase());
        
        // Is it a reserved word or an identifier?
        if (isLowerCase) {
            type = (RESERVED_WORDS.contains(text))
                    ? JavaTokenType.valueOf(text.toUpperCase())  // reserved word
                    : IDENTIFIER; // identifier
        } else {
            type = IDENTIFIER; // identifier
        }
    }
}
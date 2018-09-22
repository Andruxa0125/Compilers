package wci.frontend.java;

import java.util.HashSet;

import wci.frontend.*;

/**
 * <h1>JavaToken</h1>
 *
 * <p>Base class for Java token classes.</p>
 *
 * <p>Copyright (c) 2009 by Ronald Mak</p>
 * <p>For instructional purposes only.  No warranties.</p>
 */
public class JavaToken extends Token
{
    /**
     * Constructor.
     * @param source the source from where to fetch the token's characters.
     * @throws Exception if an error occurred.
     */
	
	/* Method that creates a set with all characters that should be escaped. 
	 * The resource used for escape characters for a char:
     * https://docs.oracle.com/javase/tutorial/java/data/characters.html */
	public static HashSet<Character> createEscapeCharsHashSet() {
	    HashSet<Character> set = new HashSet<Character>();
	    set.add('\''); //single quote
	    set.add('\\'); // / backslash
	    set.add('\"'); // double quote
	    // \t \b \n \r \f
	    String escapeChars = "tbnrf";
	    for (int i = 0; i < escapeChars.length(); i++) {
	        set.add(escapeChars.charAt(i));
	    }
	    return set;
	}
	/* Actual set used in JavaCharToken and JavaStringToken. */
	protected static final HashSet<Character> escapeCharacters = 
											  createEscapeCharsHashSet();
	
    /* Method that returns a character based on the string for escape character.
     * If not found, returns @. We should never return that.  */
	protected static char getCorrectChar(char escapeChar)
	{
		Character value;
		switch(escapeChar) {
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
    	case 'f' : value = '\f';
					break;
    	case 'r' : value = '\r';
					break;
    	case 'b' : value = '\b';
					break;
    	default   : value = '@';
    				break;
		}
		return value;	
	}
    protected JavaToken(Source source)
        throws Exception
    {
        super(source);
    }
}

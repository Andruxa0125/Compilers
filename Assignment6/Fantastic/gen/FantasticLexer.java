// Generated from /Users/izzymoriguchi/Dropbox/SJSU/CS_Courses/CS153/Assignments/Assignment2/Compilers/Assignment6/Fantastic/Fantastic.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FantasticLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, INT_TYPE=7, STRING_TYPE=8, 
		INT_TYPE_REF=9, STRING_TYPE_REF=10, IF=11, ELSE=12, FUNCTION=13, WHILE=14, 
		RETURN=15, MUL=16, ADD=17, SUB=18, DIV=19, PERC=20, GT=21, LT=22, LET=23, 
		GET=24, EQ=25, IDENTIFIER=26, INT_LITERAL=27, STRING_LITERAL=28, NEWLINE=29, 
		WS=30, SEMICOLON=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "INT_TYPE", "STRING_TYPE", 
		"INT_TYPE_REF", "STRING_TYPE_REF", "IF", "ELSE", "FUNCTION", "WHILE", 
		"RETURN", "MUL", "ADD", "SUB", "DIV", "PERC", "GT", "LT", "LET", "GET", 
		"EQ", "IDENTIFIER", "INT_LITERAL", "STRING_LITERAL", "NEWLINE", "WS", 
		"SEMICOLON"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'='", "','", "'{'", "'}'", "'int'", "'string'", "'int&'", 
		"'string&'", "'if'", "'else'", "'func'", "'while'", "'return'", "'*'", 
		"'+'", "'-'", "'/'", "'%'", "'>'", "'<'", "'<='", "'>='", "'=='", null, 
		null, null, null, null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "INT_TYPE", "STRING_TYPE", "INT_TYPE_REF", 
		"STRING_TYPE_REF", "IF", "ELSE", "FUNCTION", "WHILE", "RETURN", "MUL", 
		"ADD", "SUB", "DIV", "PERC", "GT", "LT", "LET", "GET", "EQ", "IDENTIFIER", 
		"INT_LITERAL", "STRING_LITERAL", "NEWLINE", "WS", "SEMICOLON"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public FantasticLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Fantastic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00b7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\6\33\u0098\n\33\r\33\16\33\u0099"+
		"\3\34\6\34\u009d\n\34\r\34\16\34\u009e\3\35\3\35\7\35\u00a3\n\35\f\35"+
		"\16\35\u00a6\13\35\3\35\3\35\3\36\5\36\u00ab\n\36\3\36\3\36\3\37\6\37"+
		"\u00b0\n\37\r\37\16\37\u00b1\3\37\3\37\3 \3 \2\2!\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!\3\2\6\4\2C\\c|\3"+
		"\2\62;\5\2\62;C\\c|\4\2\13\13\"\"\2\u00bb\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\3A\3\2\2\2\5C\3\2\2\2\7E\3\2\2\2\tG\3\2\2\2\13I\3\2\2\2\rK\3\2\2\2\17"+
		"M\3\2\2\2\21Q\3\2\2\2\23X\3\2\2\2\25]\3\2\2\2\27e\3\2\2\2\31h\3\2\2\2"+
		"\33m\3\2\2\2\35r\3\2\2\2\37x\3\2\2\2!\177\3\2\2\2#\u0081\3\2\2\2%\u0083"+
		"\3\2\2\2\'\u0085\3\2\2\2)\u0087\3\2\2\2+\u0089\3\2\2\2-\u008b\3\2\2\2"+
		"/\u008d\3\2\2\2\61\u0090\3\2\2\2\63\u0093\3\2\2\2\65\u0097\3\2\2\2\67"+
		"\u009c\3\2\2\29\u00a0\3\2\2\2;\u00aa\3\2\2\2=\u00af\3\2\2\2?\u00b5\3\2"+
		"\2\2AB\7*\2\2B\4\3\2\2\2CD\7+\2\2D\6\3\2\2\2EF\7?\2\2F\b\3\2\2\2GH\7."+
		"\2\2H\n\3\2\2\2IJ\7}\2\2J\f\3\2\2\2KL\7\177\2\2L\16\3\2\2\2MN\7k\2\2N"+
		"O\7p\2\2OP\7v\2\2P\20\3\2\2\2QR\7u\2\2RS\7v\2\2ST\7t\2\2TU\7k\2\2UV\7"+
		"p\2\2VW\7i\2\2W\22\3\2\2\2XY\7k\2\2YZ\7p\2\2Z[\7v\2\2[\\\7(\2\2\\\24\3"+
		"\2\2\2]^\7u\2\2^_\7v\2\2_`\7t\2\2`a\7k\2\2ab\7p\2\2bc\7i\2\2cd\7(\2\2"+
		"d\26\3\2\2\2ef\7k\2\2fg\7h\2\2g\30\3\2\2\2hi\7g\2\2ij\7n\2\2jk\7u\2\2"+
		"kl\7g\2\2l\32\3\2\2\2mn\7h\2\2no\7w\2\2op\7p\2\2pq\7e\2\2q\34\3\2\2\2"+
		"rs\7y\2\2st\7j\2\2tu\7k\2\2uv\7n\2\2vw\7g\2\2w\36\3\2\2\2xy\7t\2\2yz\7"+
		"g\2\2z{\7v\2\2{|\7w\2\2|}\7t\2\2}~\7p\2\2~ \3\2\2\2\177\u0080\7,\2\2\u0080"+
		"\"\3\2\2\2\u0081\u0082\7-\2\2\u0082$\3\2\2\2\u0083\u0084\7/\2\2\u0084"+
		"&\3\2\2\2\u0085\u0086\7\61\2\2\u0086(\3\2\2\2\u0087\u0088\7\'\2\2\u0088"+
		"*\3\2\2\2\u0089\u008a\7@\2\2\u008a,\3\2\2\2\u008b\u008c\7>\2\2\u008c."+
		"\3\2\2\2\u008d\u008e\7>\2\2\u008e\u008f\7?\2\2\u008f\60\3\2\2\2\u0090"+
		"\u0091\7@\2\2\u0091\u0092\7?\2\2\u0092\62\3\2\2\2\u0093\u0094\7?\2\2\u0094"+
		"\u0095\7?\2\2\u0095\64\3\2\2\2\u0096\u0098\t\2\2\2\u0097\u0096\3\2\2\2"+
		"\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\66"+
		"\3\2\2\2\u009b\u009d\t\3\2\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f8\3\2\2\2\u00a0\u00a4\7$\2\2\u00a1"+
		"\u00a3\t\4\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7"+
		"\u00a8\7$\2\2\u00a8:\3\2\2\2\u00a9\u00ab\7\17\2\2\u00aa\u00a9\3\2\2\2"+
		"\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7\f\2\2\u00ad<\3"+
		"\2\2\2\u00ae\u00b0\t\5\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\b\37"+
		"\2\2\u00b4>\3\2\2\2\u00b5\u00b6\7=\2\2\u00b6@\3\2\2\2\b\2\u0099\u009e"+
		"\u00a4\u00aa\u00b1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
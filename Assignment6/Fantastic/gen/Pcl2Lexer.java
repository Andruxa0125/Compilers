// Generated from /Users/izzymoriguchi/Dropbox/SJSU/CS_Courses/CS153/Lecture_Slides/Code_Examples/Pcl2_181108/Pcl2/Pcl2.g4 by ANTLR 4.7

    import wci.intermediate.TypeSpec;
    //import wci.intermediate.symtabimpl.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Pcl2Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, PROGRAM=8, VAR=9, 
		BEGIN=10, END=11, IDENTIFIER=12, INTEGER=13, FLOAT=14, MUL_OP=15, DIV_OP=16, 
		ADD_OP=17, SUB_OP=18, NEWLINE=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "PROGRAM", "VAR", 
		"BEGIN", "END", "IDENTIFIER", "INTEGER", "FLOAT", "MUL_OP", "DIV_OP", 
		"ADD_OP", "SUB_OP", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "';'", "':'", "','", "':='", "'('", "')'", "'PROGRAM'", "'VAR'", 
		"'BEGIN'", "'END'", null, null, null, "'*'", "'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "PROGRAM", "VAR", "BEGIN", 
		"END", "IDENTIFIER", "INTEGER", "FLOAT", "MUL_OP", "DIV_OP", "ADD_OP", 
		"SUB_OP", "NEWLINE", "WS"
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


	public Pcl2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pcl2.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26}\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\7\rS\n\r\f\r\16\r"+
		"V\13\r\3\16\6\16Y\n\16\r\16\16\16Z\3\17\6\17^\n\17\r\17\16\17_\3\17\3"+
		"\17\6\17d\n\17\r\17\16\17e\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\5\24q\n\24\3\24\3\24\3\24\3\24\3\25\6\25x\n\25\r\25\16\25y\3\25\3\25"+
		"\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26\3\2\6\4\2C\\c|\5\2\62;C\\c|\3\2\62;"+
		"\4\2\13\13\"\"\2\u0082\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2"+
		"\2\5-\3\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\13\63\3\2\2\2\r\66\3\2\2\2\178\3"+
		"\2\2\2\21:\3\2\2\2\23B\3\2\2\2\25F\3\2\2\2\27L\3\2\2\2\31P\3\2\2\2\33"+
		"X\3\2\2\2\35]\3\2\2\2\37g\3\2\2\2!i\3\2\2\2#k\3\2\2\2%m\3\2\2\2\'p\3\2"+
		"\2\2)w\3\2\2\2+,\7\60\2\2,\4\3\2\2\2-.\7=\2\2.\6\3\2\2\2/\60\7<\2\2\60"+
		"\b\3\2\2\2\61\62\7.\2\2\62\n\3\2\2\2\63\64\7<\2\2\64\65\7?\2\2\65\f\3"+
		"\2\2\2\66\67\7*\2\2\67\16\3\2\2\289\7+\2\29\20\3\2\2\2:;\7R\2\2;<\7T\2"+
		"\2<=\7Q\2\2=>\7I\2\2>?\7T\2\2?@\7C\2\2@A\7O\2\2A\22\3\2\2\2BC\7X\2\2C"+
		"D\7C\2\2DE\7T\2\2E\24\3\2\2\2FG\7D\2\2GH\7G\2\2HI\7I\2\2IJ\7K\2\2JK\7"+
		"P\2\2K\26\3\2\2\2LM\7G\2\2MN\7P\2\2NO\7F\2\2O\30\3\2\2\2PT\t\2\2\2QS\t"+
		"\3\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\32\3\2\2\2VT\3\2\2\2W"+
		"Y\t\4\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\34\3\2\2\2\\^\t\4\2"+
		"\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ac\7\60\2\2bd\t\4"+
		"\2\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\36\3\2\2\2gh\7,\2\2h \3"+
		"\2\2\2ij\7\61\2\2j\"\3\2\2\2kl\7-\2\2l$\3\2\2\2mn\7/\2\2n&\3\2\2\2oq\7"+
		"\17\2\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7\f\2\2st\3\2\2\2tu\b\24\2\2u"+
		"(\3\2\2\2vx\t\5\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2"+
		"{|\b\25\2\2|*\3\2\2\2\t\2TZ_epy\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from /Users/izzymoriguchi/Dropbox/SJSU/CS_Courses/CS153/Assignments/Assignment2/Compilers/Assignment6/Fantastic/Fantastic.g4 by ANTLR 4.7

    import wci.intermediate.TypeSpec;
    //import wci.intermediate.symtabimpl.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FantasticParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, INT_TYPE=7, STRING_TYPE=8, 
		INT_TYPE_REF=9, STRING_TYPE_REF=10, IF=11, ELSE=12, FUNCTION=13, WHILE=14, 
		RETURN=15, PRINT=16, MUL=17, ADD=18, SUB=19, DIV=20, PERC=21, GT=22, LT=23, 
		LET=24, GET=25, EQ=26, IDENTIFIER=27, INT_LITERAL=28, STRING_LITERAL=29, 
		NEWLINE=30, WS=31, SEMICOLON=32;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_var_decl_statement = 2, RULE_func_decl_statement = 3, 
		RULE_assignment_statement = 4, RULE_if_statement = 5, RULE_return_statement = 6, 
		RULE_type = 7, RULE_return_type = 8, RULE_function_name = 9, RULE_ref_type = 10, 
		RULE_expr = 11, RULE_variable = 12, RULE_literal = 13, RULE_func_call = 14, 
		RULE_params = 15, RULE_args = 16, RULE_block = 17;
	public static final String[] ruleNames = {
		"prog", "stat", "var_decl_statement", "func_decl_statement", "assignment_statement", 
		"if_statement", "return_statement", "type", "return_type", "function_name", 
		"ref_type", "expr", "variable", "literal", "func_call", "params", "args", 
		"block"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'='", "','", "'{'", "'}'", "'int'", "'string'", "'int&'", 
		"'string&'", "'if'", "'else'", "'func'", "'while'", "'return'", "'print'", 
		"'*'", "'+'", "'-'", "'/'", "'%'", "'>'", "'<'", "'<='", "'>='", "'=='", 
		null, null, null, null, null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "INT_TYPE", "STRING_TYPE", "INT_TYPE_REF", 
		"STRING_TYPE_REF", "IF", "ELSE", "FUNCTION", "WHILE", "RETURN", "PRINT", 
		"MUL", "ADD", "SUB", "DIV", "PERC", "GT", "LT", "LET", "GET", "EQ", "IDENTIFIER", 
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

	@Override
	public String getGrammarFileName() { return "Fantastic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FantasticParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				stat();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << INT_TYPE) | (1L << STRING_TYPE) | (1L << IF) | (1L << FUNCTION) | (1L << WHILE) | (1L << RETURN) | (1L << PRINT) | (1L << IDENTIFIER) | (1L << INT_LITERAL) | (1L << STRING_LITERAL) | (1L << NEWLINE))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStatContext extends StatContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(FantasticParser.NEWLINE, 0); }
		public IfStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDeclStatContext extends StatContext {
		public Var_decl_statementContext var_decl_statement() {
			return getRuleContext(Var_decl_statementContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(FantasticParser.NEWLINE, 0); }
		public VarDeclStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitVarDeclStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncDeclStatContext extends StatContext {
		public Func_decl_statementContext func_decl_statement() {
			return getRuleContext(Func_decl_statementContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(FantasticParser.NEWLINE, 0); }
		public FuncDeclStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitFuncDeclStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStatContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FantasticParser.SEMICOLON, 0); }
		public TerminalNode NEWLINE() { return getToken(FantasticParser.NEWLINE, 0); }
		public TerminalNode PRINT() { return getToken(FantasticParser.PRINT, 0); }
		public PrintStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitPrintStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStatContext extends StatContext {
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(FantasticParser.NEWLINE, 0); }
		public ReturnStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitReturnStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewLineStatContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(FantasticParser.NEWLINE, 0); }
		public NewLineStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitNewLineStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignStatContext extends StatContext {
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(FantasticParser.NEWLINE, 0); }
		public AssignStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitAssignStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStatContext extends StatContext {
		public TerminalNode WHILE() { return getToken(FantasticParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(FantasticParser.NEWLINE, 0); }
		public WhileStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitWhileStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				if_statement();
				setState(42);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new PrintStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				expr(0);
				setState(45);
				match(SEMICOLON);
				setState(46);
				match(NEWLINE);
				}
				break;
			case 3:
				_localctx = new VarDeclStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				var_decl_statement();
				setState(49);
				match(NEWLINE);
				}
				break;
			case 4:
				_localctx = new FuncDeclStatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				func_decl_statement();
				setState(52);
				match(NEWLINE);
				}
				break;
			case 5:
				_localctx = new AssignStatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				assignment_statement();
				setState(55);
				match(NEWLINE);
				}
				break;
			case 6:
				_localctx = new ReturnStatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(57);
				return_statement();
				setState(58);
				match(NEWLINE);
				}
				break;
			case 7:
				_localctx = new WhileStatContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(60);
				match(WHILE);
				setState(61);
				match(T__0);
				setState(62);
				expr(0);
				setState(63);
				match(T__1);
				setState(64);
				block();
				setState(65);
				match(NEWLINE);
				}
				break;
			case 8:
				_localctx = new PrintStatContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(67);
				match(PRINT);
				setState(68);
				match(T__0);
				setState(69);
				expr(0);
				setState(70);
				match(T__1);
				setState(71);
				match(SEMICOLON);
				setState(72);
				match(NEWLINE);
				}
				break;
			case 9:
				_localctx = new NewLineStatContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(74);
				match(NEWLINE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_decl_statementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FantasticParser.SEMICOLON, 0); }
		public Var_decl_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitVar_decl_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_decl_statementContext var_decl_statement() throws RecognitionException {
		Var_decl_statementContext _localctx = new Var_decl_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_decl_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			type();
			setState(78);
			variable();
			setState(79);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_decl_statementContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(FantasticParser.FUNCTION, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public Func_decl_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_decl_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitFunc_decl_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_decl_statementContext func_decl_statement() throws RecognitionException {
		Func_decl_statementContext _localctx = new Func_decl_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func_decl_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(FUNCTION);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT_TYPE || _la==STRING_TYPE) {
				{
				setState(82);
				return_type();
				}
			}

			setState(85);
			function_name();
			setState(86);
			match(T__0);
			setState(87);
			params();
			setState(88);
			match(T__1);
			setState(89);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_statementContext extends ParserRuleContext {
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
	 
		public Assignment_statementContext() { }
		public void copyFrom(Assignment_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentOverContext extends Assignment_statementContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FantasticParser.SEMICOLON, 0); }
		public AssignmentOverContext(Assignment_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitAssignmentOver(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclarationOverContext extends Assignment_statementContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FantasticParser.SEMICOLON, 0); }
		public DeclarationOverContext(Assignment_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitDeclarationOver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment_statement);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case STRING_TYPE:
				_localctx = new DeclarationOverContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				type();
				setState(92);
				variable();
				setState(93);
				match(T__2);
				setState(94);
				expr(0);
				setState(95);
				match(SEMICOLON);
				}
				break;
			case IDENTIFIER:
				_localctx = new AssignmentOverContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				variable();
				setState(98);
				match(T__2);
				setState(99);
				expr(0);
				setState(100);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FantasticParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(FantasticParser.NEWLINE, 0); }
		public TerminalNode ELSE() { return getToken(FantasticParser.ELSE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(IF);
			setState(105);
			match(T__0);
			setState(106);
			expr(0);
			setState(107);
			match(T__1);
			setState(108);
			block();
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(109);
				match(NEWLINE);
				setState(110);
				match(ELSE);
				setState(111);
				block();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(FantasticParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FantasticParser.SEMICOLON, 0); }
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(RETURN);
			setState(115);
			expr(0);
			setState(116);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(FantasticParser.INT_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(FantasticParser.STRING_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ( !(_la==INT_TYPE || _la==STRING_TYPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_typeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitReturn_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_return_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FantasticParser.IDENTIFIER, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ref_typeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE_REF() { return getToken(FantasticParser.INT_TYPE_REF, 0); }
		public TerminalNode STRING_TYPE_REF() { return getToken(FantasticParser.STRING_TYPE_REF, 0); }
		public Ref_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ref_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitRef_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ref_typeContext ref_type() throws RecognitionException {
		Ref_typeContext _localctx = new Ref_typeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ref_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if ( !(_la==INT_TYPE_REF || _la==STRING_TYPE_REF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TypeSpec typeSpec = null;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.typeSpec = ctx.typeSpec;
		}
	}
	public static class CompOpeOverContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CompOpeOverContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitCompOpeOver(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallContext extends ExprContext {
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public FuncCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LitContext extends ExprContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LitContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitLit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarContext extends ExprContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubOverContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddSubOverContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitAddSubOver(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivPercOverContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulDivPercOverContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitMulDivPercOver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new LitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(127);
				literal();
				}
				break;
			case 2:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				variable();
				}
				break;
			case 3:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				func_call();
				}
				break;
			case 4:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				match(T__0);
				setState(131);
				expr(0);
				setState(132);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(145);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivPercOverContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(136);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(137);
						((MulDivPercOverContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << PERC))) != 0)) ) {
							((MulDivPercOverContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(138);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new AddSubOverContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(139);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(140);
						((AddSubOverContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubOverContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(141);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new CompOpeOverContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(142);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(143);
						((CompOpeOverContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << LET) | (1L << GET) | (1L << EQ))) != 0)) ) {
							((CompOpeOverContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(144);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FantasticParser.IDENTIFIER, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TypeSpec typeSpec = null;
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
			this.typeSpec = ctx.typeSpec;
		}
	}
	public static class IntLitOverContext extends LiteralContext {
		public TerminalNode INT_LITERAL() { return getToken(FantasticParser.INT_LITERAL, 0); }
		public IntLitOverContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitIntLitOver(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StrLitOverContext extends LiteralContext {
		public TerminalNode STRING_LITERAL() { return getToken(FantasticParser.STRING_LITERAL, 0); }
		public StrLitOverContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitStrLitOver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_literal);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LITERAL:
				_localctx = new IntLitOverContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(INT_LITERAL);
				}
				break;
			case STRING_LITERAL:
				_localctx = new StrLitOverContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_callContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_func_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			function_name();
			setState(157);
			match(T__0);
			setState(158);
			args();
			setState(159);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<Ref_typeContext> ref_type() {
			return getRuleContexts(Ref_typeContext.class);
		}
		public Ref_typeContext ref_type(int i) {
			return getRuleContext(Ref_typeContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << STRING_TYPE) | (1L << INT_TYPE_REF) | (1L << STRING_TYPE_REF))) != 0)) {
				{
				setState(163);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_TYPE:
				case STRING_TYPE:
					{
					setState(161);
					type();
					}
					break;
				case INT_TYPE_REF:
				case STRING_TYPE_REF:
					{
					setState(162);
					ref_type();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(165);
				variable();
				}
			}

			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(169);
				match(T__3);
				setState(172);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT_TYPE:
				case STRING_TYPE:
					{
					setState(170);
					type();
					}
					break;
				case INT_TYPE_REF:
				case STRING_TYPE_REF:
					{
					setState(171);
					ref_type();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(174);
				variable();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(181);
				variable();
				}
				break;
			case INT_LITERAL:
			case STRING_LITERAL:
				{
				setState(182);
				literal();
				}
				break;
			case T__1:
			case T__3:
				break;
			default:
				break;
			}
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(185);
				match(T__3);
				setState(188);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(186);
					variable();
					}
					break;
				case INT_LITERAL:
				case STRING_LITERAL:
					{
					setState(187);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(FantasticParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FantasticParser.NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_block);
		int _la;
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(NEWLINE);
				setState(196);
				match(T__4);
				setState(197);
				match(NEWLINE);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << INT_TYPE) | (1L << STRING_TYPE) | (1L << IF) | (1L << FUNCTION) | (1L << WHILE) | (1L << RETURN) | (1L << PRINT) | (1L << IDENTIFIER) | (1L << INT_LITERAL) | (1L << STRING_LITERAL) | (1L << NEWLINE))) != 0)) {
					{
					{
					setState(198);
					stat();
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(204);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(NEWLINE);
				setState(206);
				stat();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00d4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\6\2(\n\2\r\2\16\2)\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3N\n\3\3\4\3\4\3\4\3\4\3\5\3\5\5\5V\n"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6i\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7s\n\7\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0089"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0094\n\r\f\r\16\r\u0097"+
		"\13\r\3\16\3\16\3\17\3\17\5\17\u009d\n\17\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\5\21\u00a6\n\21\3\21\3\21\5\21\u00aa\n\21\3\21\3\21\3\21\5\21\u00af"+
		"\n\21\3\21\3\21\7\21\u00b3\n\21\f\21\16\21\u00b6\13\21\3\22\3\22\5\22"+
		"\u00ba\n\22\3\22\3\22\3\22\5\22\u00bf\n\22\7\22\u00c1\n\22\f\22\16\22"+
		"\u00c4\13\22\3\23\3\23\3\23\3\23\7\23\u00ca\n\23\f\23\16\23\u00cd\13\23"+
		"\3\23\3\23\3\23\5\23\u00d2\n\23\3\23\2\3\30\24\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$\2\7\3\2\t\n\3\2\13\f\4\2\23\23\26\27\3\2\24\25\3\2"+
		"\30\34\2\u00de\2\'\3\2\2\2\4M\3\2\2\2\6O\3\2\2\2\bS\3\2\2\2\nh\3\2\2\2"+
		"\fj\3\2\2\2\16t\3\2\2\2\20x\3\2\2\2\22z\3\2\2\2\24|\3\2\2\2\26~\3\2\2"+
		"\2\30\u0088\3\2\2\2\32\u0098\3\2\2\2\34\u009c\3\2\2\2\36\u009e\3\2\2\2"+
		" \u00a9\3\2\2\2\"\u00b9\3\2\2\2$\u00d1\3\2\2\2&(\5\4\3\2\'&\3\2\2\2()"+
		"\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\3\3\2\2\2+,\5\f\7\2,-\7 \2\2-N\3\2\2\2"+
		"./\5\30\r\2/\60\7\"\2\2\60\61\7 \2\2\61N\3\2\2\2\62\63\5\6\4\2\63\64\7"+
		" \2\2\64N\3\2\2\2\65\66\5\b\5\2\66\67\7 \2\2\67N\3\2\2\289\5\n\6\29:\7"+
		" \2\2:N\3\2\2\2;<\5\16\b\2<=\7 \2\2=N\3\2\2\2>?\7\20\2\2?@\7\3\2\2@A\5"+
		"\30\r\2AB\7\4\2\2BC\5$\23\2CD\7 \2\2DN\3\2\2\2EF\7\22\2\2FG\7\3\2\2GH"+
		"\5\30\r\2HI\7\4\2\2IJ\7\"\2\2JK\7 \2\2KN\3\2\2\2LN\7 \2\2M+\3\2\2\2M."+
		"\3\2\2\2M\62\3\2\2\2M\65\3\2\2\2M8\3\2\2\2M;\3\2\2\2M>\3\2\2\2ME\3\2\2"+
		"\2ML\3\2\2\2N\5\3\2\2\2OP\5\20\t\2PQ\5\32\16\2QR\7\"\2\2R\7\3\2\2\2SU"+
		"\7\17\2\2TV\5\22\n\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\5\24\13\2XY\7\3\2"+
		"\2YZ\5 \21\2Z[\7\4\2\2[\\\5$\23\2\\\t\3\2\2\2]^\5\20\t\2^_\5\32\16\2_"+
		"`\7\5\2\2`a\5\30\r\2ab\7\"\2\2bi\3\2\2\2cd\5\32\16\2de\7\5\2\2ef\5\30"+
		"\r\2fg\7\"\2\2gi\3\2\2\2h]\3\2\2\2hc\3\2\2\2i\13\3\2\2\2jk\7\r\2\2kl\7"+
		"\3\2\2lm\5\30\r\2mn\7\4\2\2nr\5$\23\2op\7 \2\2pq\7\16\2\2qs\5$\23\2ro"+
		"\3\2\2\2rs\3\2\2\2s\r\3\2\2\2tu\7\21\2\2uv\5\30\r\2vw\7\"\2\2w\17\3\2"+
		"\2\2xy\t\2\2\2y\21\3\2\2\2z{\5\20\t\2{\23\3\2\2\2|}\7\35\2\2}\25\3\2\2"+
		"\2~\177\t\3\2\2\177\27\3\2\2\2\u0080\u0081\b\r\1\2\u0081\u0089\5\34\17"+
		"\2\u0082\u0089\5\32\16\2\u0083\u0089\5\36\20\2\u0084\u0085\7\3\2\2\u0085"+
		"\u0086\5\30\r\2\u0086\u0087\7\4\2\2\u0087\u0089\3\2\2\2\u0088\u0080\3"+
		"\2\2\2\u0088\u0082\3\2\2\2\u0088\u0083\3\2\2\2\u0088\u0084\3\2\2\2\u0089"+
		"\u0095\3\2\2\2\u008a\u008b\f\t\2\2\u008b\u008c\t\4\2\2\u008c\u0094\5\30"+
		"\r\n\u008d\u008e\f\b\2\2\u008e\u008f\t\5\2\2\u008f\u0094\5\30\r\t\u0090"+
		"\u0091\f\7\2\2\u0091\u0092\t\6\2\2\u0092\u0094\5\30\r\b\u0093\u008a\3"+
		"\2\2\2\u0093\u008d\3\2\2\2\u0093\u0090\3\2\2\2\u0094\u0097\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\31\3\2\2\2\u0097\u0095\3\2\2"+
		"\2\u0098\u0099\7\35\2\2\u0099\33\3\2\2\2\u009a\u009d\7\36\2\2\u009b\u009d"+
		"\7\37\2\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d\35\3\2\2\2\u009e"+
		"\u009f\5\24\13\2\u009f\u00a0\7\3\2\2\u00a0\u00a1\5\"\22\2\u00a1\u00a2"+
		"\7\4\2\2\u00a2\37\3\2\2\2\u00a3\u00a6\5\20\t\2\u00a4\u00a6\5\26\f\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\5\32"+
		"\16\2\u00a8\u00aa\3\2\2\2\u00a9\u00a5\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00b4\3\2\2\2\u00ab\u00ae\7\6\2\2\u00ac\u00af\5\20\t\2\u00ad\u00af\5"+
		"\26\f\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b1\5\32\16\2\u00b1\u00b3\3\2\2\2\u00b2\u00ab\3\2\2\2\u00b3\u00b6\3"+
		"\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5!\3\2\2\2\u00b6\u00b4"+
		"\3\2\2\2\u00b7\u00ba\5\32\16\2\u00b8\u00ba\5\34\17\2\u00b9\u00b7\3\2\2"+
		"\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00c2\3\2\2\2\u00bb\u00be"+
		"\7\6\2\2\u00bc\u00bf\5\32\16\2\u00bd\u00bf\5\34\17\2\u00be\u00bc\3\2\2"+
		"\2\u00be\u00bd\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00bb\3\2\2\2\u00c1\u00c4"+
		"\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3#\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c5\u00c6\7 \2\2\u00c6\u00c7\7\7\2\2\u00c7\u00cb\7 \2"+
		"\2\u00c8\u00ca\5\4\3\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9"+
		"\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce"+
		"\u00d2\7\b\2\2\u00cf\u00d0\7 \2\2\u00d0\u00d2\5\4\3\2\u00d1\u00c5\3\2"+
		"\2\2\u00d1\u00cf\3\2\2\2\u00d2%\3\2\2\2\24)MUhr\u0088\u0093\u0095\u009c"+
		"\u00a5\u00a9\u00ae\u00b4\u00b9\u00be\u00c2\u00cb\u00d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
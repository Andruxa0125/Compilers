// Generated from Fantastic.g4 by ANTLR 4.7.1

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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, INT_TYPE=9, 
		STRING_TYPE=10, INT_TYPE_REF=11, STRING_TYPE_REF=12, IF=13, ELIF=14, ELSE=15, 
		FUNCTION=16, WHILE=17, RETURN=18, PRINT=19, MUL=20, ADD=21, SUB=22, DIV=23, 
		PERC=24, GT=25, LT=26, LET=27, GET=28, EQ=29, IDENTIFIER=30, INT_LITERAL=31, 
		STRING_LITERAL=32, NEWLINE=33, WS=34, SEMICOLON=35;
	public static final int
		RULE_prog = 0, RULE_local_var_declarations = 1, RULE_stat = 2, RULE_var_decl_statement = 3, 
		RULE_func_decl_statement = 4, RULE_assignment_statement = 5, RULE_if_statement = 6, 
		RULE_return_statement = 7, RULE_type = 8, RULE_return_type = 9, RULE_function_name = 10, 
		RULE_ref_type = 11, RULE_expr = 12, RULE_variable = 13, RULE_literal = 14, 
		RULE_func_call = 15, RULE_params = 16, RULE_parameter = 17, RULE_args = 18, 
		RULE_block = 19;
	public static final String[] ruleNames = {
		"prog", "local_var_declarations", "stat", "var_decl_statement", "func_decl_statement", 
		"assignment_statement", "if_statement", "return_statement", "type", "return_type", 
		"function_name", "ref_type", "expr", "variable", "literal", "func_call", 
		"params", "parameter", "args", "block"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'='", "'?'", "':'", "','", "'{'", "'}'", "'int'", 
		"'string'", "'int&'", "'string&'", "'if'", "'else[ \t]+if'", "'else'", 
		"'func'", "'while'", "'return'", "'print'", "'*'", "'+'", "'-'", "'/'", 
		"'%'", "'>'", "'<'", "'<='", "'>='", "'=='", null, null, null, null, null, 
		"';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "INT_TYPE", "STRING_TYPE", 
		"INT_TYPE_REF", "STRING_TYPE_REF", "IF", "ELIF", "ELSE", "FUNCTION", "WHILE", 
		"RETURN", "PRINT", "MUL", "ADD", "SUB", "DIV", "PERC", "GT", "LT", "LET", 
		"GET", "EQ", "IDENTIFIER", "INT_LITERAL", "STRING_LITERAL", "NEWLINE", 
		"WS", "SEMICOLON"
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitProg(this);
		}
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
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				stat();
				}
				}
				setState(43); 
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

	public static class Local_var_declarationsContext extends ParserRuleContext {
		public List<Var_decl_statementContext> var_decl_statement() {
			return getRuleContexts(Var_decl_statementContext.class);
		}
		public Var_decl_statementContext var_decl_statement(int i) {
			return getRuleContext(Var_decl_statementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FantasticParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FantasticParser.NEWLINE, i);
		}
		public Local_var_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_var_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterLocal_var_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitLocal_var_declarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitLocal_var_declarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Local_var_declarationsContext local_var_declarations() throws RecognitionException {
		Local_var_declarationsContext _localctx = new Local_var_declarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_local_var_declarations);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(45);
					var_decl_statement();
					setState(46);
					match(NEWLINE);
					}
					} 
				}
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitIfStat(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterVarDeclStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitVarDeclStat(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterFuncDeclStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitFuncDeclStat(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterPrintStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitPrintStat(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterReturnStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitReturnStat(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterNewLineStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitNewLineStat(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterAssignStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitAssignStat(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterWhileStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitWhileStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitWhileStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				if_statement();
				setState(54);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new PrintStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				expr(0);
				setState(57);
				match(SEMICOLON);
				setState(58);
				match(NEWLINE);
				}
				break;
			case 3:
				_localctx = new VarDeclStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				var_decl_statement();
				setState(61);
				match(NEWLINE);
				}
				break;
			case 4:
				_localctx = new FuncDeclStatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				func_decl_statement();
				setState(64);
				match(NEWLINE);
				}
				break;
			case 5:
				_localctx = new AssignStatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				assignment_statement();
				setState(67);
				match(NEWLINE);
				}
				break;
			case 6:
				_localctx = new ReturnStatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(69);
				return_statement();
				setState(70);
				match(NEWLINE);
				}
				break;
			case 7:
				_localctx = new WhileStatContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(72);
				match(WHILE);
				setState(73);
				match(T__0);
				setState(74);
				expr(0);
				setState(75);
				match(T__1);
				setState(76);
				block();
				setState(77);
				match(NEWLINE);
				}
				break;
			case 8:
				_localctx = new PrintStatContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(79);
				match(PRINT);
				setState(80);
				match(T__0);
				setState(81);
				expr(0);
				setState(82);
				match(T__1);
				setState(83);
				match(SEMICOLON);
				setState(84);
				match(NEWLINE);
				}
				break;
			case 9:
				_localctx = new NewLineStatContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(86);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterVar_decl_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitVar_decl_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitVar_decl_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_decl_statementContext var_decl_statement() throws RecognitionException {
		Var_decl_statementContext _localctx = new Var_decl_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_decl_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			type();
			setState(90);
			variable();
			setState(91);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterFunc_decl_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitFunc_decl_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitFunc_decl_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_decl_statementContext func_decl_statement() throws RecognitionException {
		Func_decl_statementContext _localctx = new Func_decl_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_func_decl_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(FUNCTION);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT_TYPE || _la==STRING_TYPE) {
				{
				setState(94);
				return_type();
				}
			}

			setState(97);
			function_name();
			setState(98);
			match(T__0);
			setState(99);
			params();
			setState(100);
			match(T__1);
			setState(101);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterAssignmentOver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitAssignmentOver(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterDeclarationOver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitDeclarationOver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitDeclarationOver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment_statement);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case STRING_TYPE:
				_localctx = new DeclarationOverContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				type();
				setState(104);
				variable();
				setState(105);
				match(T__2);
				setState(106);
				expr(0);
				setState(107);
				match(SEMICOLON);
				}
				break;
			case IDENTIFIER:
				_localctx = new AssignmentOverContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				variable();
				setState(110);
				match(T__2);
				setState(111);
				expr(0);
				setState(112);
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
		public List<TerminalNode> IF() { return getTokens(FantasticParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(FantasticParser.IF, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FantasticParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FantasticParser.NEWLINE, i);
		}
		public List<TerminalNode> ELSE() { return getTokens(FantasticParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(FantasticParser.ELSE, i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(IF);
			setState(117);
			match(T__0);
			setState(118);
			expr(0);
			setState(119);
			match(T__1);
			setState(120);
			block();
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(121);
					match(NEWLINE);
					setState(122);
					match(ELSE);
					setState(123);
					match(IF);
					setState(124);
					match(T__0);
					setState(125);
					expr(0);
					setState(126);
					match(T__1);
					setState(127);
					block();
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(134);
				match(NEWLINE);
				setState(135);
				match(ELSE);
				setState(136);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitReturn_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(RETURN);
			setState(140);
			expr(0);
			setState(141);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitReturn_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitReturn_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_return_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterRef_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitRef_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitRef_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ref_typeContext ref_type() throws RecognitionException {
		Ref_typeContext _localctx = new Ref_typeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ref_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterCompOpeOver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitCompOpeOver(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitFuncCall(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitLit(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitVar(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitParens(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterAddSubOver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitAddSubOver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitAddSubOver(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TernaryOpeOverContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TernaryOpeOverContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterTernaryOpeOver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitTernaryOpeOver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitTernaryOpeOver(this);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterMulDivPercOver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitMulDivPercOver(this);
		}
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new LitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(152);
				literal();
				}
				break;
			case 2:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				variable();
				}
				break;
			case 3:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				func_call();
				}
				break;
			case 4:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				match(T__0);
				setState(156);
				expr(0);
				setState(157);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(176);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivPercOverContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(161);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(162);
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
						setState(163);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new AddSubOverContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(164);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(165);
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
						setState(166);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new CompOpeOverContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(167);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(168);
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
						setState(169);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new TernaryOpeOverContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(170);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(171);
						match(T__3);
						setState(172);
						expr(0);
						setState(173);
						match(T__4);
						setState(174);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterIntLitOver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitIntLitOver(this);
		}
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterStrLitOver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitStrLitOver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitStrLitOver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_literal);
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LITERAL:
				_localctx = new IntLitOverContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(INT_LITERAL);
				}
				break;
			case STRING_LITERAL:
				_localctx = new StrLitOverContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitFunc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_func_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			function_name();
			setState(188);
			match(T__0);
			setState(189);
			args();
			setState(190);
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
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT_TYPE || _la==STRING_TYPE) {
				{
				setState(192);
				parameter();
				}
			}

			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(195);
				match(T__5);
				setState(196);
				parameter();
				}
				}
				setState(201);
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

	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			type();
			setState(203);
			variable();
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(205);
				variable();
				}
				break;
			case INT_LITERAL:
			case STRING_LITERAL:
				{
				setState(206);
				literal();
				}
				break;
			case T__1:
			case T__5:
				break;
			default:
				break;
			}
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(209);
				match(T__5);
				setState(212);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(210);
					variable();
					}
					break;
				case INT_LITERAL:
				case STRING_LITERAL:
					{
					setState(211);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(218);
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
		public Local_var_declarationsContext local_var_declarations() {
			return getRuleContext(Local_var_declarationsContext.class,0);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FantasticListener ) ((FantasticListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(NEWLINE);
			setState(220);
			match(T__6);
			setState(221);
			match(NEWLINE);
			setState(222);
			local_var_declarations();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << INT_TYPE) | (1L << STRING_TYPE) | (1L << IF) | (1L << FUNCTION) | (1L << WHILE) | (1L << RETURN) | (1L << PRINT) | (1L << IDENTIFIER) | (1L << INT_LITERAL) | (1L << STRING_LITERAL) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(223);
				stat();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
			match(T__7);
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
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00ea\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\6\2,\n\2\r\2\16\2-\3\3\3\3\3\3\7\3"+
		"\63\n\3\f\3\16\3\66\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4Z\n\4\3\5\3\5\3\5\3\5\3\6\3\6\5\6b\n\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7u\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0084\n\b\f\b"+
		"\16\b\u0087\13\b\3\b\3\b\3\b\5\b\u008c\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00a2"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\7\16\u00b3\n\16\f\16\16\16\u00b6\13\16\3\17\3\17\3\20\3\20"+
		"\5\20\u00bc\n\20\3\21\3\21\3\21\3\21\3\21\3\22\5\22\u00c4\n\22\3\22\3"+
		"\22\7\22\u00c8\n\22\f\22\16\22\u00cb\13\22\3\23\3\23\3\23\3\24\3\24\5"+
		"\24\u00d2\n\24\3\24\3\24\3\24\5\24\u00d7\n\24\7\24\u00d9\n\24\f\24\16"+
		"\24\u00dc\13\24\3\25\3\25\3\25\3\25\3\25\7\25\u00e3\n\25\f\25\16\25\u00e6"+
		"\13\25\3\25\3\25\3\25\2\3\32\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(\2\7\3\2\13\f\3\2\r\16\4\2\26\26\31\32\3\2\27\30\3\2\33\37\2\u00f2"+
		"\2+\3\2\2\2\4\64\3\2\2\2\6Y\3\2\2\2\b[\3\2\2\2\n_\3\2\2\2\ft\3\2\2\2\16"+
		"v\3\2\2\2\20\u008d\3\2\2\2\22\u0091\3\2\2\2\24\u0093\3\2\2\2\26\u0095"+
		"\3\2\2\2\30\u0097\3\2\2\2\32\u00a1\3\2\2\2\34\u00b7\3\2\2\2\36\u00bb\3"+
		"\2\2\2 \u00bd\3\2\2\2\"\u00c3\3\2\2\2$\u00cc\3\2\2\2&\u00d1\3\2\2\2(\u00dd"+
		"\3\2\2\2*,\5\6\4\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\3\3\2\2\2"+
		"/\60\5\b\5\2\60\61\7#\2\2\61\63\3\2\2\2\62/\3\2\2\2\63\66\3\2\2\2\64\62"+
		"\3\2\2\2\64\65\3\2\2\2\65\5\3\2\2\2\66\64\3\2\2\2\678\5\16\b\289\7#\2"+
		"\29Z\3\2\2\2:;\5\32\16\2;<\7%\2\2<=\7#\2\2=Z\3\2\2\2>?\5\b\5\2?@\7#\2"+
		"\2@Z\3\2\2\2AB\5\n\6\2BC\7#\2\2CZ\3\2\2\2DE\5\f\7\2EF\7#\2\2FZ\3\2\2\2"+
		"GH\5\20\t\2HI\7#\2\2IZ\3\2\2\2JK\7\23\2\2KL\7\3\2\2LM\5\32\16\2MN\7\4"+
		"\2\2NO\5(\25\2OP\7#\2\2PZ\3\2\2\2QR\7\25\2\2RS\7\3\2\2ST\5\32\16\2TU\7"+
		"\4\2\2UV\7%\2\2VW\7#\2\2WZ\3\2\2\2XZ\7#\2\2Y\67\3\2\2\2Y:\3\2\2\2Y>\3"+
		"\2\2\2YA\3\2\2\2YD\3\2\2\2YG\3\2\2\2YJ\3\2\2\2YQ\3\2\2\2YX\3\2\2\2Z\7"+
		"\3\2\2\2[\\\5\22\n\2\\]\5\34\17\2]^\7%\2\2^\t\3\2\2\2_a\7\22\2\2`b\5\24"+
		"\13\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\5\26\f\2de\7\3\2\2ef\5\"\22\2fg"+
		"\7\4\2\2gh\5(\25\2h\13\3\2\2\2ij\5\22\n\2jk\5\34\17\2kl\7\5\2\2lm\5\32"+
		"\16\2mn\7%\2\2nu\3\2\2\2op\5\34\17\2pq\7\5\2\2qr\5\32\16\2rs\7%\2\2su"+
		"\3\2\2\2ti\3\2\2\2to\3\2\2\2u\r\3\2\2\2vw\7\17\2\2wx\7\3\2\2xy\5\32\16"+
		"\2yz\7\4\2\2z\u0085\5(\25\2{|\7#\2\2|}\7\21\2\2}~\7\17\2\2~\177\7\3\2"+
		"\2\177\u0080\5\32\16\2\u0080\u0081\7\4\2\2\u0081\u0082\5(\25\2\u0082\u0084"+
		"\3\2\2\2\u0083{\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u008b\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7#"+
		"\2\2\u0089\u008a\7\21\2\2\u008a\u008c\5(\25\2\u008b\u0088\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\17\3\2\2\2\u008d\u008e\7\24\2\2\u008e\u008f\5\32"+
		"\16\2\u008f\u0090\7%\2\2\u0090\21\3\2\2\2\u0091\u0092\t\2\2\2\u0092\23"+
		"\3\2\2\2\u0093\u0094\5\22\n\2\u0094\25\3\2\2\2\u0095\u0096\7 \2\2\u0096"+
		"\27\3\2\2\2\u0097\u0098\t\3\2\2\u0098\31\3\2\2\2\u0099\u009a\b\16\1\2"+
		"\u009a\u00a2\5\36\20\2\u009b\u00a2\5\34\17\2\u009c\u00a2\5 \21\2\u009d"+
		"\u009e\7\3\2\2\u009e\u009f\5\32\16\2\u009f\u00a0\7\4\2\2\u00a0\u00a2\3"+
		"\2\2\2\u00a1\u0099\3\2\2\2\u00a1\u009b\3\2\2\2\u00a1\u009c\3\2\2\2\u00a1"+
		"\u009d\3\2\2\2\u00a2\u00b4\3\2\2\2\u00a3\u00a4\f\n\2\2\u00a4\u00a5\t\4"+
		"\2\2\u00a5\u00b3\5\32\16\13\u00a6\u00a7\f\t\2\2\u00a7\u00a8\t\5\2\2\u00a8"+
		"\u00b3\5\32\16\n\u00a9\u00aa\f\b\2\2\u00aa\u00ab\t\6\2\2\u00ab\u00b3\5"+
		"\32\16\t\u00ac\u00ad\f\3\2\2\u00ad\u00ae\7\6\2\2\u00ae\u00af\5\32\16\2"+
		"\u00af\u00b0\7\7\2\2\u00b0\u00b1\5\32\16\4\u00b1\u00b3\3\2\2\2\u00b2\u00a3"+
		"\3\2\2\2\u00b2\u00a6\3\2\2\2\u00b2\u00a9\3\2\2\2\u00b2\u00ac\3\2\2\2\u00b3"+
		"\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\33\3\2\2"+
		"\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7 \2\2\u00b8\35\3\2\2\2\u00b9\u00bc"+
		"\7!\2\2\u00ba\u00bc\7\"\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc"+
		"\37\3\2\2\2\u00bd\u00be\5\26\f\2\u00be\u00bf\7\3\2\2\u00bf\u00c0\5&\24"+
		"\2\u00c0\u00c1\7\4\2\2\u00c1!\3\2\2\2\u00c2\u00c4\5$\23\2\u00c3\u00c2"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c9\3\2\2\2\u00c5\u00c6\7\b\2\2\u00c6"+
		"\u00c8\5$\23\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca#\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd"+
		"\5\22\n\2\u00cd\u00ce\5\34\17\2\u00ce%\3\2\2\2\u00cf\u00d2\5\34\17\2\u00d0"+
		"\u00d2\5\36\20\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3"+
		"\2\2\2\u00d2\u00da\3\2\2\2\u00d3\u00d6\7\b\2\2\u00d4\u00d7\5\34\17\2\u00d5"+
		"\u00d7\5\36\20\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d9\3"+
		"\2\2\2\u00d8\u00d3\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\'\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\7#\2\2"+
		"\u00de\u00df\7\t\2\2\u00df\u00e0\7#\2\2\u00e0\u00e4\5\4\3\2\u00e1\u00e3"+
		"\5\6\4\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\7\n"+
		"\2\2\u00e8)\3\2\2\2\23-\64Yat\u0085\u008b\u00a1\u00b2\u00b4\u00bb\u00c3"+
		"\u00c9\u00d1\u00d6\u00da\u00e4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
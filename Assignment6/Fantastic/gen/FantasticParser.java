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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, INT_TYPE=13, STRING_TYPE=14, INT_TYPE_REF=15, 
		STRING_TYPE_REF=16, IF=17, ELIF=18, ELSE=19, FUNCTION=20, WHILE=21, RETURN=22, 
		PRINT=23, ADDADD=24, SUBSUB=25, MUL=26, ADD=27, SUB=28, DIV=29, PERC=30, 
		GT=31, LT=32, LET=33, GET=34, EQ=35, IDENTIFIER=36, INT_LITERAL=37, STRING_LITERAL=38, 
		NEWLINE=39, WS=40, SEMICOLON=41, COMMENT=42, LINE_COMMENT=43;
	public static final int
		RULE_prog = 0, RULE_local_var_declarations = 1, RULE_stat = 2, RULE_var_decl_statement = 3, 
		RULE_func_decl_statement = 4, RULE_assignment_statement = 5, RULE_if_statement = 6, 
		RULE_return_statement = 7, RULE_type = 8, RULE_return_type = 9, RULE_function_name = 10, 
		RULE_ref_type = 11, RULE_add_sub_short = 12, RULE_add_sub_short_scalar = 13, 
		RULE_expr = 14, RULE_variable = 15, RULE_literal = 16, RULE_func_call = 17, 
		RULE_params = 18, RULE_parameter = 19, RULE_args = 20, RULE_block = 21;
	public static final String[] ruleNames = {
		"prog", "local_var_declarations", "stat", "var_decl_statement", "func_decl_statement", 
		"assignment_statement", "if_statement", "return_statement", "type", "return_type", 
		"function_name", "ref_type", "add_sub_short", "add_sub_short_scalar", 
		"expr", "variable", "literal", "func_call", "params", "parameter", "args", 
		"block"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'='", "'+='", "'-='", "'*='", "'/='", "'?'", "':'", 
		"','", "'{'", "'}'", "'int'", "'string'", "'int&'", "'string&'", "'if'", 
		"'else[ \t]+if'", "'else'", "'func'", "'while'", "'return'", "'print'", 
		"'++'", "'--'", "'*'", "'+'", "'-'", "'/'", "'%'", "'>'", "'<'", "'<='", 
		"'>='", "'=='", null, null, null, null, null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "INT_TYPE", "STRING_TYPE", "INT_TYPE_REF", "STRING_TYPE_REF", "IF", 
		"ELIF", "ELSE", "FUNCTION", "WHILE", "RETURN", "PRINT", "ADDADD", "SUBSUB", 
		"MUL", "ADD", "SUB", "DIV", "PERC", "GT", "LT", "LET", "GET", "EQ", "IDENTIFIER", 
		"INT_LITERAL", "STRING_LITERAL", "NEWLINE", "WS", "SEMICOLON", "COMMENT", 
		"LINE_COMMENT"
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
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				stat();
				}
				}
				setState(47); 
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
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(49);
					var_decl_statement();
					setState(50);
					match(NEWLINE);
					}
					} 
				}
				setState(56);
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
		public TerminalNode PRINT() { return getToken(FantasticParser.PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FantasticParser.SEMICOLON, 0); }
		public TerminalNode NEWLINE() { return getToken(FantasticParser.NEWLINE, 0); }
		public PrintStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitPrintStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStatContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FantasticParser.SEMICOLON, 0); }
		public TerminalNode NEWLINE() { return getToken(FantasticParser.NEWLINE, 0); }
		public ExprStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitExprStat(this);
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
	public static class ShortAddSubContext extends StatContext {
		public Add_sub_shortContext add_sub_short() {
			return getRuleContext(Add_sub_shortContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(FantasticParser.NEWLINE, 0); }
		public ShortAddSubContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitShortAddSub(this);
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
	public static class ShortAddSubMulDivScalarContext extends StatContext {
		public Add_sub_short_scalarContext add_sub_short_scalar() {
			return getRuleContext(Add_sub_short_scalarContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(FantasticParser.NEWLINE, 0); }
		public ShortAddSubMulDivScalarContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitShortAddSubMulDivScalar(this);
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
		enterRule(_localctx, 4, RULE_stat);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				if_statement();
				setState(58);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new ExprStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				expr(0);
				setState(61);
				match(SEMICOLON);
				setState(62);
				match(NEWLINE);
				}
				break;
			case 3:
				_localctx = new VarDeclStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				var_decl_statement();
				setState(65);
				match(NEWLINE);
				}
				break;
			case 4:
				_localctx = new FuncDeclStatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				func_decl_statement();
				setState(68);
				match(NEWLINE);
				}
				break;
			case 5:
				_localctx = new AssignStatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				assignment_statement();
				setState(71);
				match(NEWLINE);
				}
				break;
			case 6:
				_localctx = new ReturnStatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(73);
				return_statement();
				setState(74);
				match(NEWLINE);
				}
				break;
			case 7:
				_localctx = new WhileStatContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(76);
				match(WHILE);
				setState(77);
				match(T__0);
				setState(78);
				expr(0);
				setState(79);
				match(T__1);
				setState(80);
				block();
				setState(81);
				match(NEWLINE);
				}
				break;
			case 8:
				_localctx = new PrintStatContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(83);
				match(PRINT);
				setState(84);
				match(T__0);
				setState(85);
				expr(0);
				setState(86);
				match(T__1);
				setState(87);
				match(SEMICOLON);
				setState(88);
				match(NEWLINE);
				}
				break;
			case 9:
				_localctx = new ShortAddSubContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(90);
				add_sub_short();
				setState(91);
				match(NEWLINE);
				}
				break;
			case 10:
				_localctx = new ShortAddSubMulDivScalarContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(93);
				add_sub_short_scalar();
				setState(94);
				match(NEWLINE);
				}
				break;
			case 11:
				_localctx = new NewLineStatContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(96);
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
		enterRule(_localctx, 6, RULE_var_decl_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			type();
			setState(100);
			variable();
			setState(101);
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
		enterRule(_localctx, 8, RULE_func_decl_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(FUNCTION);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT_TYPE || _la==STRING_TYPE) {
				{
				setState(104);
				return_type();
				}
			}

			setState(107);
			function_name();
			setState(108);
			match(T__0);
			setState(109);
			params();
			setState(110);
			match(T__1);
			setState(111);
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
		enterRule(_localctx, 10, RULE_assignment_statement);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case STRING_TYPE:
				_localctx = new DeclarationOverContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				type();
				setState(114);
				variable();
				setState(115);
				match(T__2);
				setState(116);
				expr(0);
				setState(117);
				match(SEMICOLON);
				}
				break;
			case IDENTIFIER:
				_localctx = new AssignmentOverContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				variable();
				setState(120);
				match(T__2);
				setState(121);
				expr(0);
				setState(122);
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
			setState(126);
			match(IF);
			setState(127);
			match(T__0);
			setState(128);
			expr(0);
			setState(129);
			match(T__1);
			setState(130);
			block();
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(131);
					match(NEWLINE);
					setState(132);
					match(ELSE);
					setState(133);
					match(IF);
					setState(134);
					match(T__0);
					setState(135);
					expr(0);
					setState(136);
					match(T__1);
					setState(137);
					block();
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(144);
				match(NEWLINE);
				setState(145);
				match(ELSE);
				setState(146);
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
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
	 
		public Return_statementContext() { }
		public void copyFrom(Return_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnOverContext extends Return_statementContext {
		public TerminalNode RETURN() { return getToken(FantasticParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FantasticParser.SEMICOLON, 0); }
		public ReturnOverContext(Return_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitReturnOver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_return_statement);
		try {
			_localctx = new ReturnOverContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(RETURN);
			setState(150);
			expr(0);
			setState(151);
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
		enterRule(_localctx, 16, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
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
		enterRule(_localctx, 18, RULE_return_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
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
		enterRule(_localctx, 20, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
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
		enterRule(_localctx, 22, RULE_ref_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
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

	public static class Add_sub_shortContext extends ParserRuleContext {
		public Token op;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FantasticParser.SEMICOLON, 0); }
		public Add_sub_shortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_sub_short; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitAdd_sub_short(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_sub_shortContext add_sub_short() throws RecognitionException {
		Add_sub_shortContext _localctx = new Add_sub_shortContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_add_sub_short);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			variable();
			setState(162);
			((Add_sub_shortContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ADDADD || _la==SUBSUB) ) {
				((Add_sub_shortContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(163);
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

	public static class Add_sub_short_scalarContext extends ParserRuleContext {
		public Token op;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FantasticParser.SEMICOLON, 0); }
		public Add_sub_short_scalarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_sub_short_scalar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitAdd_sub_short_scalar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_sub_short_scalarContext add_sub_short_scalar() throws RecognitionException {
		Add_sub_short_scalarContext _localctx = new Add_sub_short_scalarContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_add_sub_short_scalar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			variable();
			setState(166);
			((Add_sub_short_scalarContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
				((Add_sub_short_scalarContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(167);
			expr(0);
			setState(168);
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
	public static class TernaryOpeOverContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TernaryOpeOverContext(ExprContext ctx) { copyFrom(ctx); }
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new LitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(171);
				literal();
				}
				break;
			case 2:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				variable();
				}
				break;
			case 3:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				func_call();
				}
				break;
			case 4:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(T__0);
				setState(175);
				expr(0);
				setState(176);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(195);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivPercOverContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(180);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(181);
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
						setState(182);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new AddSubOverContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(183);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(184);
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
						setState(185);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new CompOpeOverContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(186);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(187);
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
						setState(188);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new TernaryOpeOverContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(189);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(190);
						match(T__7);
						setState(191);
						expr(0);
						setState(192);
						match(T__8);
						setState(193);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(199);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
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
		enterRule(_localctx, 32, RULE_literal);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LITERAL:
				_localctx = new IntLitOverContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(INT_LITERAL);
				}
				break;
			case STRING_LITERAL:
				_localctx = new StrLitOverContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
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
		enterRule(_localctx, 34, RULE_func_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			function_name();
			setState(207);
			match(T__0);
			setState(208);
			args();
			setState(209);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT_TYPE || _la==STRING_TYPE) {
				{
				setState(211);
				parameter();
				}
			}

			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(214);
				match(T__9);
				setState(215);
				parameter();
				}
				}
				setState(220);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			type();
			setState(222);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(224);
				variable();
				}
				break;
			case INT_LITERAL:
			case STRING_LITERAL:
				{
				setState(225);
				literal();
				}
				break;
			case T__1:
			case T__9:
				break;
			default:
				break;
			}
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(228);
				match(T__9);
				setState(231);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(229);
					variable();
					}
					break;
				case INT_LITERAL:
				case STRING_LITERAL:
					{
					setState(230);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(237);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FantasticVisitor ) return ((FantasticVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(NEWLINE);
			setState(239);
			match(T__10);
			setState(240);
			match(NEWLINE);
			setState(241);
			local_var_declarations();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << INT_TYPE) | (1L << STRING_TYPE) | (1L << IF) | (1L << FUNCTION) | (1L << WHILE) | (1L << RETURN) | (1L << PRINT) | (1L << IDENTIFIER) | (1L << INT_LITERAL) | (1L << STRING_LITERAL) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(242);
				stat();
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
			match(T__11);
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
		case 14:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u00fd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\6\2\60\n\2\r\2"+
		"\16\2\61\3\3\3\3\3\3\7\3\67\n\3\f\3\16\3:\13\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"d\n\4\3\5\3\5\3\5\3\5\3\6\3\6\5\6l\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\177\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u008e\n\b\f\b\16\b\u0091\13\b\3\b\3"+
		"\b\3\b\5\b\u0096\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00b5\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00c6\n\20\f\20\16\20\u00c9\13"+
		"\20\3\21\3\21\3\22\3\22\5\22\u00cf\n\22\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\5\24\u00d7\n\24\3\24\3\24\7\24\u00db\n\24\f\24\16\24\u00de\13\24\3\25"+
		"\3\25\3\25\3\26\3\26\5\26\u00e5\n\26\3\26\3\26\3\26\5\26\u00ea\n\26\7"+
		"\26\u00ec\n\26\f\26\16\26\u00ef\13\26\3\27\3\27\3\27\3\27\3\27\7\27\u00f6"+
		"\n\27\f\27\16\27\u00f9\13\27\3\27\3\27\3\27\2\3\36\30\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,\2\t\3\2\17\20\3\2\21\22\3\2\32\33\3\2\6"+
		"\t\4\2\34\34\37 \3\2\35\36\3\2!%\2\u0105\2/\3\2\2\2\48\3\2\2\2\6c\3\2"+
		"\2\2\be\3\2\2\2\ni\3\2\2\2\f~\3\2\2\2\16\u0080\3\2\2\2\20\u0097\3\2\2"+
		"\2\22\u009b\3\2\2\2\24\u009d\3\2\2\2\26\u009f\3\2\2\2\30\u00a1\3\2\2\2"+
		"\32\u00a3\3\2\2\2\34\u00a7\3\2\2\2\36\u00b4\3\2\2\2 \u00ca\3\2\2\2\"\u00ce"+
		"\3\2\2\2$\u00d0\3\2\2\2&\u00d6\3\2\2\2(\u00df\3\2\2\2*\u00e4\3\2\2\2,"+
		"\u00f0\3\2\2\2.\60\5\6\4\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3"+
		"\2\2\2\62\3\3\2\2\2\63\64\5\b\5\2\64\65\7)\2\2\65\67\3\2\2\2\66\63\3\2"+
		"\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29\5\3\2\2\2:8\3\2\2\2;<\5\16\b\2"+
		"<=\7)\2\2=d\3\2\2\2>?\5\36\20\2?@\7+\2\2@A\7)\2\2Ad\3\2\2\2BC\5\b\5\2"+
		"CD\7)\2\2Dd\3\2\2\2EF\5\n\6\2FG\7)\2\2Gd\3\2\2\2HI\5\f\7\2IJ\7)\2\2Jd"+
		"\3\2\2\2KL\5\20\t\2LM\7)\2\2Md\3\2\2\2NO\7\27\2\2OP\7\3\2\2PQ\5\36\20"+
		"\2QR\7\4\2\2RS\5,\27\2ST\7)\2\2Td\3\2\2\2UV\7\31\2\2VW\7\3\2\2WX\5\36"+
		"\20\2XY\7\4\2\2YZ\7+\2\2Z[\7)\2\2[d\3\2\2\2\\]\5\32\16\2]^\7)\2\2^d\3"+
		"\2\2\2_`\5\34\17\2`a\7)\2\2ad\3\2\2\2bd\7)\2\2c;\3\2\2\2c>\3\2\2\2cB\3"+
		"\2\2\2cE\3\2\2\2cH\3\2\2\2cK\3\2\2\2cN\3\2\2\2cU\3\2\2\2c\\\3\2\2\2c_"+
		"\3\2\2\2cb\3\2\2\2d\7\3\2\2\2ef\5\22\n\2fg\5 \21\2gh\7+\2\2h\t\3\2\2\2"+
		"ik\7\26\2\2jl\5\24\13\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\5\26\f\2no\7\3"+
		"\2\2op\5&\24\2pq\7\4\2\2qr\5,\27\2r\13\3\2\2\2st\5\22\n\2tu\5 \21\2uv"+
		"\7\5\2\2vw\5\36\20\2wx\7+\2\2x\177\3\2\2\2yz\5 \21\2z{\7\5\2\2{|\5\36"+
		"\20\2|}\7+\2\2}\177\3\2\2\2~s\3\2\2\2~y\3\2\2\2\177\r\3\2\2\2\u0080\u0081"+
		"\7\23\2\2\u0081\u0082\7\3\2\2\u0082\u0083\5\36\20\2\u0083\u0084\7\4\2"+
		"\2\u0084\u008f\5,\27\2\u0085\u0086\7)\2\2\u0086\u0087\7\25\2\2\u0087\u0088"+
		"\7\23\2\2\u0088\u0089\7\3\2\2\u0089\u008a\5\36\20\2\u008a\u008b\7\4\2"+
		"\2\u008b\u008c\5,\27\2\u008c\u008e\3\2\2\2\u008d\u0085\3\2\2\2\u008e\u0091"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0095\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0093\7)\2\2\u0093\u0094\7\25\2\2\u0094\u0096\5,"+
		"\27\2\u0095\u0092\3\2\2\2\u0095\u0096\3\2\2\2\u0096\17\3\2\2\2\u0097\u0098"+
		"\7\30\2\2\u0098\u0099\5\36\20\2\u0099\u009a\7+\2\2\u009a\21\3\2\2\2\u009b"+
		"\u009c\t\2\2\2\u009c\23\3\2\2\2\u009d\u009e\5\22\n\2\u009e\25\3\2\2\2"+
		"\u009f\u00a0\7&\2\2\u00a0\27\3\2\2\2\u00a1\u00a2\t\3\2\2\u00a2\31\3\2"+
		"\2\2\u00a3\u00a4\5 \21\2\u00a4\u00a5\t\4\2\2\u00a5\u00a6\7+\2\2\u00a6"+
		"\33\3\2\2\2\u00a7\u00a8\5 \21\2\u00a8\u00a9\t\5\2\2\u00a9\u00aa\5\36\20"+
		"\2\u00aa\u00ab\7+\2\2\u00ab\35\3\2\2\2\u00ac\u00ad\b\20\1\2\u00ad\u00b5"+
		"\5\"\22\2\u00ae\u00b5\5 \21\2\u00af\u00b5\5$\23\2\u00b0\u00b1\7\3\2\2"+
		"\u00b1\u00b2\5\36\20\2\u00b2\u00b3\7\4\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00ac"+
		"\3\2\2\2\u00b4\u00ae\3\2\2\2\u00b4\u00af\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b5"+
		"\u00c7\3\2\2\2\u00b6\u00b7\f\n\2\2\u00b7\u00b8\t\6\2\2\u00b8\u00c6\5\36"+
		"\20\13\u00b9\u00ba\f\t\2\2\u00ba\u00bb\t\7\2\2\u00bb\u00c6\5\36\20\n\u00bc"+
		"\u00bd\f\b\2\2\u00bd\u00be\t\b\2\2\u00be\u00c6\5\36\20\t\u00bf\u00c0\f"+
		"\3\2\2\u00c0\u00c1\7\n\2\2\u00c1\u00c2\5\36\20\2\u00c2\u00c3\7\13\2\2"+
		"\u00c3\u00c4\5\36\20\4\u00c4\u00c6\3\2\2\2\u00c5\u00b6\3\2\2\2\u00c5\u00b9"+
		"\3\2\2\2\u00c5\u00bc\3\2\2\2\u00c5\u00bf\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\37\3\2\2\2\u00c9\u00c7\3\2\2"+
		"\2\u00ca\u00cb\7&\2\2\u00cb!\3\2\2\2\u00cc\u00cf\7\'\2\2\u00cd\u00cf\7"+
		"(\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf#\3\2\2\2\u00d0\u00d1"+
		"\5\26\f\2\u00d1\u00d2\7\3\2\2\u00d2\u00d3\5*\26\2\u00d3\u00d4\7\4\2\2"+
		"\u00d4%\3\2\2\2\u00d5\u00d7\5(\25\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3"+
		"\2\2\2\u00d7\u00dc\3\2\2\2\u00d8\u00d9\7\f\2\2\u00d9\u00db\5(\25\2\u00da"+
		"\u00d8\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\'\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\5\22\n\2\u00e0\u00e1"+
		"\5 \21\2\u00e1)\3\2\2\2\u00e2\u00e5\5 \21\2\u00e3\u00e5\5\"\22\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00ed\3\2"+
		"\2\2\u00e6\u00e9\7\f\2\2\u00e7\u00ea\5 \21\2\u00e8\u00ea\5\"\22\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e6\3\2"+
		"\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"+\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\7)\2\2\u00f1\u00f2\7\r\2\2\u00f2"+
		"\u00f3\7)\2\2\u00f3\u00f7\5\4\3\2\u00f4\u00f6\5\6\4\2\u00f5\u00f4\3\2"+
		"\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7\16\2\2\u00fb-\3\2\2\2"+
		"\23\618ck~\u008f\u0095\u00b4\u00c5\u00c7\u00ce\u00d6\u00dc\u00e4\u00e9"+
		"\u00ed\u00f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
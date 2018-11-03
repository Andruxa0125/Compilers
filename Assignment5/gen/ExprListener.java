// Generated from /Users/izzymoriguchi/Dropbox/SJSU/CS_Courses/CS153/Assignments/Assignment2/Compilers/Assignment5/Expr.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(ExprParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(ExprParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#var_decl_statement}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl_statement(ExprParser.Var_decl_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#var_decl_statement}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl_statement(ExprParser.Var_decl_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#func_decl_statement}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decl_statement(ExprParser.Func_decl_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#func_decl_statement}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decl_statement(ExprParser.Func_decl_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(ExprParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(ExprParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(ExprParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(ExprParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(ExprParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(ExprParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ExprParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ExprParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(ExprParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(ExprParser.Return_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(ExprParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(ExprParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#ref_type}.
	 * @param ctx the parse tree
	 */
	void enterRef_type(ExprParser.Ref_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#ref_type}.
	 * @param ctx the parse tree
	 */
	void exitRef_type(ExprParser.Ref_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExprParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ExprParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ExprParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ExprParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ExprParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(ExprParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(ExprParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(ExprParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(ExprParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(ExprParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(ExprParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ExprParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ExprParser.BlockContext ctx);
}
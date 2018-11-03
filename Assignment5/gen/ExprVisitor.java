// Generated from /Users/izzymoriguchi/Dropbox/SJSU/CS_Courses/CS153/Assignments/Assignment2/Compilers/Assignment5/Expr.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ExprParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(ExprParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#var_decl_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl_statement(ExprParser.Var_decl_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#func_decl_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_decl_statement(ExprParser.Func_decl_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(ExprParser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(ExprParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(ExprParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ExprParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#return_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_type(ExprParser.Return_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(ExprParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#ref_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef_type(ExprParser.Ref_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ExprParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(ExprParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ExprParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(ExprParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(ExprParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(ExprParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExprParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ExprParser.BlockContext ctx);
}
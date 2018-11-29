// Generated from /Users/izzymoriguchi/Dropbox/SJSU/CS_Courses/CS153/Assignments/Assignment2/Compilers/Assignment6/Fantastic/Fantastic.g4 by ANTLR 4.7

    import wci.intermediate.TypeSpec;
    //import wci.intermediate.symtabimpl.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FantasticParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FantasticVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FantasticParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(FantasticParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link FantasticParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(FantasticParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStat}
	 * labeled alternative in {@link FantasticParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStat(FantasticParser.PrintStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDeclStat}
	 * labeled alternative in {@link FantasticParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclStat(FantasticParser.VarDeclStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcDeclStat}
	 * labeled alternative in {@link FantasticParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDeclStat(FantasticParser.FuncDeclStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignStat}
	 * labeled alternative in {@link FantasticParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStat(FantasticParser.AssignStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStat}
	 * labeled alternative in {@link FantasticParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStat(FantasticParser.ReturnStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link FantasticParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStat(FantasticParser.WhileStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newLineStat}
	 * labeled alternative in {@link FantasticParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewLineStat(FantasticParser.NewLineStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link FantasticParser#var_decl_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl_statement(FantasticParser.Var_decl_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FantasticParser#func_decl_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_decl_statement(FantasticParser.Func_decl_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationOver}
	 * labeled alternative in {@link FantasticParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationOver(FantasticParser.DeclarationOverContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentOver}
	 * labeled alternative in {@link FantasticParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOver(FantasticParser.AssignmentOverContext ctx);
	/**
	 * Visit a parse tree produced by {@link FantasticParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(FantasticParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FantasticParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(FantasticParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FantasticParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(FantasticParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FantasticParser#return_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_type(FantasticParser.Return_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FantasticParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(FantasticParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link FantasticParser#ref_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef_type(FantasticParser.Ref_typeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompOpeOver}
	 * labeled alternative in {@link FantasticParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOpeOver(FantasticParser.CompOpeOverContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link FantasticParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(FantasticParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lit}
	 * labeled alternative in {@link FantasticParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLit(FantasticParser.LitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link FantasticParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(FantasticParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link FantasticParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(FantasticParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSubOver}
	 * labeled alternative in {@link FantasticParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubOver(FantasticParser.AddSubOverContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivPercOver}
	 * labeled alternative in {@link FantasticParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivPercOver(FantasticParser.MulDivPercOverContext ctx);
	/**
	 * Visit a parse tree produced by {@link FantasticParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(FantasticParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntLitOver}
	 * labeled alternative in {@link FantasticParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLitOver(FantasticParser.IntLitOverContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrLitOver}
	 * labeled alternative in {@link FantasticParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrLitOver(FantasticParser.StrLitOverContext ctx);
	/**
	 * Visit a parse tree produced by {@link FantasticParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(FantasticParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link FantasticParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(FantasticParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FantasticParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(FantasticParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FantasticParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(FantasticParser.BlockContext ctx);
}
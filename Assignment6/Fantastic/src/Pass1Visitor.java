import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import wci.intermediate.*;
import wci.intermediate.symtabimpl.*;
import wci.util.*;

import static wci.intermediate.symtabimpl.SymTabKeyImpl.*;
import static wci.intermediate.symtabimpl.DefinitionImpl.*;

public class Pass1Visitor extends FantasticBaseVisitor<Integer>
{
    private SymTabStack symTabStack;
    private SymTabEntry programId;
    private ArrayList<SymTabEntry> variableIdList;
    private PrintWriter jFile;
    
    public Pass1Visitor()
    {
        // Create and initialize the symbol table stack.
        symTabStack = SymTabFactory.createSymTabStack();
        Predefined.initialize(symTabStack);
    }
    
    public PrintWriter getAssemblyFile() { return jFile; }

    @Override
    public Integer visitIfStat(FantasticParser.IfStatContext ctx) {
        return super.visitIfStat(ctx);
    }

    // TODO: Need to override some of the following methods (refer to Pc2's Pass1Visitor)
    @Override
    public Integer visitPrintStat(FantasticParser.PrintStatContext ctx) {
        return super.visitPrintStat(ctx);
    }

    @Override
    public Integer visitVarDeclStat(FantasticParser.VarDeclStatContext ctx) {
        return super.visitVarDeclStat(ctx);
    }

    @Override
    public Integer visitFuncDeclStat(FantasticParser.FuncDeclStatContext ctx) {
        return super.visitFuncDeclStat(ctx);
    }

    @Override
    public Integer visitAssignStat(FantasticParser.AssignStatContext ctx) {
        return super.visitAssignStat(ctx);
    }

    @Override
    public Integer visitReturnStat(FantasticParser.ReturnStatContext ctx) {
        return super.visitReturnStat(ctx);
    }

    @Override
    public Integer visitWhileStat(FantasticParser.WhileStatContext ctx) {
        return super.visitWhileStat(ctx);
    }

    @Override
    public Integer visitNewLineStat(FantasticParser.NewLineStatContext ctx) {
        return super.visitNewLineStat(ctx);
    }

    @Override
    public Integer visitVar_decl_statement(FantasticParser.Var_decl_statementContext ctx) {
        return super.visitVar_decl_statement(ctx);
    }

    @Override
    public Integer visitFunc_decl_statement(FantasticParser.Func_decl_statementContext ctx) {
        return super.visitFunc_decl_statement(ctx);
    }

    @Override
    public Integer visitDeclarationOver(FantasticParser.DeclarationOverContext ctx) {
        return super.visitDeclarationOver(ctx);
    }

    @Override
    public Integer visitAssignmentOver(FantasticParser.AssignmentOverContext ctx) {
        return super.visitAssignmentOver(ctx);
    }

    @Override
    public Integer visitIf_statement(FantasticParser.If_statementContext ctx) {
        return super.visitIf_statement(ctx);
    }

    @Override
    public Integer visitReturn_statement(FantasticParser.Return_statementContext ctx) {
        return super.visitReturn_statement(ctx);
    }

    @Override
    public Integer visitType(FantasticParser.TypeContext ctx) {
        return super.visitType(ctx);
    }

    @Override
    public Integer visitReturn_type(FantasticParser.Return_typeContext ctx) {
        return super.visitReturn_type(ctx);
    }

    @Override
    public Integer visitFunction_name(FantasticParser.Function_nameContext ctx) {
        return super.visitFunction_name(ctx);
    }

    @Override
    public Integer visitRef_type(FantasticParser.Ref_typeContext ctx) {
        return super.visitRef_type(ctx);
    }

    @Override
    public Integer visitCompOpeOver(FantasticParser.CompOpeOverContext ctx) {
        return super.visitCompOpeOver(ctx);
    }

    @Override
    public Integer visitFuncCall(FantasticParser.FuncCallContext ctx) {
        return super.visitFuncCall(ctx);
    }

    @Override
    public Integer visitLit(FantasticParser.LitContext ctx) {
        return super.visitLit(ctx);
    }

    @Override
    public Integer visitVar(FantasticParser.VarContext ctx) {
        return super.visitVar(ctx);
    }

    @Override
    public Integer visitParens(FantasticParser.ParensContext ctx) {
        return super.visitParens(ctx);
    }

    @Override
    public Integer visitAddSubOver(FantasticParser.AddSubOverContext ctx) {
        return super.visitAddSubOver(ctx);
    }

    @Override
    public Integer visitMulDivPercOver(FantasticParser.MulDivPercOverContext ctx) {
        return super.visitMulDivPercOver(ctx);
    }

    @Override
    public Integer visitVariable(FantasticParser.VariableContext ctx) {
        return super.visitVariable(ctx);
    }

    @Override
    public Integer visitIntLitOver(FantasticParser.IntLitOverContext ctx) {
        return super.visitIntLitOver(ctx);
    }

    @Override
    public Integer visitStrLitOver(FantasticParser.StrLitOverContext ctx) {
        return super.visitStrLitOver(ctx);
    }

    @Override
    public Integer visitFunc_call(FantasticParser.Func_callContext ctx) {
        return super.visitFunc_call(ctx);
    }

    @Override
    public Integer visitParams(FantasticParser.ParamsContext ctx) {
        return super.visitParams(ctx);
    }

    @Override
    public Integer visitArgs(FantasticParser.ArgsContext ctx) {
        return super.visitArgs(ctx);
    }

    @Override
    public Integer visitBlock(FantasticParser.BlockContext ctx) {
        return super.visitBlock(ctx);
    }
}
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
    //private ArrayList<SymTabEntry> variableIdList;
    private PrintWriter jFile;
    
    public Pass1Visitor(String programName)
    {
        // Create and initialize the symbol table stack.
        symTabStack = SymTabFactory.createSymTabStack();
        Predefined.initialize(symTabStack);

        // TODO: not sure if the following 4 lines are needed
        programId = symTabStack.enterLocal(programName);
        programId.setDefinition(DefinitionImpl.PROGRAM);
        programId.setAttribute(ROUTINE_SYMTAB, symTabStack.push());
        symTabStack.setProgramId(programId);

        // Create the assembly output file.
        try {
            jFile = new PrintWriter(new FileWriter(programName + ".j"));
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        // Emit the program header.
        jFile.println(".class public " + programName);
        jFile.println(".super java/lang/Object");

        // Emit the RunTimer and PascalTextIn fields.
        jFile.println();
        jFile.println(".field private static _runTimer LRunTimer;");
        jFile.println(".field private static _standardIn LPascalTextIn;");
    }
    
    public PrintWriter getAssemblyFile() { return jFile; }


    // TODO: Need to override some of the following methods (refer to Pc2's Pass1Visitor)


    @Override
    public Integer visitIfStat(FantasticParser.IfStatContext ctx) {
        return super.visitIfStat(ctx);
    }


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
    /**
     * Note: Equivalent as visitVarDeclStat
     *
     * Example:
     * int a;
     * */
    public Integer visitVar_decl_statement(FantasticParser.Var_decl_statementContext ctx) {
        jFile.println("\n; " + ctx.getText() + "\n");  // e.g. printing "; int a;" for a comment

        // get variable name (identifier)
        String varName = ctx.variable().getText();
        SymTabEntry variableId = symTabStack.enterLocal(varName);
        variableId.setDefinition(VARIABLE);

        // get type info
        String typeName = ctx.type().getText(); // should be int or string for now
        TypeSpec type;
        String   typeIndicator;

        if (typeName.equalsIgnoreCase("int")) {
            type = Predefined.integerType;
            typeIndicator = "I";
        }
        else if (typeName.equalsIgnoreCase("string")) {
            type = Predefined.stringType;
            typeIndicator = "Ljava/lang/String;";
        }
        else { // TODO: figure out what we want to do here
            type = null;
            typeIndicator = "?";
        }
        variableId.setTypeSpec(type);
        jFile.println(".field private static " + varName + " " + typeIndicator);

        return visitChildren(ctx);
    }

    @Override
    public Integer visitFunc_decl_statement(FantasticParser.Func_decl_statementContext ctx) {
        return super.visitFunc_decl_statement(ctx);
    }

    @Override
    /**
     * Example:
     * int a = 5;
     * */
    public Integer visitDeclarationOver(FantasticParser.DeclarationOverContext ctx) {
        jFile.println("\n; " + ctx.getText() + "\n");  // e.g. printing "; iint a = 5;" for a comment

        // get variable name (identifier)
        String varName = ctx.variable().getText();
        SymTabEntry variableId = symTabStack.enterLocal(varName);
        variableId.setDefinition(VARIABLE);

        // get type info
        String typeName = ctx.type().getText(); // should be int or string for now
        TypeSpec type;
        String   typeIndicator;

        if (typeName.equalsIgnoreCase("int")) {
            type = Predefined.integerType;
            typeIndicator = "I";
        }
        else if (typeName.equalsIgnoreCase("string")) {
            type = Predefined.stringType;
            typeIndicator = "Ljava/lang/String;";
        }
        else { // TODO: figure out what we want to do here
            type = null;
            typeIndicator = "?";
        }

        variableId.setTypeSpec(type);
        jFile.println(".field private static " + varName + " " + typeIndicator);


        return visitChildren(ctx);
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
        Integer value = visit(ctx.literal());
        ctx.typeSpec = ctx.literal().typeSpec;
        return value;
    }

    @Override
    public Integer visitVar(FantasticParser.VarContext ctx) {
        String variableName = ctx.variable().IDENTIFIER().toString();
        SymTabEntry variableId = symTabStack.lookup(variableName);

        ctx.typeSpec = variableId.getTypeSpec();
        return visitChildren(ctx);
        // return super.visitVar(ctx);
    }

    @Override
    public Integer visitParens(FantasticParser.ParensContext ctx) {
        return super.visitParens(ctx);
    }

    @Override
    public Integer visitAddSubOver(FantasticParser.AddSubOverContext ctx) {
        Integer value = visitChildren(ctx);

        TypeSpec type1 = ctx.expr(0).typeSpec;
        TypeSpec type2 = ctx.expr(1).typeSpec;

        boolean integerMode = (type1 == Predefined.integerType) && (type2 == Predefined.integerType);

        ctx.typeSpec = integerMode ? Predefined.integerType : null;

        return value;
    }

    @Override
    public Integer visitMulDivPercOver(FantasticParser.MulDivPercOverContext ctx) {
        Integer value = visitChildren(ctx);

        TypeSpec type1 = ctx.expr(0).typeSpec;
        TypeSpec type2 = ctx.expr(1).typeSpec;

        boolean integerMode = (type1 == Predefined.integerType) && (type2 == Predefined.integerType);

        ctx.typeSpec = integerMode ? Predefined.integerType : null;

        return value;
    }

    @Override
    public Integer visitIntLitOver(FantasticParser.IntLitOverContext ctx) {
        ctx.typeSpec = Predefined.integerType;
        return visitChildren(ctx);
    }

    @Override
    public Integer visitStrLitOver(FantasticParser.StrLitOverContext ctx) {
        ctx.typeSpec = Predefined.stringType;
        return visitChildren(ctx);
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
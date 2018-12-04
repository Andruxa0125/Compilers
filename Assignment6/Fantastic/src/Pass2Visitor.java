import java.io.PrintWriter;

import wci.intermediate.*;
import wci.intermediate.symtabimpl.*;

public class Pass2Visitor extends FantasticBaseVisitor<Integer>
{
    String programName;
    private PrintWriter jFile;
    private static int labelCount = 0;
    
    private static String generateLabel(){
    	labelCount++;
    	return "LABEL" + String.valueOf(labelCount - 1);
    }
    public Pass2Visitor(PrintWriter jFile, String programName)
    {
        this.jFile = jFile;
        this.programName = programName;
    }

    // TODO: Override some of the following methods (not all)

    @Override
    public Integer visitProg(FantasticParser.ProgContext ctx) {
        // Emit the main program header.
        jFile.println("\n; === Emit the main method header. === \n");
        jFile.println(".method public static main([Ljava/lang/String;)V");
        jFile.println("\n; === Emit the main method prologue. === \n");
        jFile.println("\tnew RunTimer");
        jFile.println("\tdup");
        jFile.println("\tinvokenonvirtual RunTimer/<init>()V");
        jFile.println("\tputstatic        " + programName + "/_runTimer LRunTimer;");
        jFile.println("\tnew PascalTextIn");
        jFile.println("\tdup");
        jFile.println("\tinvokenonvirtual PascalTextIn/<init>()V");
        jFile.println("\tputstatic        " + programName + "/_standardIn LPascalTextIn;");

        jFile.println("\n; === Emit the code for statements in the main program. === \n");
        Integer value = visitChildren(ctx);

        // Emit the main program epilogue.
        jFile.println("\n; === Emit the main program epilogue. === \n");
        jFile.println();
        jFile.println("\tgetstatic     " + programName + "/_runTimer LRunTimer;");
        jFile.println("\tinvokevirtual RunTimer.printElapsedTime()V");
        jFile.println();
        jFile.println("\treturn");
        jFile.println();
        jFile.println(".limit locals 16");
        jFile.println(".limit stack 16");
        jFile.println(".end method");

        jFile.close();
        return value;
    }

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
    	String startLabel = generateLabel();						
    	jFile.println(startLabel + ":");
    	Integer value = visit(ctx.expr());					//Get condition value by visiting the expr child
    	String exitLabel = generateLabel();
    	jFile.println("\tifne " + exitLabel);				//check condition; 1 = exit loop, 0 = execute block
    	visit(ctx.block());									
    	jFile.println("\tgoto " +  startLabel);				//jump back to the beginning of the loop
    	jFile.println(exitLabel + ":");						//create exitloop
        return value;
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
    public Integer visitFunc_decl_statement(FantasticParser.Func_decl_statementContext ctx) {  // todo
        return super.visitFunc_decl_statement(ctx);
    }

    @Override
    public Integer visitDeclarationOver(FantasticParser.DeclarationOverContext ctx) {
        Integer value = visit(ctx.expr());

        String typeIndicator = (ctx.expr().typeSpec == Predefined.integerType) ? "I"
                : (ctx.expr().typeSpec == Predefined.stringType)    ? "Ljava/lang/String;"
                :                                    "?";

        // Emit a field put instruction.
        jFile.println("\tputstatic\t" + programName
                +  "/" + ctx.variable().IDENTIFIER().toString()
                + " " + typeIndicator);

        return value;
    }

    @Override // TODO
    public Integer visitAssignmentOver(FantasticParser.AssignmentOverContext ctx) {
        Integer value = visit(ctx.expr());

        String typeIndicator = (ctx.expr().typeSpec == Predefined.integerType) ? "I"
                : (ctx.expr().typeSpec == Predefined.stringType)    ? "Ljava/lang/String;"
                :                                    "?";

        // Emit a field put instruction.
        jFile.println("\tputstatic\t" + programName
                +  "/" + ctx.variable().IDENTIFIER().toString()
                + " " + typeIndicator);

        return value;
    }

    @Override
    public Integer visitIf_statement(FantasticParser.If_statementContext ctx) {
    	// this will leave 1 or 0 on top of the stack.
    	Integer val = visit(ctx.expr());
    	String trueLab = generateLabel();
    	String falseLab = "";
    	boolean elseStatPres = ctx.children.size() > 5;
    	if(elseStatPres)
    		falseLab = generateLabel();
    	String nextLab = generateLabel();
    	
    	jFile.println("\tifne " + trueLab);
    	if(elseStatPres)
    		jFile.println("\tgoto " + falseLab);	
    	jFile.println("\tgoto " + nextLab);
    	
    			
    	// TRUE label.
    	// visits the true blocks and then jumps to next label block.
    	jFile.println(trueLab + ":");
    	Integer valTrueBlock = visit(ctx.block(0));
    	jFile.println("\tgoto " + nextLab);
    			
    	// FALSE label.
        if (elseStatPres) {
            jFile.println(falseLab + ":");
            Integer valFalseBlock = visit(ctx.block(1));
        }

    			
    	jFile.println(nextLab + ":");
    	return -1;
        //return super.visitIf_statement(ctx);
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

    
    /** 
     * Tab alignment on labels
     * Changed return value from super to val1
     */
    @Override
    public Integer visitCompOpeOver(FantasticParser.CompOpeOverContext ctx) {
    	Integer val1 = visit(ctx.expr(0));
    	Integer val2 = visit(ctx.expr(1));
    	String trueLab = generateLabel();
    	String nextLab = generateLabel();
    	// this means we are operating on integers
    	if(ctx.expr(0).typeSpec == Predefined.integerType){
    		// '>'
    		if(ctx.op.getType() == FantasticParser.GT)
    			jFile.println("\tif_icmpgt " + trueLab);
    		else if(ctx.op.getType() == FantasticParser.LT)
    			jFile.println("\tif_icmplt " + trueLab);
    		else if(ctx.op.getType() == FantasticParser.LET)
    			jFile.println("\tif_icmple " + trueLab);
    		else if(ctx.op.getType() == FantasticParser.GET)
    			jFile.println("\tif_icmpge " + trueLab);
    		else if(ctx.op.getType() == FantasticParser.EQ)
    			jFile.println("\tif_icmpeq " + trueLab);
    		jFile.println("\tldc 0");// push 0 if condition is false
    		jFile.println("\tgoto " + nextLab); // just continue with next instruction
    		jFile.println(trueLab + ":"); // if condition is met
    		jFile.println("\tldc 1"); // push 1 if condition is true
    		jFile.println(nextLab + ":");
    	}
////        String typeIndicator = (ctx.expr().typeSpec == Predefined.integerType) ? "I"
////                : (ctx.expr().typeSpec == Predefined.stringType)    ? "Ljava/lang/String;"
////                :                                    "?";
        // NOTE: return value doesn't mean anything
        return val1;//super.visitCompOpeOver(ctx);
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
        String variableName = ctx.variable().IDENTIFIER().toString();
        TypeSpec type = ctx.typeSpec;

        String typeIndicator = (type == Predefined.integerType) ? "I"
                : (type == Predefined.stringType)    ? "Ljava/lang/String;"
                :                                    "?";

        // Emit a field get instruction.
        jFile.println("\tgetstatic\t" + programName +
                "/" + variableName + " " + typeIndicator);

        return visitChildren(ctx);
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

        String op = ctx.op.getText();
        String opcode;

        if (op.equals("+")) {
            opcode = integerMode ? "iadd" : "????";
        } else {
            opcode = integerMode ? "isub" : "????";
        }

        // Emit an add or subtract instruction.
        jFile.println("\t" + opcode);

        return value;
    }

    @Override
    public Integer visitMulDivPercOver(FantasticParser.MulDivPercOverContext ctx) {
        Integer value = visitChildren(ctx);

        TypeSpec type1 = ctx.expr(0).typeSpec;
        TypeSpec type2 = ctx.expr(1).typeSpec;

        //boolean integerMode = (type1 == Predefined.integerType) && (type2 == Predefined.integerType);
        boolean integerMode = true;

        String op = ctx.op.getText();
        String opcode;
        System.out.println("Operator: " + op);
        if (op.equals("*")) {
            opcode = integerMode ? "imul" : "????";
        } else if (op.equals("/")) {
            opcode = integerMode ? "idiv" : "????";
        } else {
            opcode = integerMode ? "irem" : "????";
        }

        // Emit a multiply or divide instruction.
        jFile.println("\t" + opcode);

        return value;
    }

    @Override
    public Integer visitIntLitOver(FantasticParser.IntLitOverContext ctx) {
        // Emit a load constant instruction.
        jFile.println("\tldc\t" + ctx.getText());

        return visitChildren(ctx);
    }

    @Override
    public Integer visitStrLitOver(FantasticParser.StrLitOverContext ctx) {
        // Emit a load constant instruction.
        jFile.println("\tldc\t" + ctx.getText());

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
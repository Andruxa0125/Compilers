import static wci.intermediate.symtabimpl.DefinitionImpl.VARIABLE;

import java.io.PrintWriter;
import java.util.Hashtable;
import java.util.Stack;

import wci.intermediate.*;
import wci.intermediate.symtabimpl.*;

public class Pass2Visitor extends FantasticBaseVisitor<Integer>
{
    String programName;
    private PrintWriter jFile;
    private static int labelCount = 0;
    // this stack is used to simulate actions on strings.
    private static Stack<String> stack;
    // this is stack of activation records basically.
    private Stack<LocalVariableMap> globalMap;
    // this counts how many variables are there in the scopes.
    // different from globalMap because if, while scopes count here but not there.
    private Stack<Integer> localVariablesCount; 
    
    private static String generateLabel(){
    	labelCount++;
    	return "LABEL" + String.valueOf(labelCount - 1);
    }
    public Pass2Visitor(PrintWriter jFile, String programName)
    {
        this.jFile = jFile;
        this.programName = programName;
        stack = new Stack();
        globalMap = new Stack<LocalVariableMap>();
        localVariablesCount = new Stack<Integer>();
        
        globalMap.push(new LocalVariableMap());
        localVariablesCount.push(0);
    }

    private void boolHelper(boolean expr){
    	if(expr)
    		jFile.println("\tldc 1"); // push 1 if condition is true
    	else
    		jFile.println("\tldc 0"); // push 0 if condition is false
    }
    @Override
    public Integer visitProg(FantasticParser.ProgContext ctx) {
        // Emit constructor.
        jFile.println("\n; === Emit the class constructor. === \n");
        jFile.println();
        jFile.println(".method public <init>()V");
        jFile.println();
        jFile.println("\taload_0");
        jFile.println("\tinvokenonvirtual    java/lang/Object/<init>()V");
        jFile.println("\treturn");
        jFile.println();
        jFile.println(".limit locals 1");
        jFile.println(".limit stack 1");
        jFile.println(".end method");

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
        jFile.println("\n; === Print statement. ===");
        jFile.println("\tgetstatic\tjava/lang/System/out Ljava/io/PrintStream;");
        Integer value = visit(ctx.expr());
        if (ctx.expr().typeSpec == Predefined.integerType) {
            jFile.println("\tinvokevirtual\tjava/io/PrintStream.println(I)V");
        } else {
            jFile.println("\tinvokevirtual\tjava/io/PrintStream.println(Ljava/lang/String;)V");
        }
        return value;
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
    	localVariablesCount.push(0);
    	
        jFile.println("\n; === while statement ===");
    	String startLabel = generateLabel();						
    	jFile.println(startLabel + ":");
    	Integer value = visit(ctx.expr());					//Get condition value by visiting the expr child
    	String exitLabel = generateLabel();
    	jFile.println("\tifeq " + exitLabel);				//check condition; 1 = exit loop, 0 = execute block
    	visit(ctx.block());									
    	jFile.println("\tgoto " +  startLabel);				//jump back to the beginning of the loop
    	jFile.println(exitLabel + ":");						//create exitloop
    	
    	// deleting local variables.
    	int localVarNum = localVariablesCount.pop();
    	globalMap.peek().freeCells(localVarNum);
    	
        return value;
    }

    @Override
    public Integer visitNewLineStat(FantasticParser.NewLineStatContext ctx) {
        return super.visitNewLineStat(ctx);
    }

    // this decl is used only inside of new scopes as local declarations.
    public Integer visitVar_decl_statement(FantasticParser.Var_decl_statementContext ctx) {
    	// runtime stack to simulate actions for strings.
    	// if we declare a local variable that is String.
    	String varName = ctx.variable().getText();
    	String type = ctx.type().toString().equals("string") ? "S":"I";
    	// for local declarations you can't assign a value.
    	// we might want to fix it later but doesn't matter really.
    	globalMap.peek().put(varName, new MemoryCell(null, type, true));
        return -1;
    }

    @Override
    public Integer visitFunc_decl_statement(FantasticParser.Func_decl_statementContext ctx) {
    	//this one
//    	String funcName = ctx.function_name().getText();
//    	jFile.print(".method static " + funcName + "(");
//    	// this will write bunch of I or something.
//    	visit(ctx.params());
//    	jFile.println(")");
//    	if(ctx.return_type() != null) {
//    		if(ctx.return_type().getText().equals("int")) {
//    			jFile.println("I");
//    		}
//    		else if(ctx.return_type().getText().equals("string")) {
//    			jFile.println("Ljava/lang/String;");
//    		}
//    	}
        return super.visitFunc_decl_statement(ctx);
    }

    @Override
    // these variables will be private static in jasmin. So, global variables.
    public Integer visitDeclarationOver(FantasticParser.DeclarationOverContext ctx) {
        Integer value = visit(ctx.expr());
        String varName = ctx.variable().IDENTIFIER().toString();
        String typeIndicator = (ctx.type().getText().equals("int")) ? "I"
                : (ctx.type().getText().equals("string"))    ? "Ljava/lang/String;"
                :                                    "?";
        // Emit a field put instruction.
        jFile.println("\tputstatic\t" + programName
                +  "/" + varName
                + " " + typeIndicator);
        System.out.println("Type indicator is " + typeIndicator);
        // runtime stack to simulate actions for strings.
        // add the string to the globalMap.
        if(!typeIndicator.equals("I")) {
        	// once we visit expression, we are going to leave the value on top of the stack.
        	String val = stack.pop();
        	globalMap.peek().put(varName, new MemoryCell(val, "S", false));
        }
        return value;
    }

    @Override
    public Integer visitAssignmentOver(FantasticParser.AssignmentOverContext ctx) {
        Integer value = visit(ctx.expr());
        
        String variableName = ctx.variable().IDENTIFIER().toString();
        String typeIndicator = (ctx.expr().typeSpec == Predefined.integerType) ? "I"
                : (ctx.expr().typeSpec == Predefined.stringType)    ? "Ljava/lang/String;"
                :                                    "?";
        
        MemoryCell cell = globalMap.peek().get(variableName);
        if(cell != null && cell.isLocal()){
        	int index = cell.getIndex();
        	// it is int
        	if(!cell.isString()){
        		jFile.println("\tistore " + index);
        	}
        	// it is a string.
        	else{
        		jFile.println("\tastore " + index);
                // we don't need stack for doing this operation.
                cell.setValue(stack.pop());
        	}
        	return -1;
        }
        
        // Emit a field put instruction.
        jFile.println("\tputstatic\t" + programName
                +  "/" + variableName
                + " " + typeIndicator);
        // it must be global.
        cell = globalMap.get(0).get(variableName);
        // check if it is a string. if yes, update its value.
        if(cell.isString()){
        	cell.setValue(stack.pop());
        }
        return value;
    }

    @Override
    public Integer visitIf_statement(FantasticParser.If_statementContext ctx) {
    	localVariablesCount.push(0);
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
    	
    	int localVarNum = localVariablesCount.pop();
    	globalMap.peek().freeCells(localVarNum);
    	return -1;
    }
    public Integer visitTernaryOpeOver(FantasticParser.TernaryOpeOverContext ctx) 
    {
    	// this is gonna leave a value on top of the stack.
    	visit(ctx.expr(0));
    	String trueLab = generateLabel();
    	String falseLab = generateLabel();
    	String nextLab = generateLabel();
    	
    	jFile.println("\tifne " + trueLab);
    	jFile.println("\tgoto " + falseLab);	

    	// TRUE label.
    	// visits the true blocks and then jumps to next label block.
    	jFile.println(trueLab + ":");
    	Integer valTrueBlock = visit(ctx.expr(1));
    	jFile.println("\tgoto " + nextLab);
    	
    	// FALSE label
    	jFile.println(falseLab + ":");
        Integer valFalseBlock = visit(ctx.expr(2));
        jFile.println(nextLab + ":");
    	return -1;
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
    	int before = stack.size();
    	boolean strings = false;
    	Integer val1 = visit(ctx.expr(0));
    	Integer val2 = visit(ctx.expr(1));
    	if(stack.size() > before)
    		strings = true;
    	String trueLab = generateLabel();
    	String nextLab = generateLabel();
    	// this means we are operating on integers
    	if(!strings){
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
    	// must be strings...
    	else {
    		String sec = stack.pop();
    		String fir = stack.pop();
            jFile.println("\tpop");
            jFile.println("\tpop");
    		// positive if fir>sec
    		// 0 if fir==sec
    		// negative if fir < sec
    		int res = fir.compareTo(sec);
    		if(ctx.op.getType() == FantasticParser.GT)
    			boolHelper(res > 0);
    		else if(ctx.op.getType() == FantasticParser.LT)
    			boolHelper(res < 0);
    		else if(ctx.op.getType() == FantasticParser.LET)
    			boolHelper(res <= 0);
    		else if(ctx.op.getType() == FantasticParser.GET)
    			boolHelper(res >= 0);
    		else if(ctx.op.getType() == FantasticParser.EQ)
    			boolHelper(res == 0);

    	}

        return val1;
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
        MemoryCell cell = globalMap.peek().get(variableName);
        // we will enter this if IF AND ONLY IF it is not a local variable.        
        if(cell != null && cell.isLocal()){
        	int index = cell.getIndex();
        	// it is int
        	if(!cell.isString()){
        		jFile.println("\tiload " + index);
        	}
        	// it is a string.
        	else{
        		// push the value of the string.
        		stack.push(cell.getValue());
        		jFile.println("\taload " + index);
        	}
        	return -1;
        }
        String typeIndicator = (type == Predefined.integerType) ? "I"
                : (type == Predefined.stringType)    ? "Ljava/lang/String;"
                :                                    "?";

        // Emit a field get instruction.
        jFile.println("\tgetstatic\t" + programName +
                "/" + variableName + " " + typeIndicator);
        
        // if it is a string and global variable.
        if(typeIndicator.equals("Ljava/lang/String;")){
        	// search at the bottom of the stack for global variables.
        	LocalVariableMap global =  globalMap.get(0);
        	cell = global.get(variableName);
        	stack.push(cell.getValue());
        }
        return -1;
    }

    @Override
    public Integer visitParens(FantasticParser.ParensContext ctx) {
        return super.visitParens(ctx);
    }

    @Override
    public Integer visitAddSubOver(FantasticParser.AddSubOverContext ctx) {
    	int before = stack.size();
    	boolean stringMode = false;
        Integer value = visitChildren(ctx);

        TypeSpec type1 = ctx.expr(0).typeSpec;
        TypeSpec type2 = ctx.expr(1).typeSpec;
    	if(stack.size() > before)
    		stringMode = true;

        String op = ctx.op.getText();
        String opcode = "";

        if (op.equals("+")) {
            if (!stringMode) {
                opcode = "iadd";
            } else if (stringMode) {
                String str1 = stack.pop().replace("\"", "");
                String str2 = stack.pop().replace("\"", "");
                String concatOutput = str2 + str1;
                concatOutput = "\"" + concatOutput + "\"";
                jFile.println("\tldc\t" + concatOutput);
                stack.push(concatOutput);
            } else {
                opcode = "????";
            }
        } else {
            opcode = !stringMode ? "isub" : "????";
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

        boolean integerMode = (type1 == Predefined.integerType) && (type2 == Predefined.integerType);

        String op = ctx.op.getText();
        String opcode;

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
    	String txt = ctx.getText();
        jFile.println("\tldc\t" + txt);
        // code to support operations on strings.
        stack.push(txt);
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
.class public func_sample
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; inta=bla(5);

.field private static a I

; === Emit the class constructor. === 


.method public <init>()V

	aload_0
	invokenonvirtual    java/lang/Object/<init>()V
	return

.limit locals 1
.limit stack 1
.end method

; === Emit the bla function declaration. === 


.method private static bla(I)I
	ldc	0
	istore 1

; === while statement ===
LABEL0:
	iload 1
	ldc	10
	if_icmplt LABEL1
	ldc 0
	goto LABEL2
LABEL1:
	ldc 1
LABEL2:
	ifeq LABEL3
	iload 0
	ldc	1
	iadd
	istore 0
	iload 1
	ldc	1
	iadd
	istore 1
	goto LABEL0
LABEL3:
	iload 0
	ireturn

.limit locals 16
.limit stack 16
.end method

; === Emit the main method header. === 

.method public static main([Ljava/lang/String;)V

; === Emit the main method prologue. === 

	new RunTimer
	dup
	invokenonvirtual RunTimer/<init>()V
	putstatic        func_sample/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        func_sample/_standardIn LPascalTextIn;

; === Emit the code for statements in the main program. === 


; === Emit the code for function calls. === 

	ldc 5
	invokestatic func_sample/bla(I)I
	putstatic	func_sample/a I

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	getstatic	func_sample/a I
	invokevirtual	java/io/PrintStream.println(I)V

; === Emit the main program epilogue. === 


	getstatic     func_sample/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method

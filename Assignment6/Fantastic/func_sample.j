.class public func_sample
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; intj=5;

.field private static j I

; intb;

.field private static b I

; inta;

.field private static a I

; === Emit the class constructor. === 


.method public <init>()V

	aload_0
	invokenonvirtual    java/lang/Object/<init>()V
	return

.limit locals 1
.limit stack 1
.end method

; === Emit the gla function declaration. === 


.method private static gla()I
	ldc	6
	istore 0
	getstatic	func_sample/i ?
	istore 0
	iload 0
	ireturn

.limit locals 16
.limit stack 16
.end method

; === Emit the bla function declaration. === 


.method private static bla()I
	ldc	5
	istore 0

; === Emit the code for function calls. === 

	invokestatic func_sample/gla()I
	istore 0
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

	ldc	5
	putstatic	func_sample/j I

; === while statement ===
LABEL0:
	getstatic	func_sample/j I
	ldc	10
	if_icmplt LABEL1
	ldc 0
	goto LABEL2
LABEL1:
	ldc 1
LABEL2:
	ifeq LABEL3
	ldc	20
	getstatic	func_sample/j I
	iadd
	istore 3

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	iload 3
	invokevirtual	java/io/PrintStream.println(I)V
	getstatic	func_sample/j I
	ldc	1
	iadd
	putstatic	func_sample/j I
	goto LABEL0
LABEL3:

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	getstatic	func_sample/j I
	invokevirtual	java/io/PrintStream.println(I)V

; === Emit the code for function calls. === 

	invokestatic func_sample/gla()I
	istore 4

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	iload 4
	invokevirtual	java/io/PrintStream.println(I)V

; === Emit the main program epilogue. === 


	getstatic     func_sample/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method

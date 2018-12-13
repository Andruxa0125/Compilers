.class public while_sample
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; intc=5;

.field private static c I

; intjj=62;

.field private static jj I

; intfar=201;

.field private static far I

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
	putstatic	while_sample/h I

; === while statement ===
LABEL0:
	getstatic	while_sample/h ?
	ldc	10
	if_icmplt LABEL1
	ldc 0
	goto LABEL2
LABEL1:
	ldc 1
LABEL2:
	ifeq LABEL3
	getstatic	while_sample/h ?
	ldc	1
	iadd
	putstatic	while_sample/h ?
	goto LABEL0
LABEL3:

.limit locals 1
.limit stack 16
.end method

; === Emit the gla function declaration. === 


.method private static gla(II)I
	ldc	0
	putstatic	while_sample/b I

; === while statement ===
LABEL4:
	iload 0
	ldc	10
	if_icmplt LABEL5
	ldc 0
	goto LABEL6
LABEL5:
	ldc 1
LABEL6:
	ifeq LABEL7
	iload 1
	ldc	1
	iadd
	putstatic	while_sample/b ?

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;

; === Emit the code for function calls. === 

	getstatic	while_sample/b I
	invokestatic while_sample/bla(I)I
	invokevirtual	java/io/PrintStream.println(Ljava/lang/String;)V
	goto LABEL4
LABEL7:

.limit locals 2
.limit stack 16
.end method

; === Emit the main method header. === 

.method public static main([Ljava/lang/String;)V

; === Emit the main method prologue. === 

	new RunTimer
	dup
	invokenonvirtual RunTimer/<init>()V
	putstatic        while_sample/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        while_sample/_standardIn LPascalTextIn;

; === Emit the code for statements in the main program. === 

	ldc	5
	putstatic	while_sample/c I
	ldc	62
	putstatic	while_sample/jj I
	ldc	201
	putstatic	while_sample/far I

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;

; === Emit the code for function calls. === 

	getstatic	while_sample/c I
	invokestatic while_sample/gla(II)I
	invokevirtual	java/io/PrintStream.println(Ljava/lang/String;)V

; === Emit the main program epilogue. === 


	getstatic     while_sample/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method

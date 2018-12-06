.class public while_sample
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; inta=0;

.field private static a I

; === Emit the class constructor. === 


.method public <init>()V

	aload_0
	invokenonvirtual    java/lang/Object/<init>()V
	return

.limit locals 1
.limit stack 1
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

	ldc	0
	putstatic	while_sample/a I

; === while statement ===
LABEL0:
	getstatic	while_sample/a I
	ldc	10
	if_icmplt LABEL1
	ldc 0
	goto LABEL2
LABEL1:
	ldc 1
LABEL2:
	ifeq LABEL3
	getstatic	while_sample/a I
	ldc	1
	iadd
	putstatic	while_sample/a I
	goto LABEL0
LABEL3:

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"a"
	invokevirtual	java/io/PrintStream.println(Ljava/lang/String;)V

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	getstatic	while_sample/a I
	invokevirtual	java/io/PrintStream.println(I)V

; === Emit the main program epilogue. === 


	getstatic     while_sample/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method

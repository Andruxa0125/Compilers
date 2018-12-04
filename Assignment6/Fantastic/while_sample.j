.class public while_sample
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; inta=5;

.field private static a I

; intb=15;

.field private static b I

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

	ldc	123
	ldc	5
	putstatic	while_sample/a I
	ldc	15
	putstatic	while_sample/b I
LABEL0:
	getstatic	while_sample/b I
	ldc	10
	if_icmpgt LABEL1
	ldc 0
	goto LABEL2
LABEL1:
	ldc 1
LABEL2:
	ifne LABEL3
	getstatic	while_sample/a I
	ldc	1
	iadd
	putstatic	while_sample/a I
	getstatic	while_sample/b I
	ldc	1
	isub
	putstatic	while_sample/b I
	goto LABEL0
LABEL3:

; === Emit the main program epilogue. === 


	getstatic     while_sample/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method

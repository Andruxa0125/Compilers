.class public if_sample
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; inta=5;

.field private static a I

; intb=15;

.field private static b I

; intc=a+b;

.field private static c I

; === Emit the main method header. === 

.method public static main([Ljava/lang/String;)V

; === Emit the main method prologue. === 

	new RunTimer
	dup
	invokenonvirtual RunTimer/<init>()V
	putstatic        if_sample/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        if_sample/_standardIn LPascalTextIn;

; === Emit the code for statements in the main program. === 

	ldc	5
	putstatic	if_sample/a I
	ldc	15
	putstatic	if_sample/b I
	getstatic	if_sample/a I
	getstatic	if_sample/b I
	iadd
	putstatic	if_sample/c I
	getstatic	if_sample/a I
	ldc	4
	icmpgt label0
	iconst_0
	goto label1
	label0:
	iconst_1
	label1:
	getstatic	if_sample/a I
	ldc	4
	ifne label2
	goto label3
	goto label4
label2:
	getstatic	if_sample/c I
	ldc	5
	imul
	putstatic	if_sample/c I
	goto label4
label3:
	getstatic	if_sample/b I
	ldc	10
	iadd
	putstatic	if_sample/b I
label4:
	getstatic	if_sample/a I
	ldc	4
	icmpgt label5
	iconst_0
	goto label6
	label5:
	iconst_1
	label6:
	getstatic	if_sample/a I
	ldc	4
	getstatic	if_sample/c I
	ldc	5
	imul
	putstatic	if_sample/c I
	getstatic	if_sample/b I
	ldc	10
	iadd
	putstatic	if_sample/b I

; === Emit the main program epilogue. === 


	getstatic     if_sample/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method

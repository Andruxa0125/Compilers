.class public add_sub_mul_div_sample
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; inta=1+1;

.field private static a I

; intb=2-1;

.field private static b I

; intc=2*2;

.field private static c I

; intd=4/2;

.field private static d I

; inte=6%3;

.field private static e I

; === Emit the main method header. === 

.method public static main([Ljava/lang/String;)V

; === Emit the main method prologue. === 

	new RunTimer
	dup
	invokenonvirtual RunTimer/<init>()V
	putstatic        add_sub_mul_div_sample/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        add_sub_mul_div_sample/_standardIn LPascalTextIn;

; === Emit the code for statements in the main program. === 

	ldc	1
	ldc	1
	iadd
	putstatic	add_sub_mul_div_sample/a I
	ldc	2
	ldc	1
	isub
	putstatic	add_sub_mul_div_sample/b I
	ldc	2
	ldc	2
	imul
	putstatic	add_sub_mul_div_sample/c I
	ldc	4
	ldc	2
	idiv
	putstatic	add_sub_mul_div_sample/d I
	ldc	6
	ldc	3
	irem
	putstatic	add_sub_mul_div_sample/e I

; === Emit the main program epilogue. === 


	getstatic     add_sub_mul_div_sample/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method

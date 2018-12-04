.class public expr_sample
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; ints=(5+2)/2;

.field private static s I

; === Emit the main method header. === 

.method public static main([Ljava/lang/String;)V

; === Emit the main method prologue. === 

	new RunTimer
	dup
	invokenonvirtual RunTimer/<init>()V
	putstatic        expr_sample/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        expr_sample/_standardIn LPascalTextIn;

; === Emit the code for statements in the main program. === 

	ldc	5
	ldc	2
	iadd
	ldc	2
	idiv
	putstatic	expr_sample/s ?

; === Emit the main program epilogue. === 


	getstatic     expr_sample/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method

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

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"--Printing a: a should be 2--"
	invokevirtual	java/io/PrintStream.println(Ljava/lang/String;)V

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	getstatic	add_sub_mul_div_sample/a I
	invokevirtual	java/io/PrintStream.println(I)V

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"--Printing b: b should be 1--"
	invokevirtual	java/io/PrintStream.println(Ljava/lang/String;)V

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	getstatic	add_sub_mul_div_sample/b I
	invokevirtual	java/io/PrintStream.println(I)V

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"--Printing c: c should be 4--"
	invokevirtual	java/io/PrintStream.println(Ljava/lang/String;)V

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	getstatic	add_sub_mul_div_sample/c I
	invokevirtual	java/io/PrintStream.println(I)V

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"--Printing d: d should be 2--"
	invokevirtual	java/io/PrintStream.println(Ljava/lang/String;)V

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	getstatic	add_sub_mul_div_sample/d I
	invokevirtual	java/io/PrintStream.println(I)V

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"--Printing e: e should be 0--"
	invokevirtual	java/io/PrintStream.println(Ljava/lang/String;)V

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	getstatic	add_sub_mul_div_sample/e I
	invokevirtual	java/io/PrintStream.println(I)V

; === Emit the main program epilogue. === 


	getstatic     add_sub_mul_div_sample/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method

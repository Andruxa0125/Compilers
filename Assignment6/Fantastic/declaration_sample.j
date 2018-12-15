.class public declaration_sample
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; inta;

.field private static a I

; intb=1;

.field private static b I

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
	putstatic        declaration_sample/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        declaration_sample/_standardIn LPascalTextIn;

; === Emit the code for statements in the main program. === 

	ldc	1
	putstatic	declaration_sample/b I
	ldc	10
	istore 2

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"--Printing a: a should be 10--"
	invokevirtual	java/io/PrintStream.println(Ljava/lang/String;)V

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	iload 2
	invokevirtual	java/io/PrintStream.println(I)V

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"--Printing b: a should be 1--"
	invokevirtual	java/io/PrintStream.println(Ljava/lang/String;)V

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	getstatic	declaration_sample/b I
	invokevirtual	java/io/PrintStream.println(I)V

; === Emit the main program epilogue. === 


	getstatic     declaration_sample/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method

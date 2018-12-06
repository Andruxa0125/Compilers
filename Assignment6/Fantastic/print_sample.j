.class public print_sample
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; intstw=123;

.field private static stw I

; intta=56;

.field private static ta I

; stringmystr="hello";

.field private static mystr Ljava/lang/String;

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
	putstatic        print_sample/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        print_sample/_standardIn LPascalTextIn;

; === Emit the code for statements in the main program. === 

	ldc	123
	putstatic	print_sample/stw I

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	getstatic	print_sample/stw I
	invokevirtual	java/io/PrintStream.println(I)V
	ldc	56
	putstatic	print_sample/ta I

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	getstatic	print_sample/ta I
	invokevirtual	java/io/PrintStream.println(I)V
	ldc	"hello"
	putstatic	print_sample/mystr Ljava/lang/String;

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	getstatic	print_sample/mystr Ljava/lang/String;
	invokevirtual	java/io/PrintStream.println(Ljava/lang/String;)V

; === Emit the main program epilogue. === 


	getstatic     print_sample/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method

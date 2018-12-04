.class public string_concat_sample
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; stringstr="hello"+"world";

.field private static str Ljava/lang/String;

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
	putstatic        string_concat_sample/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        string_concat_sample/_standardIn LPascalTextIn;

; === Emit the code for statements in the main program. === 

	ldc	"hello"
	ldc	"world"
	ldc	"helloworld"
	
	putstatic	string_concat_sample/str Ljava/lang/String;

; === Emit the main program epilogue. === 


	getstatic     string_concat_sample/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method

.class public declaration_sample
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; inta;

.field private static a I

; stringstr;

.field private static str Ljava/lang/String;

; intb=1;

.field private static b I

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
	putstatic	declaration_sample/a I
	ldc	"Hello"
	putstatic	declaration_sample/str Ljava/lang/String;

; === Emit the main program epilogue. === 


	getstatic     declaration_sample/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method

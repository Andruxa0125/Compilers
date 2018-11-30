.class public expr_sample
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; inta=1;

.field private static a I

; intb=a;

.field private static b I

; stringstr="str1";

.field private static str Ljava/lang/String;

; stringcopy=str;

.field private static copy Ljava/lang/String;

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

	ldc	1
	putstatic	expr_sample/a I
	getstatic	expr_sample/a I
	putstatic	expr_sample/b I
	ldc	"str1"
	putstatic	expr_sample/str Ljava/lang/String;
	getstatic	expr_sample/str Ljava/lang/String;
	putstatic	expr_sample/copy Ljava/lang/String;

; === Emit the main program epilogue. === 


	getstatic     expr_sample/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method

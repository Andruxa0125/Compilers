.class public if_sample
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; stringc="hello";

.field private static c Ljava/lang/String;

; stringd="hello";

.field private static d Ljava/lang/String;

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
	putstatic        if_sample/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        if_sample/_standardIn LPascalTextIn;

; === Emit the code for statements in the main program. === 

	ldc	"hello"
	putstatic	if_sample/c Ljava/lang/String;
	ldc	"hello"
	putstatic	if_sample/d Ljava/lang/String;
	getstatic	if_sample/c Ljava/lang/String;
	getstatic	if_sample/d Ljava/lang/String;
	pop
	pop
	ldc 1
	ifne LABEL2
	goto LABEL3
LABEL2:
	ldc	333
	goto LABEL3
LABEL3:

; === Emit the main program epilogue. === 


	getstatic     if_sample/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method

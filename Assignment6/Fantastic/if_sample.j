.class public if_sample
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; inta=5;

.field private static a I

; intb=15;

.field private static b I

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

	ldc	5
	putstatic	if_sample/a I
	ldc	15
	putstatic	if_sample/b I
	getstatic	if_sample/a I
	ldc	4
	if_icmpgt LABEL0
	ldc 0
	goto LABEL1
LABEL0:
	ldc 1
LABEL1:
	ifne LABEL2
	goto LABEL3
	goto LABEL4
LABEL2:
	ldc	111
	goto LABEL4
LABEL3:
	ldc	222
LABEL4:
	ldc	"hello"
	putstatic	if_sample/c Ljava/lang/String;
	ldc	"hello"
	putstatic	if_sample/d Ljava/lang/String;
	getstatic	if_sample/c Ljava/lang/String;
	getstatic	if_sample/d Ljava/lang/String;
	if_icmpeq LABEL5
	ldc 0
	goto LABEL6
LABEL5:
	ldc 1
LABEL6:
	ifne LABEL7
	goto LABEL8
LABEL7:
	ldc	333
	goto LABEL8
LABEL8:

; === Emit the main program epilogue. === 


	getstatic     if_sample/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method

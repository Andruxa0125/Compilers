.class public ternary_op
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; inta=9;

.field private static a I

; intb=a>5?4:3;

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
	putstatic        ternary_op/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        ternary_op/_standardIn LPascalTextIn;

; === Emit the code for statements in the main program. === 

	ldc	9
	putstatic	ternary_op/a I
	getstatic	ternary_op/a I
	ldc	5
	if_icmpgt LABEL0
	ldc 0
	goto LABEL1
LABEL0:
	ldc 1
LABEL1:
	ifne LABEL2
	goto LABEL3
LABEL2:
	ldc	4
	goto LABEL4
LABEL3:
	ldc	3
LABEL4:
	putstatic	ternary_op/b I

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"--Printing b: b should be 4--"
	invokevirtual	java/io/PrintStream.println(Ljava/lang/String;)V

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	getstatic	ternary_op/b I
	invokevirtual	java/io/PrintStream.println(I)V

; === Emit the main program epilogue. === 


	getstatic     ternary_op/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method

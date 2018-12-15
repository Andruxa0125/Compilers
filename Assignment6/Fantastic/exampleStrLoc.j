.class public exampleStrLoc
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; inti;

.field private static i I

; stringfirst="Hello";

.field private static first Ljava/lang/String;

; stringsecond="World";

.field private static second Ljava/lang/String;

; stringd;

.field private static d Ljava/lang/String;

; stringr;

.field private static r Ljava/lang/String;

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
	putstatic        exampleStrLoc/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        exampleStrLoc/_standardIn LPascalTextIn;

; === Emit the code for statements in the main program. === 

	ldc	0
	istore 5
	ldc	"Hello"
	putstatic	exampleStrLoc/first Ljava/lang/String;
	ldc	"World"
	putstatic	exampleStrLoc/second Ljava/lang/String;

; === while statement ===
LABEL0:
	iload 5
	ldc	2
	if_icmplt LABEL1
	ldc 0
	goto LABEL2
LABEL1:
	ldc 1
LABEL2:
	ifeq LABEL3
	getstatic	exampleStrLoc/first Ljava/lang/String;
	getstatic	exampleStrLoc/second Ljava/lang/String;
	pop
	pop
	ldc 0
	ifne LABEL4
	goto LABEL8
LABEL4:
	ldc	""
	astore 8
	getstatic	exampleStrLoc/first Ljava/lang/String;
	getstatic	exampleStrLoc/second Ljava/lang/String;
	pop
	pop
	ldc	"HelloWorld"
	
	astore 8

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	aload 8
	invokevirtual	java/io/PrintStream.println(Ljava/lang/String;)V
	goto LABEL7
LABEL8:
	ldc	""
	astore 9
	getstatic	exampleStrLoc/second Ljava/lang/String;
	getstatic	exampleStrLoc/first Ljava/lang/String;
	pop
	pop
	ldc	"WorldHello"
	
	astore 9

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	aload 9
	invokevirtual	java/io/PrintStream.println(Ljava/lang/String;)V
LABEL7:
	iload 5
	ldc	1
	iadd
	istore 5
	goto LABEL0
LABEL3:

; === Emit the main program epilogue. === 


	getstatic     exampleStrLoc/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method

.class public sample
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; inta;

.field private static a I

; intb=15;

.field private static b I

; intc=a+b;

.field private static c I

; stringstra="bla";

.field private static stra Ljava/lang/String;

; stringstrb="bla";

.field private static strb Ljava/lang/String;

; intprec=1+2*5;

.field private static prec I

; intparen=(1+2)*5;

.field private static paren I

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
	putstatic        sample/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        sample/_standardIn LPascalTextIn;

; === Emit the code for statements in the main program. === 

	ldc	5
	putstatic	sample/a I
	ldc	15
	putstatic	sample/b I
	getstatic	sample/a I
	getstatic	sample/b I
	iadd
	putstatic	sample/c I
	ldc	"bla"
	putstatic	sample/stra Ljava/lang/String;
	ldc	"bla"
	putstatic	sample/strb Ljava/lang/String;

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"FirstTest"
	invokevirtual	java/io/PrintStream.println(Ljava/lang/String;)V
	getstatic	sample/a I
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
	getstatic	sample/c I
	ldc	5
	imul
	putstatic	sample/c I
	goto LABEL4
LABEL3:
	getstatic	sample/b I
	ldc	10
	iadd
	putstatic	sample/b I
LABEL4:

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"c"
	invokevirtual	java/io/PrintStream.println(Ljava/lang/String;)V

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	getstatic	sample/c I
	invokevirtual	java/io/PrintStream.println(I)V

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"b"
	invokevirtual	java/io/PrintStream.println(Ljava/lang/String;)V

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	getstatic	sample/b I
	invokevirtual	java/io/PrintStream.println(I)V

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"SecondTest"
	invokevirtual	java/io/PrintStream.println(Ljava/lang/String;)V

; === while statement ===
LABEL5:
	getstatic	sample/b I
	ldc	10
	if_icmpgt LABEL6
	ldc 0
	goto LABEL7
LABEL6:
	ldc 1
LABEL7:
	ifeq LABEL8
	getstatic	sample/a I
	ldc	1
	iadd
	putstatic	sample/a I
	getstatic	sample/b I
	ldc	1
	isub
	putstatic	sample/b I
	goto LABEL5
LABEL8:

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"a"
	invokevirtual	java/io/PrintStream.println(Ljava/lang/String;)V

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	getstatic	sample/a I
	invokevirtual	java/io/PrintStream.println(I)V

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"b"
	invokevirtual	java/io/PrintStream.println(Ljava/lang/String;)V

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	getstatic	sample/b I
	invokevirtual	java/io/PrintStream.println(I)V
	getstatic	sample/stra Ljava/lang/String;
	getstatic	sample/strb Ljava/lang/String;
	pop
	pop
	ldc 1
	ifne LABEL11
	goto LABEL12
LABEL11:
	ldc	"staristrue"
	putstatic	sample/stra Ljava/lang/String;
	goto LABEL12
LABEL12:

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"ThirdTest"
	invokevirtual	java/io/PrintStream.println(Ljava/lang/String;)V

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"stra"
	invokevirtual	java/io/PrintStream.println(Ljava/lang/String;)V

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	getstatic	sample/stra Ljava/lang/String;
	invokevirtual	java/io/PrintStream.println(Ljava/lang/String;)V

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"strb"
	invokevirtual	java/io/PrintStream.println(Ljava/lang/String;)V

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	getstatic	sample/strb Ljava/lang/String;
	invokevirtual	java/io/PrintStream.println(Ljava/lang/String;)V
	ldc	1
	ldc	2
	ldc	5
	imul
	iadd
	putstatic	sample/prec I
	ldc	1
	ldc	2
	iadd
	ldc	5
	imul
	putstatic	sample/paren I

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"FifthTest"
	invokevirtual	java/io/PrintStream.println(Ljava/lang/String;)V

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"prec"
	invokevirtual	java/io/PrintStream.println(Ljava/lang/String;)V

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	getstatic	sample/prec I
	invokevirtual	java/io/PrintStream.println(I)V

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	ldc	"paren"
	invokevirtual	java/io/PrintStream.println(Ljava/lang/String;)V

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	getstatic	sample/paren I
	invokevirtual	java/io/PrintStream.println(I)V

; === Emit the main program epilogue. === 


	getstatic     sample/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method

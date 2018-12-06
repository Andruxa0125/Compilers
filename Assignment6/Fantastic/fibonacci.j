.class public fibonacci
.super java/lang/Object

.field private static _runTimer LRunTimer;
.field private static _standardIn LPascalTextIn;

; intfir=0;

.field private static fir I

; intsec=1;

.field private static sec I

; intn=3;

.field private static n I

; inti=0;

.field private static i I

; inttemp=fir+sec;

.field private static temp I

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
	putstatic        fibonacci/_runTimer LRunTimer;
	new PascalTextIn
	dup
	invokenonvirtual PascalTextIn/<init>()V
	putstatic        fibonacci/_standardIn LPascalTextIn;

; === Emit the code for statements in the main program. === 

	ldc	0
	putstatic	fibonacci/fir I
	ldc	1
	putstatic	fibonacci/sec I
	ldc	3
	putstatic	fibonacci/n I
	ldc	0
	putstatic	fibonacci/i I
LABEL0:
	getstatic	fibonacci/i I
	getstatic	fibonacci/n I
	if_icmplt LABEL1
	ldc 0
	goto LABEL2
LABEL1:
	ldc 1
LABEL2:
	ifne LABEL3
	getstatic	fibonacci/fir I
	getstatic	fibonacci/sec I
	iadd
	putstatic	fibonacci/temp I
	getstatic	fibonacci/sec I
	putstatic	fibonacci/first I
	getstatic	fibonacci/temp I
	putstatic	fibonacci/sec I
	getstatic	fibonacci/i I
	ldc	1
	iadd
	putstatic	fibonacci/i I
	goto LABEL0
LABEL3:

; === Print statement. ===
	getstatic	java/lang/System/out Ljava/io/PrintStream;
	getstatic	fibonacci/sec I
	invokevirtual	java/io/PrintStream.println(I)V

; === Emit the main program epilogue. === 


	getstatic     fibonacci/_runTimer LRunTimer;
	invokevirtual RunTimer.printElapsedTime()V

	return

.limit locals 16
.limit stack 16
.end method

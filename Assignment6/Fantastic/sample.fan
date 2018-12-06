int a;
a = 5;
int b = 15;
int c = a + b;
string stra = "bla";
string strb = "bla";

print("FirstTest");
if (a > 4)
{
    c = c * 5;
}
else
{
    b = b + 10;
}
print("c");
print(c);
print("b");
print(b);

print("SecondTest");
while (b > 10)
{
    a = a + 1;
    b = b - 1;
}
print("a");
print(a);
print("b");
print(b);

if (stra == strb)
{
    stra = "staristrue";
}

int prec = 1 + 2 * 5;
int paren = (1 + 2) * 5;

123;
1 + 2 + 3;

int a = 5;
int b = 15;
int c = a + b;
string str = "bla";
c = 0;

if (a > 4)
{
    c = c * 5;
}
else
{
    b = b + 10;
}

while (b > 10)
{
    a = a + 1;
    b = b - 1;
}

int d;
string mstr;
mstr = "hello";

func int ourFunction(int a, int& b)
{
    b = b * 3;
    int temp = a + b;
    return temp;
}

func ourProcedure()
{
	int localVal = 124;
}

int e = ourFunction(1, b);
ourProcedure();
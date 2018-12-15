func int decAndPrint(int a)
{
	int u;
	u = a;
	print(u);
	if(a == 0)
	{
		return 1;
	}	
	else
	{
		int b;
		b = a - 1;
		decAndPrint(b);
	}
	return 0;
}

func main() 
{
	int j;
	int k = 10;
	j = decAndPrint(k);
	print(j);
}

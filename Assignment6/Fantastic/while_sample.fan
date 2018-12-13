func int bla(int g)
{
	int h = 0;
	
	while (h < 10) 
	{
		h = h + 1;
	}
}

func int gla(int a, int k)
{
	int b = 0;
	while (a < 10) 
	{
		b = k + 1;
		bla(b);
	}
}

func main()
{
	int c = 5;
	int jj = 62;
	int far = 201;
	gla(c);
}


func int bla(int g)
{
	int i;
	i=0;
	while(i<10)
	{
		g = g + 1;
		i = i + 1;
	}
	return g;
}

func main()
{
	
	int a = bla(5);
	print(a);
}


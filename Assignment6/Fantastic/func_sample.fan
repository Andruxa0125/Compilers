func int gla()
{
	int j;
	j = 6;
	j = i;
}
func int bla()
{
	int i;
	i = 5;
	i = gla();
	return i;
}
func main()
{
	int j = 5;
	while(j < 10)
	{
		int b;
		b = 20 + j;
		print(b);
		j = j + 1;
	}
	print(j);
	int a;
	a = gla();
	
	print(a);
}


func main()
{
	int i;
	i = 0;
	string first = "Hello";
	string second = "World";
	if(first > second)
	{
		string d;
		d= "";
		d= first + second;
		print(d);
	}
	else
	{
	   	string r;
		r ="";
		r = second + first;
		print(r);
	}
	second = second + "!";
}

func main()
{
    int fir = 0;
    int sec = 1;
    int n = 8;
    int i = 0;
    while (i < n)
    {
        int temp = fir + sec;
        fir = sec;
        sec = temp;
        i = i + 1;
    }
    print("8th fibonacci number:");
    print(sec);
}


class Pattern 
{
	public static void main(String[] args)
	{
	for(int i=1;i<=5;i++)
    {
        for(int j=(5-i)*2;j>=0;j--)
            System.out.print(" ");
        for(int k=1;k<=i;k++)
            System.out.print("* ");
        System.out.println();
	}
	}
}

//1 5
//2 4
//3 3
//4 2
//5 1
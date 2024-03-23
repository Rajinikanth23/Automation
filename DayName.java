//2.Print name of the day using for loop.

class DayName
{
	public static void main(String[] args)
	{
		for(int i=1;i<=7;i++)
		{
			if(i==1)
				System.out.println(i+":Monday");
			if(i==2)
				System.out.println(i+":Tuesday");
			if(i==3)
				System.out.println(i+":Wednesday");
			if(i==4)
				System.out.println(i+":Thursday");
			if(i==5)
				System.out.println(i+":Friday");
			if(i==6)
				System.out.println(i+":Saturday");
			if(i==7)
				System.out.println(i+":Sunday");
		}
	}
}
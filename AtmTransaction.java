//2.Program for ATM transaction using if statement.
import java.util.Scanner;

class Bank
{
	float balance=10000;
	
	void pinCheck()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your PIN:");
		int pin=input.nextInt();
		if(pin==123)
			transaction();
		else 
			System.out.println("Invalid PIN Entered!");
		input.close();
	}
	
	void transaction()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("1.Current Account\n2.Savings Account\nSelect Your Account Type[1-2]:");
		int type=input.nextInt();
		
		
		if(type==1)
			currentAccount();
		else if(type==2)
			System.out.println("You Don't Have Any Savings Account");
		else 
			System.out.println("Invalid Input");
		input.close();
	}
	
	void currentAccount()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("\n1.Withdraw\n2.Deposit\n3.Check balance\nSelect Your Transation[1-3]:");
		int type=input.nextInt();
		if(type==1)
		{
			System.out.print("\nEnter Amount To Withdraw:");
			float amt=input.nextFloat();
			if(balance-amt>1000)
			{
				balance-=amt;
				System.out.println("\nTransation Succesful! Amount Withdrawn:"+amt);
				System.out.println("Updated Balance:"+balance);				
			}
			else 
				System.out.println("\nMinimum balance Should be 1000");			
		}
		else if(type==2)
		{
			System.out.print("\nEnter Amount To Deposit:");
			float amt=input.nextFloat();
			balance+=amt;
			System.out.println("\nTransaction Succesful Updated Balance Is:"+balance);
		}
		else if(type==3)
			System.out.println("\nAvailable Balance:"+balance);
		else 
			System.out.println("\nInvalid Input!");
		input.close();
	}
}

public class AtmTransaction
{
	public static void main(String[] args)
	{
		Bank b= new Bank();
		b.pinCheck();
	}
}
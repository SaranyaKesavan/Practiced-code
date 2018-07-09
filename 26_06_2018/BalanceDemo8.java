// userdefined exception exercise min bal 1000
import java.util.*;
class BalanceDemo8
{
	public static void main(String... args)
	{
		Scanner sc=new Scanner(System.in);
		int acc_no=0;
		String name;
		double balance=0;
		do{
			try
			{
				System.out.println("Enter your acc_no:");
				acc_no=sc.nextInt();
				if(String.valueOf(acc_no).length()!=10)
				{
					MinBalanceException e=new MinBalanceException("Enter a valid a/c no");
					throw e;
				}
				System.out.println("Enter your name:");
				sc.nextLine();
				name=sc.nextLine();
				do{
					System.out.println("Enter your balance:");
					balance=sc.nextDouble();			
					if(balance<1000)
					{
						MinBalanceException e1=new MinBalanceException("balance a minimum balance of 1000");
						throw e1;
				

					}
				}while(balance<1000);
		}
		catch(MinBalanceException b)
		{
			System.out.println(b.getMessage());
		}
		/*catch(MinBalanceException e1)
		{
			System.out.println(e1.getMessage());
		}*/
		}while(String.valueOf(acc_no).length()!=10);
	}
}
class MinBalanceException extends Exception
{
	MinBalanceException(String str)
	{
		super(str);
	}
}

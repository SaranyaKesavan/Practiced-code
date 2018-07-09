//ArithmeticException  and InputMismatchException
import java.util.*;
public class Demo2
{
	public static void main(String... args)
	{
		
		
		while(true)
		{
			Scanner sc=new Scanner(System.in);
		
			try
			{
			System.out.println("Enter a value:");
			int a=sc.nextInt();
			int res=12/a;
			//res=12/a;
			System.out.println("Result "+res);
			break;
			}
				
			catch(ArithmeticException ae)
			{
				System.out.println("only non-zero values");
			}			
			catch(InputMismatchException ie)
			{
				System.out.println("Error.........only integer values");
			}
			catch(Exception e)
			{
				System.out.println("erroorr");
			}
		}
	}
}

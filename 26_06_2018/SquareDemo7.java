//Assertion exercise square
import java.util.*;
class SquareDemo7
{
	public static void main(String... args)
	{
		int number;
		while(true)
		{
			try
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter a number:");
				number=sc.nextInt();
				assert number<=100;
				System.out.println("The square of the given number is "+(number*number)); 
				break;
			}
			catch(AssertionError e)
			{
				System.out.println("Enter a number less than 100!!");
			}
		}
	}
}

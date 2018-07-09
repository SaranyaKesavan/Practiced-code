// user-defined Exception
import java.util.*;
public class Demo4 
{
	public static void main(String args[])
	{
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			try
			{
				System.out.println("Enter reg.no : ");
				String regno=sc.nextLine();
				if(regno.length()!=10)
				{
					MyException d=new MyException();
					throw d;
				}
				System.out.println("Entered number "+regno+" is valid");
				break;
			}
			catch(MyException d)
			{
				System.out.println("Invalid Number-----"+d.getCause());
			}
		}
	}
}
class MyException extends Exception
{
	/*MyException(String str)
	{
		super(str);
	}*/
}

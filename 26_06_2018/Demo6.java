//Assertion example
import java.util.*;
class Demo6
{
	public static void main(String... args)
	{
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age--");
		age=sc.nextInt();
		assert (age<20);
		System.out.println("hi");
	}
}

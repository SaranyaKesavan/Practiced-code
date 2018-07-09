//throws() using IOException
import java.io.*;
import java.util.*;
public class Demo5
{
	public static void main(String... args) 
	{
		InputStreamReader d=new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(d);
		int a;
		//int b,c;
		a=bf.read();
		//b=Integer.parseInt(d.readLine());
		//c=a+b;
		System.out.println("Sum is ----"+a);
	}
}

//task...
import java.io.*;
import java.util.*;
class Demo10
{
	public static void main(String... args)
	{
		String str,line=null;
		try
		{		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a string:");
			str=sc.nextLine();
			File f=new File(str);
			if(f.isDirectory())
			{
				for(String i:f.list())
					System.out.println(i);
				
			}
			else
			{
				BufferedReader bf=new BufferedReader (new FileReader(str));
				while((line=bf.readLine())!=null)
					System.out.println(line);
				bf.close();
			}		
		}
		catch(Exception e){}
	}
}

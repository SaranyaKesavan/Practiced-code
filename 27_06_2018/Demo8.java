//File read --- character
import java.io.*;
public class Demo8
{
	public static void main(String... args)
	{
		String filename="tw0.txt";
		try
		{
			int line=0;
			BufferedReader bf=new BufferedReader(new FileReader(filename));
			while((line=bf.read())!=-1)
			{	char c=(char)line;
				System.out.println(c);
			}
			bf.close();
		}
		catch(IOException e)
		{
			System.out.println("error writing file..."+filename);
			e.printStackTrace();
		}
	}
}

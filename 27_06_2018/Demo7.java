//File read --- character
import java.io.*;
public class Demo7
{
	public static void main(String... args)
	{
		String filename="tw0.txt";
		try(BufferedReader bf=new BufferedReader(new FileReader(filename));)
		{
			String line=null;
			//BufferedReader bf=new BufferedReader(new FileReader(filename));
			while((line=bf.readLine())!=null)
			{
				System.out.println(line);
			}
			//bf.close();
		}
		/*catch(IOException e)
		{
			System.out.println("error writing file..."+filename);
			e.printStackTrace();
		}*/
	}
}

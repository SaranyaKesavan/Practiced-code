//File Write----appending new data with out overridding--Binary
import java.io.*;
public class Demo3
{
	public static void main(String []args)
	{
		String filename="test.txt";
		try
		{
			String bytes = "\nkonnichiwa ohayogozimasu!";
			byte[] buffer=bytes.getBytes();
			FileOutputStream os=new FileOutputStream(filename,true);
			os.write(buffer);
			os.close();
	
			System.out.println("File created as "+buffer.length+" bytes.");
		}
		catch(IOException e)
		{
			System.out.println("Error writing file "+filename);
			e.printStackTrace();
		}
	}
}

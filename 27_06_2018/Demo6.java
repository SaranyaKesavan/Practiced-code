//file write-- character
import java.io.*;
public class Demo6
{
	public static void main(String... args) throws IOException
	{
		String filename="tw0.txt";
		try
		{
			FileWriter fw= new FileWriter(filename,true                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               );
			BufferedWriter bw= new BufferedWriter(fw);
			bw.write("konnichiwa!");
			bw.newLine();
			bw.write("wakarimasu ka?\nhai");
			bw.close();		
		}
		finally
		{
			System.out.println("yokoso!!!");
		}
	}
}

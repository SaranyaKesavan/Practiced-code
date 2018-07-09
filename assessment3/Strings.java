import java.util.*;
import java.io.*;
import java.util.regex.*;

class Strings
{
	public static void main(String []args)
	{
		String pattern,fileName;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a pattern to check :");
		pattern = sc.nextLine();
		System.out.println("Enter the name of the file to be checked :");
		fileName = sc.nextLine();
		CheckPattern cp = new CheckPattern();
		cp.patternMatching(pattern, fileName);
	}
}

class CheckPattern
{
	void patternMatching(String pattern, String fileName)
	{
		String line=null;
		try{
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		
		System.out.println("The strings matching the given pattern are :");
		while((line = br.readLine())!=null)
		{
			if(Pattern.matches(pattern, line))
				System.out.println(line);
		
		}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
}

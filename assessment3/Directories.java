import java.util.*;
import java.io.*;

class Directories
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String directoryName;
		System.out.println("Enter a directory name : ");
		directoryName=sc.nextLine();
		ExpandDirectory ed = new ExpandDirectory();
		ed.displayFiles(directoryName);
		
	}
}
class ExpandDirectory
{
	void displayFiles(String directoryName)
	{
		File f=new File(directoryName);
		
		if(f.isDirectory())
		{
			System.out.println("Files in the given directory are : ");		
			for(String s: f.list())
				System.out.println("-->"+s);
		}
	}
}

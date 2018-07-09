// properties files 
import java.util.*;
import java.io.*;
class Demo1
{
	public static void main(String... saran) throws Exception
	{
		Properties p=new Properties();
		OutputStream os= new FileOutputStream("test1.properties");
		
		// setting values to properties
		p.setProperty("user","saranya");
		p.setProperty("password","pass");
		
		// storing property values to file
		p.store(os,null);
		
	}
}

import java.io.*;
class Demo5
{
	public static void main(String args[]) throws IOException
	{
		
		byte b[]=new byte[10000];
		try(FileInputStream fis=new FileInputStream("test.txt");
FileOutputStream fos=new FileOutputStream("test4.txt"))
		{		
						
			int len=fis.read(b);			
			
				fos.write(b,0,len);
			
			//fis.close();
			//fos.close();
		}
		
	}
}

//serialization and deserialization
import java.io.*;
class Demo implements Serializable
{
	public transient int a;
	public  transient String b;
	Demo(int a,String b)
	{
		this.a=a;
		this.b=b;
	}
}
class Demo11
{
	public static void main(String... saran)
	{
		Demo obj=new Demo(107,"Saranya");
		String filename="test11.txt";
		//serialization
		try
		{
			// saving of object in a file
			FileOutputStream file=new FileOutputStream(filename);
			ObjectOutputStream out=new ObjectOutputStream(file);
			
			//method for serialization of object
			out.writeObject(obj);
			out.close();
			file.close();
			
			System.out.println("object has been serialized");
		}
		catch(IOException e)
		{
			System.out.println("IOException");
		}
		Demo obj1=null;
		//deserialization
		try
		{
			//reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in=new ObjectInputStream(file);
			//method for deserialization of object
			obj1=(Demo)in.readObject();
			in.close();
			file.close();
			
			System.out.println("object has been deserialized");
			System.out.println("a= "+obj1.a);
			System.out.println("b= "+obj1.b);
		}
		catch(IOException e)
		{
			System.out.println("IOException caught");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("ClassNotFoundException is caught");
		}
	}
}//end

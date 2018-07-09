class Fs
{
	
	public static void main(String... args)
	{
		//System.out.println(x);
		Aa.display();
	}
}
class Aa
{
	//final static int x;
	
	public final static void display()
	{
		//x=10;
		System.out.println("hey there");
	}
}

class Bb extends Aa
{
	Bb()
	{
		super();                                                                                                           
	}	
	
	/*public final static void display()
	{
		//x=10;
		System.out.println("hey there");
	}*/	
}

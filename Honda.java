abstract class Bike
{
	abstract int no;
	Bike()
	{
		System.out.println("******");
	}
	abstract void run();	
	
}
class Honda extends Bike
{
	void run()
	{
		System.out.println("running");
		//super.run();
	}
	public static void main(String... args)
	{
		Bike b=new Honda();
		b.run();
	}
}

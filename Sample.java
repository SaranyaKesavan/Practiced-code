interface A
{
	void display();
	/*{
		System.out.println("******");
	}*/
}
interface B 
{
	void display();
	/*{
		System.out.println("huhhhuu");
	}*/

}
interface c extends B,A
{
	void dispaly();
	/*{
		System.out.println("12334");
	}*/
}
class Sample implements A
{
	public static void main(String... args)
	{
		
		A a=new Sample();
		a.display();
	}
	protected void display()
		{
			System.out.println("huhhhuu");
		}
}

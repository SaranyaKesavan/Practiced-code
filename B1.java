class A1
{
	A1()
	{
		System.out.println("no prob");
	}
	A1(int i)
	{
		System.out.println(i);
	}
	A1(double x)
	{
		System.out.println(x);
	}
}

class B1 extends A1
{
	B1()
	{
		super();
		//super(2);
		//super(7.6);
	}
	B1(int i)
	{
		super(2);
	}
	B1(double a)
	{
		super(85.36); 
	}
	public static void main(String[] args)
	{
		B1 b=new B1();
	}
}

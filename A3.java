public class A3
{
	void f()
	{
		System.out.println("in A:f()");
	}
	public static void main(String args[])
	{
		A3 c=new B();
		c.f();
	}
}

class B extends A3
{
	public void f()
	{	System.out.println("in B:f()");}
}
	


public class A31
{
	private void f()
	{
		System.out.println("in A:f()");
	}
	public static void main(String args[])
	{
		A31 c=new B();
		c.f();
	}
}

class B extends A31
{
	public void f()
	{	System.out.println("in B:f()");}
}
	


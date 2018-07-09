class A
{
	void m1()
	{
		System.out.println("hi");
	}
}
class B extends A
{
	void m2()
	{
		System.out.println("saran");
	}
}
class C extends B
{
	void m3()
	{
		System.out.println("hi Saran!");
	}
}
class Task2
{
	public static void main(String... args)
	{
		C c=new C();
		B b=(B) c;
		C cc=(C) b;
		System.out.println(c);
		System.out.println(b);
		c.m1();
		c.m2();
		c.m3();
	}
}

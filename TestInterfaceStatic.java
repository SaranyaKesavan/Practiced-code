interface Drawable
{
	void draw();
	static int cube(int x)
	{
		return x*x*x;
	}
}
class Rectangle implements Drawable
{
	public void draw()
	{
		System.out.println("drawing rectangle");
	}
	 int cube(int x)
	{
		return x*x*x;
	}
	 
}
class TestInterfaceStatic
{
	public static void main(String args[])
	{
		Drawable d=new Rectangle();
		d.draw();
		System.out.println(d.cube(3));
	}
}

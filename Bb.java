class Calculate
{
	static
	{
		System.out.println("saran");
	}
	static int cube(int x)
	{
		return x*x*x;
	}
}
class Bb
{
	
	public static void main(String []args)
	{
		//System.out.println("Hello!");
		//Calculate c=new Calculate();
		int res=Calculate.cube(5);
		System.out.println(res);
	                                    
	}
	 
}

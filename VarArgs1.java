class VarArgs1
{
	public static void main(String []args)
	{
		VarArgs v=new VarArgs();
		System.out.println(v.m1());			
	}
	
}
class VarArgs
{
	/*void m1(int []a)
	{
		
	}*/
	
	int m1(int... obj)
	{
		return 10;
	}
}

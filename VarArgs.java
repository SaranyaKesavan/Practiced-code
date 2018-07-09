class VarArgs
{
	public static void main(String []args)
	{
		VarArgs v=new VarArgs();
		System.out.println(v.sum(1,4,5,6));			
	}
	 int sum(int a,int... num)
	{
		int add=0;
		for(int i:num)
			add+=i;	
		return add;
	}
}

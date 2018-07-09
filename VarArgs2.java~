class VarArgs2
{
	public static void main(String []args)
	{
		SumNo v=new SumNo();
		System.out.println(v.sum(10,4,5,6,7));			
	}
	
}
class SumNo
{
	int sum(int a,int... num)
	{
		int add=0;
		if(a%2==0)
		{
			for(int i:num)
			{
				if(i%2==0)
					add+=i;
			}
		}
		else
		{
			
			for(int i:num)
			{
				if(i%2!=0)
					add+=i;
			}
		}	
		return add;
	}
}

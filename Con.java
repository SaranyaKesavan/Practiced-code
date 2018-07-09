class Con
{
	int a;
	Con()
	{
		a=7;
		this.a=8;
		System.out.println(a);
		//System.out.println(this.a);
	}
	public static void main(String args[])
	{
		Con c=new Con();
		//a=7;
		//this.a=8;
		//System.out.println(c.a);
		                              System.out.println(this.a);
	}
}

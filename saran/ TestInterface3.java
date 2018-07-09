interface Bank
{
	float rateOfInterest();
}
interface RBI
{
	int x=5;
}
class SBI implements Bank, RBI
{
	public float rateOfInterest()
	{
		return 9.15f;
	}
}
class PNB implements Bank
{
	public float rateOfInterest()
	{
		return 9.7f;
	}
}
class TestInterface3
{
	public static void main(String[] args)
	{
		//Bank b=new SBI();
		//Bank b=new SBI();
		//Bank b=new SBI();
		Bank b=new SBI();
		System.out.println("ROI:"+b.rateOfInterest()+"----"+b.x);
	}
}

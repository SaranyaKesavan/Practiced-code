import java.util.*;
class Model
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		double principle,interest,time;
		System.out.println("Enter the principle amount:");
		principle = sc.nextDouble();
		System.out.println("Enter the rate of interest:");
		interest = sc.nextDouble();		
		System.out.println("Enter the time period in months:");
		time = sc.nextDouble();
		SimpleInterest si=new SimpleInterest(principle,interest,time);
		si.computeSimpleInterest(principle,interest,time);
	}
}

class FixedDeposit
{
	double principle,interest,time,simpleinterest;
	
	FixedDeposit(double principle,double interest,double time)
	{
		this.principle=principle;
		this.interest=interest;
		this.time=time;
	}
	void computeSimpleInterest(double principle,double interest,double time)
	{
		simpleinterest = (this.principle * this.interest * this.time)/100;
		System.out.println("The simple interest is Rs."+simpleinterest);
	}
}

class SimpleInterest extends FixedDeposit
{
	SimpleInterest(double principle,double interest,double time)
	{
		super(principle,interest,time);
	}
	void computeSimpleInterest(double principle,double interest, double time)
	{
		super.computeSimpleInterest(principle,interest,time);
	}
}

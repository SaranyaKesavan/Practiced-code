import java.util.Scanner;
import java.lang.Math;
class AccountDetails
{
	int acc_no;
	String name;
	double principle;
	double interest;
	int year;
	//int num_of_times;
	AccountDetails(int no,String name,double p,double i,double year)
	{
		acc_no=no;
		name=name;
		principle=p;
		interest=i;
		year=year;
		//no_of_times=n;
	}
	void simpleInterest(double principle,double interest,int year)
	{
		double si;
		si=(principle*interest*year)/100;
		System.out.println("Simple Intrest : "+si);
	}
	void compoundInterest(double p,double i,int n)
	{
		double ci;
		ci=p*Math.pow((1+i/100),n);
		System.out.println("Compound Interest : "+ci);
		
	}
	 
}
class Account
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int acc_no=sc.nextInt();
		String name=sc.next();
		double principle=sc.nextDouble();
		double interest=sc.nextDouble();
		int year=sc.nextInt();
		//int num_of_times=sc.nextInt();
		//AccountDetails ad=new AccountDetails();		
		AccountDetails ad=new AccountDetails(acc_no,name,principle,interest,year);
		//ad.AccountDetails(acc_no,name,principle,interest,year,num_of_times);
		ad.simpleInterest(principle,interest,year);
		ad.compoundInterest(principle,interest,year);
	}
}

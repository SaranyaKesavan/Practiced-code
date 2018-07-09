import java.util.Scanner;
class Emp
{
	int empid;
	String ename;
	double basicPay;
	double gp;
	double detection;
	//Emp e1=new Emp();
	Emp(int id,String name,double bp)
	{
		empid=id;
		ename=name;
		basicPay=bp;
		//display();
	}
	
	private  void computeGrosspay(double bp)
	{
		double da=.15*bp;
		double hra=.1*bp;
		gp=da+hra+bp;
		System.out.print("DA : "+da+"\nHRA : "+hra+"\nGross Pay :"+gp);
	}
	private  void computeDetection(double bp)
	{
		double pf=.8*bp;
		double tax=.2*bp;
		detection=pf+tax;
		System.out.print("\nPF : "+pf+"\nTax : "+tax+"\nDetection :"+detection);
	}
	private  void takeHome(double gp,double detection)
	{
		double netPay=gp-detection;
		System.out.print("\nNet Pay :"+netPay+"\n");
	}
	void display()
	{
		System.out.print("Employee Id : "+empid+"\nEmployee Name : "+ename+"\nBasic Pay : "+basicPay+"\n");
	computeGrosspay(basicPay);
	computeDetection(basicPay);
	takeHome(gp,detection);
	}
}

class Emp1 extends Emp
{
	Emp1(int id,String name,double bp)
	{
		super(id,name,bp);
	}
	private void computeGrosspay(double bp)
	{
		double da=.15*bp;
		double hra=.1*bp;
		gp=da+hra+bp;
		System.out.print("DA : "+da+"\nHRA : "+hra+"\nGross Pay :"+gp);
	}
	private void computeDetection(double bp)
	{
		double pf=.8*bp;
		double tax=.2*bp;
		detection=pf+tax;
		System.out.print("\nPF : "+pf+"\nTax : "+tax+"\nDetection :"+detection);
	}
	private void takeHome(double gp,double detection)
	{
		double netPay=gp-detection;
		System.out.print("\nNet Pay :"+netPay+"\n");
	}
	void display()
	{
		System.out.print("Employee Id : "+empid+"\nEmployee Name : "+ename+"\nBasic Pay : "+basicPay+"\n");
	computeGrosspay(basicPay);
	computeDetection(basicPay);
	takeHome(gp,detection);
	}
}
class Employee1
{
	public static void main(String... args)
	{
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		double bp=sc.nextDouble();
		Emp1 e=new Emp1(id,name,bp);
		//e.computeGrosspay(bp);
		//e.computeDetection(bp);
		//e.takeHome(e.gp,e.detection);
		e.display();
		
	}
}

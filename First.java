import java.util.Scanner;
class Employee
{
	private int eno;
	public void setEno(int no)
	{
		 eno=no;
	}
	public int getEno()
	{
		return eno;
	}
}
class First
{
	public static void main(String... args)
	{
		Employee e=new Employee();
		e.setEno(101);
		System.out.println("Number is : "+e.getEno());
	}
}

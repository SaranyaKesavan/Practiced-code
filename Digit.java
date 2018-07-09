import java.util.Scanner;
class Digit
{
	public static void main(String... args)
	{
		int n,digit,sum;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		do
		{
			 sum=0;
			while(n>0)
			{
				digit=n%10;
				sum=sum+digit;
				n/=10;
			}
			n=sum;
		}while(String.valueOf(n).length()!=1);
		System.out.println(n);
	}
}

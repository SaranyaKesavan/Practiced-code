import java.util.*;
class Model3
{
	public static void main(String... args)
	{
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		str=sc.nextLine();
		String arr[]= str.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					count++;
					arr[j]=null;
				}
			}
			if(count>1)
				System.out.println(arr[i]+" "+count+"times");
		}
	}
}

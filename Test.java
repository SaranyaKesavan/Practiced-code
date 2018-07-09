public class Test
{
	 void count(int... objs)
	{
		System.out.println(objs.length);
	}
	public static void main(String... args)
	{
		count(1,2,3);
		count(1);
	}
}

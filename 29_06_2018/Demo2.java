public class Demo2
{
	public static void main(String... saran)
	{
		StringBuffer s1=new StringBuffer("3Edge");
		StringBuffer s2=new StringBuffer("Welcome");
		s1.append("Solutions");
		System.out.println(s1.toString());
		s1.insert(2," ");
		System.out.println(s1.toString());
		s1.replace(0,5,"Teamware");
		System.out.println(s1);
		s1.delete(0,9);
		System.out.println(s1);
		String str=s1.substring(5,6);
		System.out.println(str);
		System.out.println(str.toUpperCase());
		System.out.println("length : "+s2.length());
		System.out.println("capacity : "+s2.capacity());
	}
}

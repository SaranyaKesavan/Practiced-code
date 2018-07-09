 enum Season {winter,spring,summer,fall}
class EnumEx1
{
	
	public static void main(String... args)
	{
		for(Season s: Season.values())
			System.out.println(s);
	}
}

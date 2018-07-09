//single inheritence with object casting
class JP
{
	void sendLetter()
	{
		System.out.println("HI*J");
	}
}
class JC extends JP
{
	void receiveLetter()
	{
		System.out.println("HI**J");//super.sendLetter();
	}
}
class MP
{
	void sendLetter()
	{
		System.out.println("HI*M");
	}
}
class MC extends MP
{
	void receiveLetter()
	{
		System.out.println("HI**M");//super.sendLetter();
	}
}
class AP
{
	void sendLetter()
	{
		System.out.println("HI*A");
	}
}
class AC extends AP
{
	void receiveLetter()
	{
		System.out.println("HI**A");//super.sendLetter();
	}
}

class Task3
{
	public static void main(String... args)
	{
		AC a=new AC();
		AP ap=(AP) a;
		ap.sendLetter();
		AC a1=(AC) ap;
		a1.receiveLetter();
		
				
		MC m=new MC();
		MP mp1=(MP) m;
		mp1.sendLetter();
		MC m1=(MC) mp1;
		m1.receiveLetter();


		JC j=new JC();
		JP jp=(JP) j;
		jp.sendLetter();
		JC j1=(JC) jp;
		j1.receiveLetter();

	}
}

//single inheritence with object casting
import java.util.Scanner;
class JP
{
	static String m;
	void sendLetter(String msg)
	{
		m=msg;
		System.out.println("Message sent successfully to Jc !");
	}
}
class JC extends JP
{
	//static String m
	void receiveLetter(String msg)
	{
		System.out.println("msg is "+super.m);//super.sendLetter();
	}
}
class MP
{
	static String m;
	void sendLetter(String msg)
	{
		m=msg;
		System.out.println("Message sent successfully to MC !");		
		//return "how are you?";
	}
}
class MC extends MP
{
	void receiveLetter(String msg)
	{
		System.out.println("msg is "+super.m);//super.sendLetter();
	}
}
class AP
{
	static String m;
	void sendLetter(String msg)
	{
		m=msg;
		System.out.println("Message sent successfully to AC !");
		//return "Hello";
	}
}
class AC extends AP
{
	void receiveLetter(String msg)
	{
		System.out.println("msg is "+super.m);//super.sendLetter();
	}
}

class Task4
{
	public static void main(String... args)
	{
		int state;char relation;
		String msg="";
		Scanner sc=new Scanner(System.in);
		System.out.println("**STATE**\n1.Jarkand\n2.Maharashtra\n3.Andhra Pradesh\n4.Exit\nEnter the state:");
		state=sc.nextInt();
			do{	
			switch(state)
			{
				case 1:System.out.println("Enter p for parent or c for child:");
					relation=sc.next().charAt(0);
					if(relation=='p')
					{
						System.out.println("Please leave the message here:");
						sc.nextLine();
						msg=sc.nextLine();
						JC j=new JC();
						JP jp=(JP) j;
						jp.sendLetter(msg);
						//System.out.println("Message sent successfully!");

					}
					else if(relation=='c')
					{
						System.out.println("Your message is here:");
						JC j=new JC();
						JP jp=(JP) j;
						//jp.sendLetter(msg);
						JC j1=(JC) jp;
						j1.receiveLetter(msg);					
					}
					else
						System.out.println("Invalid Relation");
					break;
				case 2:System.out.println("Enter p for parent or c for child:");
					relation=sc.next().charAt(0);
					if(relation=='p')
					{
						System.out.println("Please leave the message here:");
						sc.nextLine();						
						msg=sc.nextLine();
						MC m=new MC();
						MP mp=(MP) m;
						mp.sendLetter(msg);
						//System.out.println("Message sent successfully!");

					}
					else if(relation=='c')
					{
						System.out.println("Your message is here:");
						MC m=new MC();
						MP mp=(MP) m;
						//mp.sendLetter(msg);
						MC m1=(MC) mp;
						m1.receiveLetter(msg);					
					}
					else
						System.out.println("Invalid Relation");
					break;

				case 3:System.out.println("Enter p for parent or c for child:");
					relation=sc.next().charAt(0);
					if(relation=='p')
					{
						System.out.println("Please leave the message here:");
						sc.nextLine();						
						msg=sc.nextLine();
						AC a=new AC();
						AP ap=(AP) a;
						ap.sendLetter(msg);
						//System.out.println("Message sent successfully!");

					}
					else if(relation=='c')
					{
						System.out.println("Your message is here:");
						AC a=new AC();
						AP ap=(AP) a;
						//ap.sendLetter(msg);
						AC a1=(AC) ap;
						a1.receiveLetter(msg);					
					}
					else
						System.out.println("Invalid Relation");
					break;
				case 4:break;
				default:  
					System.out.println("Invalid State");
				}
				System.out.println();
				System.out.println("**STATE**\n1.Jarkand\n2.Maharashtra\n3.Andhra Pradesh\n4.Exit\nEnter the state:");	
				state=sc.nextInt();
							
				}while(state!=4);
		


		
	}
}

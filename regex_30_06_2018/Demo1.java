import java.util.regex.*;
class Demo1
{
	public static void main(String... saran)
	{
		boolean b;		
		/*Pattern p=Pattern.compile("[a-m]at");
		Matcher m=p.matcher("vat");
		boolean b=m.matches();*/
		//boolean b=Pattern.compile("[a-m]at").matcher("cat").matches();
		//boolean b=Pattern.matches("[b-u]uffy","luffy");	//true
		//boolean b=Pattern.matches("[b-u]y","luffy");	//false
		//***************character class****************
		//b=Pattern.matches("..r..","saran");	//true		
		//b=Pattern.matches("..r.","saran");	//false
		//b=Pattern.matches(".*r.*","saran");	//true
		//b=Pattern.matches(".*r.+","ran");	//true
		//b=Pattern.matches(".+r..","ran");	//false
		//b=Pattern.matches("[a-s]","saran"); 
		//b=Pattern.matches("[a-s]?","sran"); 
		//b=Pattern.matches("[a-s]*","saran");
		//b=Pattern.matches("[a-s]+","saran");				"^.[a-zA-Z].[_\\w]{8,30}"
		//b=Pattern.matches("^[a-s]*","zaran");
		//b=Pattern.matches("^[a-s]*","saran");
		//b=Pattern.matches("^[a-s]$","s");
		//b=Pattern.matches("^[a-s]*","saran");
		//b=Pattern.matches("^[a-z].*[a-z]$","saranya");
		//b=Pattern.matches("^[a-zA-Z].*[a-zA-Z]$","Saranya");   
		//b=Pattern.matches("^.\\w{8,30}","123 4567");  
		//b=Pattern.matches("^.[a-zA-Z]\\w{8,30}","s13654755sdffds*");
	b=Pattern.matches("^.[a-zA-Z][_[\\w]]{7,29}","Samantha");         		
		if(b)
			System.out.println("found");
		else
			System.out.println("not found");
	}
}

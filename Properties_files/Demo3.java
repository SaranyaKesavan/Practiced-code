// using resource bundle
import java.util.Locale;
import java.util.ResourceBundle;
import java.io.*;
class Demo3
{
	public static void main(String []args)throws Exception
	{
		String lang="ja";
		String country="JP";
	
		//Locale lo=new Locale(lang);

		ResourceBundle rb= ResourceBundle.getBundle("JP_Properties");
		
		String str = rb.getString("welcome");
		System.out.println(str);
	}
}


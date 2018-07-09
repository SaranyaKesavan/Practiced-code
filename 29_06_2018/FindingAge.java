import java.io.*;
import java.util.*;

public class FindingAge {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
      //  String line = kb.nextLine()
	while (!line.equals("")) {
   // (your code here)
    	line = sc.nextLine();
	}
        int i=1;
        while((line=sc.nextLine())!=null)
        {
            System.out.println(i+" "+line);
	i++;
        }
    }
}

package hackerrank.daysOfCode;
import java.util.Scanner;
import java.util.*;
public class Day_8 {
	static Scanner in = new Scanner(System.in);
	 static Map<String,Integer> phonebook = new HashMap<String,Integer>();
	   public static void main(String []argh)
	   {
	      int N=in.nextInt();
	      in.nextLine();
	      for(int i=0;i<N;i++)
	      {
	         String name=in.nextLine();
	         int phone=in.nextInt();
	         phonebook.put(name, phone);
	         in.nextLine();
	      }
	      while(in.hasNext())
	      {
	         String s=in.nextLine();
	         if(!phonebook.containsKey(s))
	        	 System.out.println("Not found");
	         else
	        	 System.out.println(s+"="+phonebook.get(s));
	      }
	   }
}

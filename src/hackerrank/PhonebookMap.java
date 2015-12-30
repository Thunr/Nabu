package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhonebookMap {
	
	 public static void main(String []argh)
	   {
	      Scanner in = new Scanner(System.in);
	      int n=in.nextInt();
	      in.nextLine();
	      Map<String, Integer> phonebook = new HashMap<String, Integer>();
	      for(int i=0;i<n;i++)
	      {
	         String name=in.nextLine();
	         int phone=in.nextInt();
	         in.nextLine();
	         phonebook.put(name, phone);
	      }
	      while(in.hasNext())
	      {
	         String s=in.nextLine();
	         Integer i = phonebook.get(s);
	         try{
	        	 int j = i;
	        	 System.out.println(s+"="+j);
	         }
	         catch (java.lang.NullPointerException e){
	        	 System.out.println("Not found");
	         }
	         
	         
	      }
	      in.close();
	   }

}

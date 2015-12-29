package hackerrank;

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
	      int testCases = Integer.parseInt(in.nextLine());
	      while(testCases>0){
	    	  boolean isValid = true;
	    	  String pattern = in.nextLine();
	            try{
	            	Pattern.compile(pattern);
	            }
	            catch (PatternSyntaxException e){
	            	System.out.println("Invalid");
	            	isValid=false;
	            }
	            if(isValid){
	            	System.out.println("Valid");
	            }
	            
	      }

	}

}

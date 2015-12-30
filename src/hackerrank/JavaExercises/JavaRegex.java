package hackerrank.JavaExercises;

import java.util.*;
import java.util.regex.*;

public class JavaRegex {

	 public static void main(String []args)
	    {
	        Scanner in = new Scanner(System.in);
	        while(in.hasNext())
	        {
	            String IP = in.next();
	            System.out.println(IP.matches(new myRegex().pattern));
	        }

	    }

}

package hackerrank.daysOfCode;
import java.util.Scanner;
public class Day_2 {
	static Scanner sc = new Scanner(System.in);
	 public static void main(String[] args) {
		    
	      double M = sc.nextDouble(); // original meal price
	      int T = sc.nextInt(); // tip percentage
	      int X = sc.nextInt(); // tax percentage
	      
	      double tip = M * T /100;
	      double tax = M * X /100;
	      
	      int total = (int) Math.round(M + tip + tax);
	      
	      System.out.println("The final price of the meal is $"+total+".");
	      
	    }
}

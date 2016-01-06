package helper;
import java.util.Scanner;
public class MathFundamentals {
	static Scanner sc = new Scanner(System.in);
	
	//finds greatest common divider of two integers
	static long findGreatestCommonDivider(long a,long b){
		if(a==0||b==0)
			return a + b;
		return findGreatestCommonDivider(b, a%b);
	}
	
	//Finds factorial of N
	
	
}

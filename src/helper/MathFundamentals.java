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
	
	//Finds N choose k
	static void nChooseK(){
		for (int n = 0; n < 10; n++) {
	        int nCk = 1;
	        for (int k = 0; k <= n; k++) {
	            System.out.print(nCk + " ");
	            nCk = nCk * (n-k) / (k+1);
	        }
	        System.out.println();
	    }
	}
	
	
	
}

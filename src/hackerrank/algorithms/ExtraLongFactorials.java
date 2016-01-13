package hackerrank.algorithms;
import java.math.BigInteger;

import java.util.Scanner;
public class ExtraLongFactorials {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BigInteger factorialN = factorial(sc.nextInt());
		System.out.println(factorialN.toString());

	}
	
	
	static BigInteger recfact(int start, int n) {
	    int i;
	    if (n <= 16) { 
	        BigInteger r = new BigInteger(Integer.toString(start));
	        for (i = start + 1; i < start + n; i++) r = r.multiply(new BigInteger(Integer.toString(i)));
	        return r;
	    }
	    i = n / 2;
	    return recfact(start, i).multiply(recfact(start + i, n - i));
	}
	static BigInteger factorial(int n) { return recfact(1, n); }
}

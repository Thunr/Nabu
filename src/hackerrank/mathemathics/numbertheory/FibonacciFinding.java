package hackerrank.mathemathics.numbertheory;
import java.util.logging.Logger;

import java.util.Scanner;
public class FibonacciFinding {
	static Scanner sc = new Scanner(System.in);
	
	static long mod = (long)Math.pow(10, 9) + 7;
	static long f0 = 0;
	static long f1 = 0;

	public static void main(String[] args) {
		long T = sc.nextInt();
		while (T > 0) {
			long f0 = 0;
			long f1 = 1;
			long f2 = 1;
			long a = sc.nextLong();
			long b = sc.nextLong();
			long n = sc.nextLong();
			
			
			System.out.println((((a * f0)%mod) + ((b * f1)%mod))%mod);
			T--;
		}
	}
	public static void calculateFibonacci(long f0, long f1, int n0, int n1){
		
	}
	
}

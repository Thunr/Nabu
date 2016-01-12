package hackerrank.mathemathics.numbertheory;
import java.math.BigInteger;

import java.util.Scanner;

//Determine if A is a quadratic residue of M

public class EulersCriterion {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int T = sc.nextInt();
		while (T > 0) {
			/*
			 *tuleb võtta A ^ ((M-1)/2) mod M ja kontrollida, kas see on 1 
			*/
			BigInteger a = new BigInteger(String.valueOf(sc.nextInt()));
			BigInteger m = new BigInteger(String.valueOf(sc.nextInt()));
			BigInteger exponent = m.subtract(new BigInteger("1")).divide(new BigInteger("2"));
			BigInteger residue = a.modPow(exponent, m);
			if( residue.longValue() == 1)
				System.out.println("YES");
			else if (a.longValue() == 0)
				System.out.println("YES");
			else
				System.out.println("NO");
		
			
			T--;
		}

	}
}

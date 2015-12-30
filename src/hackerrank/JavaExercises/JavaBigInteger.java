package hackerrank.JavaExercises;

import java.util.*;
import java.math.*;

public class JavaBigInteger {
	static String a;
	static String b;
	static {
		Scanner sc = new Scanner(System.in);
		a = sc.nextLine();
		b = sc.nextLine();
		sc.close();
	}
	 public static void main(String[] args) {
	       BigInteger i = new BigInteger(a);
	       BigInteger j = new BigInteger(b);
	       String sum = j.add(i).toString();
	       String x = i.multiply(j).toString();
	       System.out.println(sum);
	       System.out.println(x);
	    }
}

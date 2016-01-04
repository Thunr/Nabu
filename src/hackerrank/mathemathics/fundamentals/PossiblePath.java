package hackerrank.mathemathics.fundamentals;
import java.util.Scanner;
public class PossiblePath {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int T = sc.nextInt();
		while (T > 0) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			long x = sc.nextLong();
			long y = sc.nextLong();
			if(findGDC(a, b)==findGDC(x, y))
				System.out.println("YES");
			else
				System.out.println("NO");

			T--;
		}
	}
	static long findGDC(long a,long b){
		if(a==0||b==0)
			return a + b;
		return findGDC(b, a%b);
	}
}

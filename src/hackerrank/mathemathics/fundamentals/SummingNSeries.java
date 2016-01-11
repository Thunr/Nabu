package hackerrank.mathemathics.fundamentals;
import java.util.Scanner;
public class SummingNSeries {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int T = sc.nextInt();
		while (T > 0) {
			long N = sc.nextLong();
			long mod = (int)(Math.pow(10, 9)+7);
			long answer = ((N%mod)*(N%mod))%mod;
			System.out.println(answer);
			T--;
		}

	}
}

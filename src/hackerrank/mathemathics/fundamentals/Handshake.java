package hackerrank.mathemathics.fundamentals;
import java.util.Scanner;
public class Handshake {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int T = sc.nextInt();
		while (T > 0) {
			int n = sc.nextInt();
			int handShakes = n*(n-1)/2;
			System.out.println(handShakes);
			T--;
		}

	}
}

package hackerrank.mathemathics.fundamentals;
import java.util.Scanner;
public class ReverseGame {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int T = sc.nextInt();
		while (T > 0) {
			int N = sc.nextInt();
			int indexInN = sc.nextInt();
			if(indexInN<(N-1)/2)
				System.out.println(indexInN*2+1);
			else
				System.out.println((N-1-indexInN)*2);
			T--;
		}

	}
}

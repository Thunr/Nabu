package hackerrank.daysOfCode;
import java.util.Scanner;
public class Day_5 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int T = sc.nextInt();
		while (T > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int N = sc.nextInt();
			for(int i = 0;i<N;i++){
				a += (int)Math.pow(2, i)*b;
				System.out.print(a+" ");
			}
			System.out.println();
			T--;
		}

	}
}

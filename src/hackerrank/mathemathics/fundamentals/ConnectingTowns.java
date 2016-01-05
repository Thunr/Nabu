package hackerrank.mathemathics.fundamentals;
import java.util.Scanner;
public class ConnectingTowns {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int T = sc.nextInt();
		while (T > 0) {
			int towns = sc.nextInt();
			int answer = 1;
			while (towns > 1){
				System.out.println("Answer is "+answer);
				answer = (answer*sc.nextInt())%1234567;
				towns--;
			}
			System.out.println(answer);
			T--;
		}

	}
}

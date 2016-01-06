package hackerrank.mathemathics.fundamentals;
import java.util.Scanner;
public class StrangeGrid {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		long row = sc.nextLong();
		int column = sc.nextInt();
		long answer = 10*((row-1)/2) + (row-1)%2 + (column-1)*2;
		System.out.println(answer);

	}
}

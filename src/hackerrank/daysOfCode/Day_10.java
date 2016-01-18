package hackerrank.daysOfCode;
import java.util.Scanner;
public class Day_10 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		long T = sc.nextLong();
		while (T > 0) {
			long N = sc.nextLong();
			String binary = "";
			while(N>0){
				binary = N%2 + binary;
				N = N/2;
			}
			System.out.println(binary);
			T--;
		}
	}
}

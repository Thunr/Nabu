package hackerrank.mathemathics.fundamentals;
import java.util.Scanner;
public class Restaurant {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int T = sc.nextInt();
		while (T > 0) {
			int lenght = sc.nextInt();
			int width = sc.nextInt();
			System.out.println(lenght*width/(int)Math.pow(findGDC(lenght, width), 2));
			T--;
		}
	}
	static long findGDC(long a,long b){
		if(a==0||b==0)
			return a + b;
		return findGDC(b, a%b);
	}
}

package hackerrank.mathemathics.fundamentals;
import java.util.Scanner;
public class FindPoint {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int T = sc.nextInt();
		while (T>0){
			int px = sc.nextInt();
			int py = sc.nextInt();
			int qx = sc.nextInt();
			int qy = sc.nextInt();
			qx = 2*qx - px;
			qy = 2*qy - py;
			System.out.println(qx+" "+qy);
			T--;
		}

	}
}

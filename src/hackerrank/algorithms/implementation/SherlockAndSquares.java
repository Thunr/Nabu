package hackerrank.algorithms.implementation;
import java.util.Scanner;
public class SherlockAndSquares {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int t = sc.nextInt();
		while(t>0){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int count = 0;
			double root_a = Math.sqrt(a); //1,7 > 2
			double root_b = Math.sqrt(b); //3
			if(!(Math.ceil(root_a)<root_a))
				count++;
			count += (int)(Math.floor(root_b))-(int)(Math.ceil(root_a));
			System.out.println(count);
			t--;
		}

	}
}

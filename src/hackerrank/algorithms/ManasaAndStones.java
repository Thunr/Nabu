package hackerrank.algorithms;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import java.util.Scanner;
public class ManasaAndStones {
	static Scanner sc = new Scanner(System.in);
	static SortedSet<Integer> endings = new TreeSet<Integer>();

	public static void main(String[] args) {
		int T = sc.nextInt();
		while (T > 0) {
			endings.clear();
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			findPath(a, b, n, 0);
			for(Integer i : endings)
				System.out.print(i + " ");

			System.out.println();
			T--;
		}
	}
	
	public static void findPath(int a, int b, int n, int sum){
		if(n==1)
			endings.add(sum);
		else{
			n--;
			findPath(a, b, n, sum+a);
			findPath(a, b, n, sum+b);
		}
	}
}

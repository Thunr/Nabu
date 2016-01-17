package hackerrank.algorithms.implementation;

import java.util.Scanner;
public class ManasaAndStones {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int T = sc.nextInt();
		while (T > 0) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int smaller = 0;
			int bigger = 0;
			if(a==b){
				System.out.print((n-1)*a);
			}			
			else{
				if(a>b){
					smaller = b;
					bigger = a;
				}
				else{
					smaller = a;
					bigger = b;
				}
				int base = (n-1)*smaller;
				int difference = bigger - smaller;
				for (int i = 0; i<n;i++)
					System.out.print(base + (difference * i)+" ");
					
			}
			System.out.println();
			T--;
		}
	}
}

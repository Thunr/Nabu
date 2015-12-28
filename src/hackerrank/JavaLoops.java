package hackerrank;

import java.util.Scanner;

public class JavaLoops {
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a[] = new int[500];
		int b[] = new int[500];
		int n[] = new int[500];
		for (int i = 0;i<t;i++){
			sc.nextLine();
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			n[i] = sc.nextInt();
		}
		for(int i = 0;i<t;i++){
			for (int j = 1;j<n[i]+1;j++){
				System.out.print(a[i]+b[i]*((int)(Math.pow(2, j)-1))+" ");
			}
			System.out.println("");
		}
	}

}

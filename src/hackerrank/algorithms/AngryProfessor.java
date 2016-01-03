package hackerrank.algorithms;

import java.util.Scanner;

public class AngryProfessor {

	private static Scanner sc;

	public static void main(String[] args){
		sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0){
			int N = sc.nextInt(); //total students in the class
			int K = sc.nextInt(); //
			int present = 0;

			while(N>0){
				int i = sc.nextInt();
				if(i<=0)
					present++;
				N--;
			}
			if(present>=K)
				System.out.println("NO");
			else
				System.out.println("YES");
			T--;
		}
	}
	
}

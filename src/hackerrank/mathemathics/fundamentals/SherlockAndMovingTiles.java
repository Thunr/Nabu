package hackerrank.mathemathics.fundamentals;

import java.util.Scanner;

public class SherlockAndMovingTiles {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		long L = sc.nextInt();
		int deltaSpeed = Math.abs(sc.nextInt()-sc.nextInt());
		int numberOfQueries = sc.nextInt();
		
		while(numberOfQueries>0){
			double q = sc.nextDouble();
			double time = (Math.sqrt(2*L*L) - Math.sqrt(2*q))/deltaSpeed;
			System.out.println(time);
			numberOfQueries--;
		}

	}

}

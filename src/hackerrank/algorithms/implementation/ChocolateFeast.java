package hackerrank.algorithms.implementation;
import java.util.Scanner;
public class ChocolateFeast {
	static Scanner sc = new Scanner(System.in);
	static int chocCount = 0;
	static int bonus;

	public static void main(String[] args) {
		int T = sc.nextInt();
		while(T>0){
			int n = sc.nextInt(); 
			int c = sc.nextInt();					
			chocCount = n / c;
			bonus = sc.nextInt();
			shop(chocCount);
			System.out.println(chocCount);
			T--;
		}
	}
	
	static void shop(int wrappers){
			int newCandy = wrappers/bonus;
			chocCount +=newCandy;
			wrappers = wrappers%bonus + newCandy;
			if(wrappers >= bonus)
				shop(wrappers);
		}
			
}


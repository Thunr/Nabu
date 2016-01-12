package hackerrank.mathemathics.fundamentals;
import java.util.Scanner;
public class DiwaliLights {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int T = sc.nextInt();
		while (T > 0) {
			int N = sc.nextInt();
			System.out.println(getTwoPowersMod100k(N, 1) - 1);
			T--;
		}
	}
	static int getTwoPowersMod100k(int power, int currentValue){
		currentValue = (currentValue*2)%100000;
		if(power==1)
			return currentValue;
		else
			return getTwoPowersMod100k(power-1, currentValue);		
	}
}

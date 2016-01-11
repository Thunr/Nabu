package hackerrank.mathemathics.fundamentals;
import java.util.Scanner;
public class SherlockAndDivisors {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int T = sc.nextInt();
		while (T > 0) {
			int N = sc.nextInt();
			int squareRootRemaining = (int)Math.ceil(Math.sqrt(N));
			int dividedByTwo = 0;
			int dividedByOthers = 0;
			for(int i = 2;i<=squareRootRemaining;i++){
				if(N%i==0){
					if(i==2)
						dividedByTwo++;
					else
						dividedByOthers++;
					N = N/i;
					i--;
				}
								
			}
			System.out.print(101-T+" has divisors with 2   ");
			if(dividedByTwo==0){
				System.out.println(0);
			}
			else
				System.out.println(dividedByOthers*dividedByOthers*(dividedByTwo-1)+dividedByTwo);
			T--;
		}

	}
}

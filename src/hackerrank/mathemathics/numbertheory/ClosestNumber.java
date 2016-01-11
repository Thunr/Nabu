package hackerrank.mathemathics.numbertheory;
import java.util.Scanner;
public class ClosestNumber {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int T = sc.nextInt();
		while (T > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int x = sc.nextInt();
			if(b<=-2 || b==0)
				if(x==1)
					System.out.println(1);
				else
					System.out.println(0);
			else{
				int poweredInt = (int)Math.pow(a, b);
				int mod = poweredInt%x;
				if(mod<=x/2)
					System.out.println(poweredInt-mod);
				else
					System.out.println(poweredInt+(x-mod));
			}

			T--;
		}

	}
}

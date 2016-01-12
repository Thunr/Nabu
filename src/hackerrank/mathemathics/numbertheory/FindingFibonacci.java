package hackerrank.mathemathics.numbertheory;
import java.util.Scanner;
public class FindingFibonacci {
	static Scanner sc = new Scanner(System.in);
	static long mod = (long)Math.pow(10, 9) + 7;

	public static void main(String[] args) {
		int T = sc.nextInt();
		while (T > 0) {
			long[][] fibonacciMatrix = new long[][]{
				{1,1},
				{1,0}
			};
			long A = sc.nextLong();
			Long B = sc.nextLong();
			int index = sc.nextInt();
			fibonacciMatrix = findNthPowerFibonacci(fibonacciMatrix, index);
			System.out.println((((fibonacciMatrix[1][1]*A)%mod)+((fibonacciMatrix[1][0]*B)%mod))%mod);
			T--;
		}

	}
	
	public static long[][] multiplyMatricesOfTwo(long[][] m1, long[][] m2){
		long a = (m1[0][0]*m2[0][0]+m1[0][1]*m2[1][0])%mod;
		long b = (m1[0][0]*m2[1][0]+m1[0][1]*m2[1][1])%mod;
		long c = (m1[1][0]*m2[0][0]+m1[1][1]*m2[1][0])%mod;
		long d = (m1[1][0]*m2[1][0]+m1[1][1]*m2[1][1])%mod;
		long[][] newMatrix = new long[][]{
			{a,b},
			{c,d}
		};
		return newMatrix;
	}
	
	public static long[][] findNthPowerFibonacci(long[][] M, int index){
		if(index==1)
			return M;
		long[][] R = findNthPowerFibonacci(M, index/2);
		R = multiplyMatricesOfTwo(R, R);
		if(index%2==1)
			R = multiplyMatricesOfTwo(R, M);
		return R;
	}
}

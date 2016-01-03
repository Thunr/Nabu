package hackerrank.algorithms;
import java.util.Scanner;
public class ServiceLane {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int T = sc.nextInt();
		int[] serviceWay = new int[N];
		for (int i =0;i<N;i++)
			serviceWay[i] = sc.nextInt();
		
		while( T>0){
			int i = sc.nextInt();
			int j = sc.nextInt();
			int minSize = 3;
			for(int k = i;k<=j;k++)
				minSize = Math.min(minSize, serviceWay[k]);
			System.out.println(minSize);
			T--;
		}

	}
}

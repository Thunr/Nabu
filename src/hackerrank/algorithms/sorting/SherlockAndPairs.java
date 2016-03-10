package hackerrank.algorithms.sorting;
import java.util.Arrays;
import java.util.Scanner;

public class SherlockAndPairs {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int T = sc.nextInt();
		while (T > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < n; i++){
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			long numberOfPairs = 0;
			long currentValue = Integer.MIN_VALUE;
			long equalValueCount = 1;
			for(int i = 0; i < n; i++){
				if(arr[i]==currentValue)
					equalValueCount++;
				else{
					numberOfPairs += equalValueCount * (equalValueCount - 1);
					currentValue = arr[i];
					equalValueCount = 1;
				}
			}
			numberOfPairs += equalValueCount * (equalValueCount - 1);
			System.out.println(numberOfPairs);
			T--;
		}

	}
}

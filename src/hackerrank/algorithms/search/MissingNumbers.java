package hackerrank.algorithms.search;
import java.util.Scanner;
public class MissingNumbers {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int sizeOfCorruptedArray = sc.nextInt();
		int[] cache = new int[10001];
		int minValue = 10000;
		int maxValue = 1;
		for(int i = 0; i < sizeOfCorruptedArray;i++){
			cache[sc.nextInt()]--;
		}
		int sizeOfOriginalArray = sc.nextInt();
		for(int i = 0; i < sizeOfOriginalArray;i++){
			int n = sc.nextInt();
			cache[n]++;
			if(n < minValue)
				minValue = n;
			if(n > maxValue)
				maxValue = n;
		}
		for(int i = minValue;i <= maxValue;i++){
			if(cache[i]!=0)
				System.out.print(i+" ");
		}
	}
}

package hackerrank.datastructures.arrays;
import java.util.Scanner;
public class ArraysDS {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i = N-1;i>=0;i--)
			arr[i] = sc.nextInt();
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}

package hackerrank.algorithms.search;
import java.util.Scanner;
public class SherlockAndArray {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int T = sc.nextInt();
		while (T > 0) {
			int n = sc.nextInt();
			long sum = 0;
			int[] arr = new int[n];
			for(int i = 0; i < n; i ++){
				int newInt = sc.nextInt();
				sum += newInt;
				arr[i] = newInt;
			}
			long leftSum = arr[0];
			long rightSum = sum - arr[0];
			int index = 1;
			boolean canBeSplit = false;
			while(leftSum<=rightSum && index < arr.length){
				rightSum -= arr[index];
				if(leftSum==rightSum)
					canBeSplit = true;
				leftSum +=arr[index];
				index++;
			}
			if(canBeSplit || n == 1)
				System.out.println("YES");
			else
				System.out.println("NO");
			T--;
		}
	}
}

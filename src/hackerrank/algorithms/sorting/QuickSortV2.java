package hackerrank.algorithms.sorting;
import java.util.Scanner;

//quicksort version that works only if all the elements ar euniquie
public class QuickSortV2 {
	static Scanner sc = new Scanner(System.in);
	
	static int [] arr;

	public static void main(String[] args) {
		int N = sc.nextInt();
		arr = new int[N];
		for (int i = 0;i<N;i++){
			arr[i] = sc.nextInt();
		}
		partitionSort(0,N-1);
	}
	
	static void partitionSort(int startIndex, int endIndex){
		if(endIndex - startIndex >= 1){
			int pivot = arr[endIndex];
			int left = 0;
			for(int i = startIndex; i < endIndex; i++){
				if(arr[i]<pivot){
					exchange(startIndex+left, i);
					left++;
				}
			}
			exchange(startIndex+left, endIndex);
			
			for (int i : arr) {
				System.out.print(i+" ");
			}
			System.out.println();
			
			partitionSort(startIndex, startIndex+left-1);
			partitionSort(startIndex+left+1, endIndex);
		}
	}
	static void exchange(int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}

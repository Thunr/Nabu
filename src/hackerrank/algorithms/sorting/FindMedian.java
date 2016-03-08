package hackerrank.algorithms.sorting;
import java.util.Scanner;
public class FindMedian {
	static Scanner sc = new Scanner(System.in);
	
	static int[] arr;

	public static void main(String[] args) {
		int N = sc.nextInt();
		arr = new int[N];
		
		for(int i = 0; i < N; i++)
			arr[i] = sc.nextInt();
		int median = findValueAtIndex(0, N-1, N/2);
		System.out.println(median);
	}
	
	static int partition(int left, int right, int pivotIndex){
		int pivotValue = arr[pivotIndex];
		arr = swap(arr, pivotIndex, right);
		int storeIndex = left;
		for(int i = left; i < right; i++){
			if(arr[i] < pivotValue){
				arr = swap(arr, storeIndex, i);
				storeIndex++;
			}
		}
		arr = swap(arr, storeIndex, right);
		return storeIndex;
	}
	
	static int findValueAtIndex(int left, int right, int index){
		if(left == right){
			return arr[left];
		}
		int pivotIndex = left + (int)Math.floor(Math.random()*(right-left+1));
		pivotIndex = partition(left, right, pivotIndex);
		if(index == pivotIndex)
			return arr[pivotIndex];
		else if (index < pivotIndex)
			return findValueAtIndex(left, pivotIndex - 1, index);
		else
			return findValueAtIndex(pivotIndex + 1, right, index);
	}
	
	static int[] swap(int[] arr, int indexA, int indexB){
		int holder = arr[indexA];
		arr[indexA] = arr[indexB];
		arr[indexB] = holder;
		return arr;
	}
}

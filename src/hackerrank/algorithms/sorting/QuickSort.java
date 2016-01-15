package hackerrank.algorithms.sorting;
import java.util.Scanner;
public class QuickSort {
	static Scanner sc = new Scanner(System.in);
	
	static int [] arr;

	public static void main(String[] args) {
		int N = sc.nextInt();
		arr = new int[N];
		for (int i = 0;i<N;i++){
			arr[i] = sc.nextInt();
		}
		partitionSort(0,N);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	public static void partitionSort(int start, int end){
		int memoryLenght = end-start;
		int[] memoryArray = new int[memoryLenght];
		int n = arr[start];
		int left = 0;
		int right = 0;
		int leftEnd = 0;
		int rightStart = 0;
		try {
			for(int i = start; i < end;i++){
				if(arr[i]<n){
					memoryArray[left] = arr[i];
					left++;
				}
				else if(arr[i] >n){
					memoryArray[memoryLenght-right-1] = arr[i];
					right++;
				}
			}
			leftEnd = start+left;
			rightStart = end-right;
			for(int i = left;i<memoryLenght-right;i++){
				memoryArray[i] = n;
			}
			
			for(int i = 0; i < memoryLenght;i++){
				arr[start + i] = memoryArray[i]; 
			}
			
				
			if(start<leftEnd)
			partitionSort(start, leftEnd);
			if(end>rightStart)
			partitionSort(rightStart, end);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("---------");
			System.out.println("memoryLenght " + memoryLenght);
			System.out.println("n " + n);
			e.printStackTrace();
			System.exit(0);
		}
	}
}

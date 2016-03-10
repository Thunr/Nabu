package hackerrank.algorithms.search;
import java.util.*;
public class IceCreamParlor {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int T = sc.nextInt();
		while (T > 0) {
			int cost = sc.nextInt();
			int numberOfIceCreams = sc.nextInt();
			int[] arr = new int[numberOfIceCreams];
			for(int i = 1; i <= numberOfIceCreams; i++ ){
				arr[i-1] = sc.nextInt();
			}
			int[] sortedArray = arr.clone();
			Arrays.sort(sortedArray);
			int index = 0;
			boolean pairFound = false;
			while(index < numberOfIceCreams && !pairFound){
				int secondIceCreamCost = cost - arr[index];
				if(binarySearchInt(sortedArray, secondIceCreamCost) != -1){
					int tempIndex = index + 1;
					while(!pairFound && tempIndex < numberOfIceCreams){
						if(arr[tempIndex] == secondIceCreamCost){
							System.out.print((index + 1)+" ");
							System.out.println((tempIndex + 1));
							pairFound = true;
						}
						tempIndex++;
					}
				}
				index++;
			}
			
			T--;
		}

	}
	
	static int binarySearchInt(int[] arr, int key){
		int leftIndex = 0;
		int rightIndex = arr.length-1;
		while(leftIndex!=rightIndex){
			System.out.println(leftIndex+" "+rightIndex);
			int pivot = leftIndex + (rightIndex-leftIndex)/2;
			if(arr[pivot]==key)
				return pivot;
			else if(key > arr[pivot])
				leftIndex = pivot + 1;
			else
				rightIndex = pivot;
		}
		return -1;
	}
	
}

package hackerrank.algorithms.sorting;

import java.util.Scanner;
public class RightCircularRotation {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int sizeOfArray = sc.nextInt();
		int numberOfOperations = sc.nextInt()%sizeOfArray;
		int numberOfQueries = sc.nextInt();
		
		int [] arr = new int[sizeOfArray];
		for(int i = 0; i < sizeOfArray; i++)
			arr[i] = sc.nextInt();
		
		for(int i = 0; i < numberOfQueries; i++){
			int indexInPreRotation = (sc.nextInt() - numberOfOperations + sizeOfArray)%sizeOfArray;
			System.out.println(arr[indexInPreRotation]);
		}
	}
}

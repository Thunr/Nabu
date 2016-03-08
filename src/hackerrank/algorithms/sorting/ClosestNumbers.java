package hackerrank.algorithms.sorting;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import java.util.Scanner;
public class ClosestNumbers {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N =  sc.nextInt();
		int[] unsortedArray = new int[N];
		for (int i = 0; i < N; i++){
			unsortedArray[i] = sc.nextInt();
		}
		Arrays.sort(unsortedArray);
		Queue<Integer> closestPairs = new LinkedList<>();
		int closestDistance = Integer.MAX_VALUE;
		for(int i = 0; i < N - 1; i++){
			int distance = Math.abs(unsortedArray[i] - unsortedArray[i+1]);
			if(distance <= closestDistance){
				if(distance < closestDistance){
					closestPairs.clear();
					closestDistance = distance;
				}
				closestPairs.add(unsortedArray[i]);
				closestPairs.add(unsortedArray[i+1]);
			}
		}
		
		StringBuilder s = new StringBuilder();
		while (!closestPairs.isEmpty()){
			s.append(closestPairs.remove()+" ");
		}
		System.out.print(s.toString());
	}
}

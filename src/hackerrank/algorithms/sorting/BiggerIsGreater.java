package hackerrank.algorithms.sorting;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import java.util.Scanner;
public class BiggerIsGreater {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int T = sc.nextInt();
		sc.nextLine();
		while (T > 0) {
			String s = sc.nextLine(); 										
			char[] arr = s.toCharArray(); 									
			int pivotIndex = arr.length - 1;								
			while(pivotIndex>0&&arr[pivotIndex]<=arr[pivotIndex-1])			
				pivotIndex--;												
			if(pivotIndex==0)												
				System.out.println("no answer");
			else{
				pivotIndex--;
				char pivot = arr[pivotIndex];								
				char nextBiggest = 256;
				int nextBiggestIndex = 0;
				for(int i = pivotIndex+1;i<arr.length;i++){
					if(arr[i]>pivot&&arr[i]<=nextBiggest){
						nextBiggest = arr[i]; 
						nextBiggestIndex = i;
					}
						
				}
				arr[nextBiggestIndex] = pivot;
				arr[pivotIndex] = nextBiggest;
				BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
				try {
					String beginning = String.valueOf(arr, 0, pivotIndex+1);
					log.write(beginning);
					for(int i = arr.length-1;i>pivotIndex;i--){
						log.append(arr[i]);
					}
					log.flush();
					System.out.println();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			T--;
		}

	}
}

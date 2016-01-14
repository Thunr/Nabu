package hackerrank.algorithms.sorting;
import java.util.Scanner;
public class InsertionPart1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int size = sc.nextInt();
		int[] ar = new int[size];
		for(int i = 0;i<size;i++)
			ar[i] = sc.nextInt();
		int unSortedValue = ar[size-1];
		boolean isPlaced = false;
		while(!isPlaced&&size>1){
			if(unSortedValue>=ar[size-2]){
				isPlaced = true;
				ar[size-1]=unSortedValue;
			}
			else
				ar[size-1]=ar[size-2];
			size--;
			for (int i : ar) {
				System.out.print(i);
			}
			System.out.println();
		}
		if(!isPlaced&&size==1){
			ar[0] = unSortedValue;
			for (int i : ar) {
				System.out.print(i);
			}
		}
	}
}

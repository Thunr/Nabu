package hackerrank.JavaExercises;

import java.util.Scanner;

public class D1ArrayHard {
	
	static Scanner sc = new Scanner(System.in);
	static boolean canWin = false;
	
	public static void main(String []argh){
		int T = sc.nextInt();
		
		while (T>0){
			canWin = false;
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0;i<n;i++){
				arr[i] = sc.nextInt();
			}
			canWin(0, arr, m);
			
			
			if(canWin){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
			T--;
		}		
	}
	static void canWin(int Index, int[] arr, int m){
		System.out.println("Currently at index "+Index+" , m value is "+m);
		if(Index + m >= arr.length || Index + 1 >= arr.length){
			canWin = true;
		}
		else {
			arr[Index]=1;
			if(arr[Index+1]==0){
				canWin(Index+1, arr, m);
			}
			if(arr[Index+m]==0){
				canWin(Index+m, arr, m);
			}
			if(Index>0){
				if(arr[Index-1]==0){
					canWin(Index-1, arr, m);
				}
			}
		}
	}
	

}

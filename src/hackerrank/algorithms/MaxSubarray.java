package hackerrank.algorithms;

import java.util.Scanner;

public class MaxSubarray {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		int T = sc.nextInt();
		while(T>0){
			int n = sc.nextInt();
			int[] ar = new int[n];
			boolean hasPositive = false;
			int posSum = Integer.MIN_VALUE;
			int maxCont = Integer.MIN_VALUE;
			for(int i = 0;i<n;i++){
				int k = sc.nextInt();
				ar[i] = k;
				if(k > 0){
					if(!hasPositive){
						hasPositive = true;
						posSum = k;
					}
					else
						posSum += k;
				}
				else{
					if(k>posSum)
						posSum = k;
				}
			}
			
			if ( posSum < 0)
				maxCont = posSum;
			else{
				maxCont = 0;
				int maxHere = 0;
				for (int i : ar) {
					maxHere = Math.max(0, maxHere + i);
					maxCont = Math.max(maxHere, maxCont);
				}
			}
				
			
			System.out.println(maxCont+" "+posSum);
			T--;
		}
	}

}

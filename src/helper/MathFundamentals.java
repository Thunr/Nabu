package helper;
import java.math.BigInteger;

import java.util.Scanner;
public class MathFundamentals {
	static Scanner sc = new Scanner(System.in);
	
	//finds greatest common divider of two integers
	static long findGreatestCommonDivider(long a,long b){
		if(a==0||b==0)
			return a + b;
		return findGreatestCommonDivider(b, a%b);
	}
	
	//Finds N choose k
	static void nChooseK(){
		for (int n = 0; n < 10; n++) {
	        int nCk = 1;
	        for (int k = 0; k <= n; k++) {
	            System.out.print(nCk + " ");
	            nCk = nCk * (n-k) / (k+1);
	        }
	        System.out.println();
	    }
	}
	
	
	//for calculating N!with bigintegers
	static BigInteger recfact(int start, int n) {
	    int i;
	    if (n <= 16) { 
	        BigInteger r = new BigInteger(Integer.toString(start));
	        for (i = start + 1; i < start + n; i++) r = r.multiply(new BigInteger(Integer.toString(i)));
	        return r;
	    }
	    i = n / 2;
	    return recfact(start, i).multiply(recfact(start + i, n - i));
	}
	static BigInteger factorial(int n) { return recfact(1, n); }
	
	
	//insertionsort
	public static int[] insertionSortPart2(int[] ar)
    {       
		for(int i = 1;i<ar.length;i++){
			int sortedNumber = ar[i];
			int index = i;
			while(index>0&&sortedNumber<=ar[index-1]){
				ar[index] = ar[index-1];
				index--;
			}
			ar[index] = sortedNumber;
		}
		return ar;
    } 
	
	
	
}

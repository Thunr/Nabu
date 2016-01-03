package hackerrank.algorithms;

import java.util.Scanner;

public class SherlockAndBeast {
	//5t + 3f = n
	//f = (n - 5t) / 3
	static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    	int T = sc.nextInt();
    	while(T>0){
    		int n = sc.nextInt();
    		boolean isSolvable = false;
    		int numberOfThrees = -5;
    		int numberOfFives = 0;
    		
    		while(!isSolvable && numberOfThrees<=n){
    			numberOfThrees += 5;
    			int d = n-numberOfThrees;
    			if(d%3==0 && d >= 0){
    				isSolvable = true;
    				numberOfFives = d;
    			}
    		}
    		if(isSolvable){
    			while(numberOfFives>0){
    				System.out.print(5);
    				numberOfFives--;
    			}
    			while(numberOfThrees>0){
    				System.out.print(3);
    				numberOfThrees--;
    			}
    		}
    		else
    			System.out.print(-1);
    		System.out.println(); 		
    		T--;
    	}
    }
}
package hackerrank.algorithms;
import java.util.Scanner;
public class UtopianTree {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int T = sc.nextInt();
		while(T>0){
    		int N = sc.nextInt();
    		int height = 0;
    		if(N%2==0)
    			height = (int)Math.pow(2, (N/2+1))-1;
    		else
    			height = (int)Math.pow(2, ((N+1)/2+1))-2;
    		System.out.println(height);
    		T--;
    	}
	}
}

package hackerrank.algorithms.implementation;
import java.util.Scanner;
public class FindDigits {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int T = sc.nextInt();
		while(T>0){
			long n = sc.nextLong();			
			int numCount = 0;
			boolean[] numDivides = new boolean[10];
			for(int i = 1;i<10;i++){
				if(n%i==0)
					numDivides[i] = true;
			}
			char[] arr = Long.toString(n).toCharArray();
			for (char c : arr) {
				for(int i = 1;i<10;i++){
					if(Integer.parseInt(String.valueOf(c)) == i && numDivides[i]){
						numCount++;
					}						
				}
			}
			System.out.println(numCount);
			T--;
		}
	}
}

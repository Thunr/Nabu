package hackerrank.algorithms;
import java.util.Scanner;
public class ModifiedKaprekarNumbers {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int p = sc.nextInt();
		int q = sc.nextInt();
		boolean isInRange = false;
		for(long i = p;i<=q;i++){
			String square = String.valueOf(i*i);
			int breakingPoint = square.length()/2;
			int b = Integer.parseInt(square.substring(breakingPoint));
			int a = 0;
			if(square.length()!=1)
				a = Integer.parseInt(square.substring(0, breakingPoint));
			if(a+b==i){
				isInRange = true;
				System.out.print(i+" ");
			}
		}
		if(!isInRange)
			System.out.println("INVALID RANGE");
	}
}

package hackerrank.algorithms;
import java.util.Scanner;
public class NewYearsParty {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();		
		int queue = 0;
		int currentTime = sc.nextInt();
		for (int i = 0;i<n-1;i++) {
			int t = sc.nextInt();
			if(t == currentTime)
				queue++;
			else{
				if(queue!= 0){
					queue -= (t - currentTime - 1);
					if(queue < 0)
						queue = 0;
				}
				currentTime = t;
			}
		}
		System.out.println(currentTime+queue);
	}
}

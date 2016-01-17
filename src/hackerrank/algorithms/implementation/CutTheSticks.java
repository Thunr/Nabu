package hackerrank.algorithms.implementation;
import java.util.Scanner;
public class CutTheSticks {
	static Scanner sc = new Scanner(System.in);
	static int[] grid = new int[1000];
	static int max = 0;
	static int n = sc.nextInt();

	public static void main(String[] args) {
		int currentMin = 0;
		for (int i = 0;i<n;i++){
			int j = sc.nextInt();
			grid[j]++;
			if (j < currentMin)
				currentMin = j;
			if (j > max)
				max = j;
		}
		cut(currentMin, grid[currentMin]);

	}
	
	static void cut(int currentMin, int cutAmount){
		n -= cutAmount;
		if (n>0&&currentMin<=max){
			System.out.println(n);
			boolean found = false;
			while(!found){
				currentMin++;
				if(grid[currentMin] > 0){
					found = true;
					cut(currentMin, grid[currentMin]);
				}					
			}
			
		}
		
	}
}

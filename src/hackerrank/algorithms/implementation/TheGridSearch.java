package hackerrank.algorithms.implementation;
import java.util.Scanner;
public class TheGridSearch {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int T = sc.nextInt();
		while(T>0){
			boolean isMatch = false;
			int R = sc.nextInt();
			int C = sc.nextInt();
			int[][] grid = mapGrid(R,C);
			int r = sc.nextInt();
			int c = sc.nextInt();
			int[][] pattern = mapGrid(r, c);
			for(int i = 0;i<=R-r;i++)
				for(int j = 0;j<=C-c;j++)
					if(grid[i][j]==pattern[0][0]){
						//System.out.println("patterncheck started");
						boolean misMatchFound = false;
						for(int k = 0;k < r;k++)
							for(int l = 0; l < c;l++)
								if(grid[i+k][j+l]!=pattern[k][l]){
									//System.out.println("misMatch found @ row "+(i+k)+" and column "+(j+l)+" with patternposition " + k+", "+l);
									misMatchFound = true;
									k +=r;
									l +=c;
								}
						if(!misMatchFound){
							//System.out.println("matchfound");
							isMatch = true;
							i += R;
							j += C;
						}
					}
			if(isMatch)
				System.out.println("YES");
			else
				System.out.println("NO");
						
			T--;
		}

	}
	
	static int[][] mapGrid(int Rows, int Columns){
		int[][] grid = new int[Rows][Columns];
		sc.nextLine();
		String s;
		for(int i = 0;i<Rows;i++){
			s = sc.nextLine();
			for(int j = 0;j<Columns;j++)
				grid[i][j] = Character.getNumericValue(s.charAt(j));
		}
			
		return grid;
	}
}

package hackerrank.algorithms;
import java.util.Scanner;
public class CavityMap {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		String grid[] = new String[n];
		int[][] map = new int[n][n];
        for(int grid_i=0; grid_i < n; grid_i++){
            grid[grid_i] = sc.next();
            for(int i = 0;i<n;i++){
            	map[grid_i][i] = Integer.parseInt(grid[grid_i].substring(i, i+1));
            }
        }
		for(int i = 1; i < n-1; i++)
			for(int j = 1; j < n-1;j++){
				int c = map[i][j];
				if(c>map[i+1][j]&&c>map[i-1][j]&&c>map[i][j+1]&&c>map[i][j-1])
					grid[i] = grid[i].substring(0, j)+"X"+grid[i].substring(j+1, n);
			}
		for (String line : grid) {
			System.out.println(line);
		}

	}
}

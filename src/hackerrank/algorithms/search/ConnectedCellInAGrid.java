package hackerrank.algorithms.search;
import java.util.Scanner;
public class ConnectedCellInAGrid {
	static Scanner sc = new Scanner(System.in);
	
	static int area;
	static int[][] matrix;

	public static void main(String[] args) {
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		matrix = new int[rows+2][columns+2];
		for(int i = 1; i <= rows; i++){
			for(int j = 1; j <= columns; j++){
				matrix[i][j] = sc.nextInt();
			}
		}
		int maxArea = 0;
		for(int i = 1; i <= rows; i++){
			for(int j = 1; j <= columns; j++){
				area = 0;
				DepthFirstSearch(i, j);
				if (area > maxArea)
					maxArea = area;
			}
		}
		System.out.println(maxArea);
	}
	
	static void DepthFirstSearch(int row, int column){
		try {
			if (matrix[row][column]==1){
				area++;
				matrix[row][column]=0;
				for(int i = row-1;i <= row + 1; i++){
					for(int j = column -1; j <= column + 1; j++){
						DepthFirstSearch(i, j);
					}
				}
			}
		} catch (Exception e) {
			System.out.println("row: "+row+" column: "+column);
			e.printStackTrace();
			System.exit(1);
		}
	}
	
}

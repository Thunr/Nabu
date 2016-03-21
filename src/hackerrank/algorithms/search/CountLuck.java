package hackerrank.algorithms.search;
import java.util.Scanner;
public class CountLuck {
	static Scanner sc = new Scanner(System.in);
	static int[][] map;
	static int portalRow = 0;
	static int portalColumn = 0;
	static int wandMoves;

	public static void main(String[] args) {
		int T = sc.nextInt();
		while (T > 0) {
			wandMoves = 0;
			int rows = sc.nextInt();
			int columns = sc.nextInt();
			int startingRow = 0;
			int startingColumn = 0;
			
			map = new int[rows+2][columns+2];
			sc.nextLine();
			
			for(int i = 1; i <= rows; i++){
				String s = sc.nextLine();
				for(int j = 1; j <= columns; j++){
					switch (s.charAt(j-1)) {
					case '.':
						map[i][j]=1;
						break;
					case 'X':
						map[i][j]=0;
						break;
					case 'M':
						map[i][j]=1;
						startingRow = i;
						startingColumn = j;
						break;
					case '*':
						map[i][j]=1;
						portalRow = i;
						portalColumn = j;
						break;
					default:
						break;
					};
				}
			}
			int wandGuesses = sc.nextInt();
			move(startingRow, startingColumn, 0);
			if(wandGuesses==wandMoves)
				System.out.println("Impressed");
			else
				System.out.println("Oops!");
			T--;
		}
	}
	
	public static void move(int row, int column, int moves){
		if(row==portalRow&&column==portalColumn)
			wandMoves = moves;
		else{
			map[row][column] = 0;
			int possibleMoves = map[row+1][column] + map[row-1][column] + map[row][column+1] + map[row][column-1];
			if(possibleMoves == 0)
				return;
			if(possibleMoves >= 2)
				moves++;
			if(map[row+1][column]==1)
				move(row+1, column, moves);
			if(map[row-1][column]==1)
				move(row-1, column, moves);
			if(map[row][column+1]==1)
				move(row, column+1, moves);
			if(map[row][column-1]==1)
				move(row, column-1, moves);
		}
	}
}

package topcoder;

public class ABoardGame {
	
	private static int boardLength;
	
	public static String whoWins(String[] board){
		boardLength = board.length;
		int[][] boardMap = new int[boardLength][boardLength];
		for (int i = 0;i<boardLength;i++){
			for (int j = 0;j<boardLength;j++){
				char symbol = board[i].charAt(j);
				if(symbol == 'A'){
					boardMap[i][j]=1;
				}
				else if(symbol == 'B'){
					boardMap[i][j]=-1;
				}
				else{
					boardMap[i][j]=0;
				}
			}
		}
		int n = boardLength/2;
		for(int a = 1; a < n + 1;a++){
			int sum = 0;
			
			for (int i = n - a;i<n+a;i++){
				for (int j = n - a;j<n+a;j++){
					Log("region "+a);
					Log("row:"+i+" column:"+j+" value: "+boardMap[i][j]);
					sum =+ boardMap[i][j];
				}
			}
			
			if (sum > 0){
				Log("Alice");
				return "Alice";
			}
			else if (sum < 0){
				Log("Bob");
				return "Bob";
			}
		}
		Log("Draw");
		return "Draw";
	}
	private static void Log (String log){
		System.out.println(log);
	}

}

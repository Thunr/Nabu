package hackerrank;


import java.util.Scanner;

public class BotClean {
	
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int by = sc.nextInt();
		int bx = sc.nextInt();
		int closestdy = 0;
		int closestdx = 0;
		int closestMoves = 100;
		sc.nextLine();
		for (int y = 0;y<5;y++){
			String row = sc.nextLine();
			for(int x = 0;x<5;x++){
				if(row.charAt(x) == 'd' && Math.abs(by-y)+Math.abs(bx-x) < closestMoves){
					closestdx = x;
					closestdy = y;
					closestMoves = Math.abs(by-y)+Math.abs(bx-x);
				}
			}
		}
		if(bx > closestdx){
			System.out.println("LEFT");
		}
		else if(bx < closestdx){
			System.out.println("RIGHT");
		}
		else if(by > closestdy){
			System.out.println("UP");
		}
		else if((by < closestdy)){
			System.out.println("DOWN");
		}
		else{
			System.out.println("CLEAN");
		}
	}
}

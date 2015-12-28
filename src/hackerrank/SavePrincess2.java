package hackerrank;


import java.util.Scanner;

public class SavePrincess2 {
	
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		int mx = 0;
		int my = 0;
		int px = 0;
		int py = 0;
		sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		sc.nextLine();
		for (int i = 0;i<N;i++){
			String row = sc.nextLine();;
			for(int j = 0;j<N;j++){
				if(row.charAt(j) == 'm'){
					mx = j;
					my = i;
				}
				else if(row.charAt(j) == 'p'){
					px = j;
					py = i;
				}
			}
		}
		if(mx > px){
			System.out.println("LEFT");
		}
		else if(mx > px){
			System.out.println("RIGHT");
		}
		else if(my > py){
			System.out.println("UP");
		}
		else{
			System.out.println("DOWN");
		}
	}

}

package hackerrank;

import java.util.Scanner;

public class SavePrincess {
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		int mx = 0;
		int my = 0;
		int px = 0;
		int py = 0;
		sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0;i<N;i++){
			String row = sc.nextLine();
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
		int Deltax = Math.abs(mx - px);
		int Deltay = Math.abs(my - py);
		for (int i = 0; i<Deltax;i++){
			if(mx > px){
				System.out.println("LEFT");
			}
			else{
				System.out.println("RIGHT");
			}
		}
		for (int i = 0; i<Deltay;i++){
			if(my > py){
				System.out.println("UP");
			}
			else{
				System.out.println("DOWN");
			}
		}

	}

}

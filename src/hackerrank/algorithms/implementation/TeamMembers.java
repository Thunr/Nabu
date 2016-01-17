package hackerrank.algorithms.implementation;
import java.util.Scanner;
public class TeamMembers {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		int maxScore = -1;
		int teamsWithMax = -1;
		int[][] skillsGrid = new int[N][M];
		for(int i = 0;i<N;i++){					//Loops through every persons skillset and stores the values in the grid		
			String s = sc.nextLine();
			int[] personsSkills = new int[M];
			for(int j = 0;j<M;j++){
				int value = Integer.parseInt(s.substring(j, j+1));
//				System.out.print(value);
				personsSkills[j] = value;
			}
			skillsGrid[i] = personsSkills;
//			System.out.println();
			for(int k = i - 1;k>=0;k--){			//compares the newly added person with all the previus persons
				int score = 0;
				for (int l = 0; l < M;l++){
					score += personsSkills[l] | skillsGrid[k][l];
				}
				if(score == maxScore)
					teamsWithMax ++;
				if(score > maxScore){
					maxScore = score;
					teamsWithMax = 1;
//					System.out.println("New max score achieved by teams " + i + " and " + k + " and it's set to "+ maxScore);
				}
			}
		}
		System.out.println(maxScore);
		System.out.println(teamsWithMax);
		
	}
}

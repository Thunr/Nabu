package hackerrank.JavaExercises;

import java.util.Scanner;

public class D1Array {
	static int n;
	static int[] ar;
	static{
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		ar = new int[n];
		sc.nextLine();
		for(int i = 0;i<n;i++){
			ar[i] = sc.nextInt();
		}
		sc.close();
	}
	
	 public static void main(String []argh){
		 int count = 0;
		 for (int i = 0;i<n;i++){ 				//alustab jada algusest. käib kõik liikmed läbi
			 for(int j = i;j<n;j++){ 			//i = 3, j = 4
				 int sum = 0;
				 for(int k = i;k<=j;k++){		//k = 3, j = 4
					 sum+=ar[k];
				 }
				 if(sum<0){
					 count++;					 
				 }
			 }
		 }
		 System.out.println(count);
	 }

}

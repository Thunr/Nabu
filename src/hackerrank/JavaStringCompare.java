package hackerrank;

import java.util.Scanner;

public class JavaStringCompare {
	
	static int n;
	static String s;
	static{
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		n = sc.nextInt();
	}


	public static void main(String[] args) {
		String min = s.substring(0, n);
		String max = s.substring(0, n);
		for (int i = 0;i<=s.length()-n;i++){
			String c = s.substring(i,i+n);
			if(min.compareTo(c)>0){
				min = c;
			}
			if(max.compareTo(c)<0){
				max = c;
			}
		}
		System.out.println(min);
		System.out.println(max);
	}

}

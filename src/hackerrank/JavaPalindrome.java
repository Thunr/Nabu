package hackerrank;

import java.util.Scanner;

public class JavaPalindrome {

	static String s;
	static int l;
	static{
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		l = s.length();
	}
	public static void main(String[] args) {
		String ans = "Yes";
		for(int i = 0;i<=l/2;i++){
			if(s.substring(i,i+1).compareTo(s.substring(l-i-1,l-i))!=0){
				ans = "No";
			}
		}
		System.out.println(ans);
	}

}

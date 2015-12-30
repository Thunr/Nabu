package hackerrank.JavaExercises;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagarams {
	static String a;
	static String b;
	static{
		Scanner sc = new Scanner(System.in);
		a = sc.nextLine();
		b = sc.nextLine();
		sc.close();
	}

	
	public static void main(String[] args) {
		char[] i = a.toLowerCase().toCharArray();
		char[] j = b.toLowerCase().toCharArray();
		Arrays.sort(i);
		Arrays.sort(j);
		String newA = new String(i);
		String newB = new String(j);
		if (newA.compareTo(newB)==0){
			System.out.println("Anagram");
		}
		else{
			System.out.println("NOT Anagram");
		}

	}

}

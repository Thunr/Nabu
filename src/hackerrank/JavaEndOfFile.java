package hackerrank;

import java.util.Scanner;

public class JavaEndOfFile {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Linenr = 0;
		do{
			Linenr++;
			System.out.println(Linenr +" "+ sc.nextLine());
		}while(sc.hasNext());
	}

}

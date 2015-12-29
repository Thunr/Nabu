package hackerrank;

import java.util.*;

public class JavaStringToken {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		scanner.close();
		StringTokenizer multiTokenizer = new StringTokenizer(text, "!,?._'@ ");
		System.out.println(multiTokenizer.countTokens());
		while (multiTokenizer.hasMoreTokens())
		{
		    System.out.println(multiTokenizer.nextToken());
		}

	}

}

package hackerrank.algorithms;
import java.util.Scanner;
public class CaesarCiphre {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = Integer.parseInt(sc.nextLine());
		String s = sc.nextLine();
		char[] oldWord = s.toCharArray();
		int ciphre = sc.nextInt();
		for (int i = 0;i<n;i++){
			int c = (int)oldWord[i];
			if(c>=97&&c<=122)
				oldWord[i] = (char) ((c+ciphre-97)%26+97);
			if(c>=65&&c<=90)
				oldWord[i] = (char) ((c+ciphre-65)%26+65);
		}
		System.out.println(String.valueOf(oldWord));

	}
}

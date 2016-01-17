package hackerrank.algorithms.implementation;
import java.util.Calendar;

import java.util.Scanner;
public class LibraryFines {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int date = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		Calendar actual = Calendar.getInstance();
		Calendar expected = Calendar.getInstance();
		actual.set(year, month, date, 1, 1);
		int dateE = sc.nextInt();
		int monthE = sc.nextInt();
		int yearE = sc.nextInt();
		expected.set(yearE, monthE, dateE, 1, 1);
		if(!actual.after(expected))
			System.out.println(0);
		else{
			if(year > yearE)
				System.out.println(10000);
			else if(month>monthE)
				System.out.println((month - monthE) * 500);
			else
				System.out.println((date - dateE) * 15);
		}
	}
}

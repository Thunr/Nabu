package hackerrank.algorithms;
import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;
public class TheTimeInWords {
	static Scanner sc = new Scanner(System.in);
	static Map<Integer, String> timeValues = new HashMap<Integer, String>();
	static{
		String[] numbers = new String[]{"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
				"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		for(int i = 0;i<20;i++)
			timeValues.put(i, numbers[i]);
		for(int i = 20; i<30; i++)
			timeValues.put(i, ("twenty "+numbers[i-20]).trim());
	}
	

	public static void main(String[] args) {
		int hours = sc.nextInt();
		int minutes = sc.nextInt();
		if(minutes == 0)
			System.out.println(timeValues.get(hours) + " o' clock");
		else if(minutes == 30)
			System.out.println("half past " + timeValues.get(hours));
		else if(minutes == 15)
			System.out.println("quarter past " + timeValues.get(hours));
		else if(minutes == 45)
			System.out.println("quarter to " + timeValues.get(hours+1));
		else if(minutes == 1)
			System.out.println("one minute past " + timeValues.get(hours));
		else if(minutes == 59)
			System.out.println("one minute to " + timeValues.get(hours+1));
		else{
			if (minutes < 30)
				System.out.println(timeValues.get(minutes) + " minutes past " + timeValues.get(hours));
			else
				System.out.println(timeValues.get(60-minutes) + " minutes to " + timeValues.get(hours+1));
		}
			
	}
}

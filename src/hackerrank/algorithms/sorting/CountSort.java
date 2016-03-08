package hackerrank.algorithms.sorting;
import java.util.Scanner;
public class CountSort {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[] numberCount = new int[100];
		int numberAmount = sc.nextInt();
		String[] stringValues = new String[numberAmount];
		int[] intValues = new int[numberAmount];
		for(int i = 0; i < numberAmount; i++){
			int number = sc.nextInt();
			numberCount[number] ++;
			intValues[i] = number;
			stringValues[i] = sc.nextLine().trim();
			if(i<numberAmount/2)
				stringValues[i] = "-";
		}
		int[] elementStart = new int[100];
		int numbersCounted = 0;
		for(int i = 0; i < numberCount.length; i++){
			elementStart[i] = numbersCounted;
			numbersCounted += numberCount[i];			
		}
		String[] orderedStrings = new String[numberAmount];
		int[] numberOfTimesElementUsed = new int[100];
		
		for (int i = 0; i < numberAmount; i++){
			int number = intValues[i];
			orderedStrings[elementStart[number]+numberOfTimesElementUsed[number]] = stringValues[i];
			numberOfTimesElementUsed[number] ++;
		}
		
		StringBuilder outPutString = new StringBuilder();
		
		for (String s : orderedStrings) {
			outPutString.append(s+" ");
		}
		System.out.print(outPutString.toString());
	}
}

package hackerrank;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Predict {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Calendar kalender = Calendar.getInstance();
		kalender.set(2013,10,1);
		int n = sc.nextInt();
		int[] data = new int[n];
		for (int i = 0;i<n;i++){
			data[i] = sc.nextInt();
		}
		List<List<Integer>> monthData = new ArrayList<List<Integer>>(12);
		int[] weekDaySum = new int[7];
		int[] weekDays = new int[7];
		int[] monthDaySum = new int[31];
		int[] monthDays = new int[31];
		int[] months = new int[12];
		int[] monthSum = new int[12];
		for (int i = 0;i<data.length;i++){
			for (int j=0;j<7;j++){
				if(i%j==0){
					weekDaySum[j] = weekDaySum[j]+data[i];
					weekDays[j]++;
				}
			}
			monthData.add(data[i], monthData.get(kalender.get(Calendar.DAY_OF_MONTH)-1));
			monthDaySum[kalender.get(Calendar.DAY_OF_MONTH)-1] =+ data[i];
			monthDays[kalender.get(Calendar.DAY_OF_MONTH)-1] ++;
			monthSum[kalender.get(Calendar.MONTH)-1]++;
			months[kalender.get(Calendar.MONTH)-1]=+ data[i];
			
			
			kalender.add(Calendar.DAY_OF_MONTH,1);
		}
				
		System.out.println(data[7]);
		LogInt(data[7]);
	}
	static void LogInt(int n){
		System.out.println(n);
	}

}

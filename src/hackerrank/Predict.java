package hackerrank;

import java.util.*;
//http://www.tutorialspoint.com/data_mining/dm_tasks.htm
public class Predict {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Calendar kalender = Calendar.getInstance();
		ArrayList<ArrayList<Integer>> monthDayData = createDynamicInt2D(31);
		ArrayList<ArrayList<Integer>> weekDayData = createDynamicInt2D(7);
		ArrayList<ArrayList<Integer>> monthData = createDynamicInt2D(12);
		kalender.set(2013,10,1);
		
		int n = sc.nextInt();
		int[] data = new int[n];
		for (int i = 0;i<n;i++){
			data[i] = sc.nextInt();
		}
		//saving data
		for (int i = 0;i<data.length;i++){
			for (int j=1;j<8;j++){
				if(i%j==0){
					weekDayData.get(j-1).add(data[i]);
				}
			}
			monthDayData.get(kalender.get(Calendar.DAY_OF_MONTH)-1).add(data[i]);
			monthData.get(kalender.get(Calendar.MONTH)-1).add(data[i]);
			kalender.add(Calendar.DAY_OF_MONTH,1);
		}
		//analyzing data
		
	}

	private static ArrayList<ArrayList<Integer>> createDynamicInt2D(int lenght){
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		for (int i = 0;i<lenght;i++){
			list.add(i, new ArrayList<Integer>());
		}
		return list;
	}
}

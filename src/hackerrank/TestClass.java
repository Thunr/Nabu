package hackerrank;

import helper.Logger;

import java.util.ArrayList;
import java.util.Calendar;

public class TestClass {

	static Logger l = new Logger();
	
	public static void main(String[] args) {
		Calendar kalender = Calendar.getInstance();
		kalender.set(2013,10,21);
		ArrayList<ArrayList<Integer>> monthData = createDynamicInt2D(12);
		
		monthData.get(kalender.get(Calendar.MONTH)-1).add(450);
		l.logInt(monthData.get(9).get(0));
		
		Integer n = 4;
		String s = "AAA";
		String d = "BB";
		int x = s.compareTo(d);
		char[] rr= d.toCharArray();
		char f = rr[0];

	}
	
	private static ArrayList<ArrayList<Integer>> createDynamicInt2D(int lenght){
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		for (int i = 0;i<lenght;i++){
			list.add(i, new ArrayList<Integer>());
		}
		return list;
	}
	
	static String capitalizeFirst(String s){
        return s.substring(0)+s.substring(1, s.length());
    }

}

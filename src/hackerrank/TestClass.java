package hackerrank;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calendar kalender = Calendar.getInstance();
		kalender.set(2013,10,21);
		ArrayList<ArrayList<Integer>> monthData = new ArrayList<ArrayList<Integer>>();
		monthData.ensureCapacity(12);
		monthData.add(450, monthData.get(kalender.get(Calendar.MONTH)-1));
		monthData.get(kalender.get(Calendar.MONTH)-1).add(450);
		System.out.println(monthData.get(9).get(0));

	}

}

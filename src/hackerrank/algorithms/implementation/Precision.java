package hackerrank.algorithms.implementation;

import java.math.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Precision {
	
	private static Scanner in;

	public static void main(String[] args) {
        in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00000");
        df.setRoundingMode(RoundingMode.HALF_UP);
        int n = in.nextInt();
        double pos = 0;
        double neg = 0;
        double zero = 0;
        for(int arr_i=0; arr_i < n; arr_i++){
            int a = in.nextInt();
            if(a > 0)
                pos++;
            if(a < 0)
                neg++;
            if (a==0)
                zero++;
        }
        System.out.println(df.format(pos/n));
        System.out.println(df.format(neg/n));
        System.out.println(df.format(zero/n));
	}
}

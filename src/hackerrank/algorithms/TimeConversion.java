package hackerrank.algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00.#");
        String time = in.next();
        int hour = Integer.parseInt(time.substring(0,2));
        String minsek = time.substring(2,8);
        
        if (hour == 12)
        	hour = 0;
        if(time.charAt(8)=='P'){
            hour += 12;
        }
        System.out.println(df.format(hour)+minsek);
    }
}
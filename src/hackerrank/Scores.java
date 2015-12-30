package hackerrank;
import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Scores {
	
	public static void main(String[] args) {
		double Z = 	1.2816;
		double u = 2000;
		double o = 200;
		double X = u + Z*o; 
		BigDecimal a = new BigDecimal(X);
		a = a.setScale(2,BigDecimal.ROUND_HALF_UP);
		System.out.print(a);
	}

	
}

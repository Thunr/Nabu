package hackerrank.JavaExercises;


import java.util.*;


public class JavaTryCatch {
	static Scanner sc = new Scanner(System.in);	
	static	int n;
	static	int m;
	
	public static void main(String[] args) {
		try{
			n = sc.nextInt();
			m = sc.nextInt();
			
			System.out.println(n/m);
		}
		catch (java.util.InputMismatchException e){
			System.out.println("java.util.InputMismatchException");
		}
		catch (java.lang.ArithmeticException e){
			if(m == 0){
				System.out.println("java.lang.ArithmeticException: / by zero");
			}
			else{
				System.out.println("java.lang.ArithmeticException");
			}
		}
		
		
		
        sc.close();
    }
}

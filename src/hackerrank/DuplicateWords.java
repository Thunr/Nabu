package hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords
{
    private static Scanner in;

	public static void main(String[] args){

        String pattern = ""; //suvaline arv a-z s�mboleid, piiravad t�hikud
        Pattern r = Pattern.compile("X korda"+pattern, 0);

        in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String input = in.nextLine();
            Matcher m = r.matcher(input);
            boolean findMatch = true;
            while(m.find( )){
                input = input.replaceAll(r.pattern(),pattern);
                findMatch = false;
            }
            System.out.println(input);
            testCases--;
        }
    }
}
package hackerrank.JavaExercises;

import java.util.regex.Pattern;


class myRegex {
	
	myRegex(){
		String n = "[01]?[0-9]?[0-9]|[2][0-4][0-9]|[2][5][0-5]";
		pattern = "^("+n+")\\.("+n+")\\.("+n+")\\.("+n+")$";
	}

	public String pattern;	

}

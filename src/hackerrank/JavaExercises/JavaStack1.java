package hackerrank.JavaExercises;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack1 {
	

	   public static void main(String []argh)
	   {
	      Scanner sc = new Scanner(System.in);
	      
	      while (sc.hasNext()) {
	    	 boolean isBalanced = true;
	         String input=sc.next();
	         Stack<Integer> stack = new Stack<Integer>();
	         char[] arr = input.toCharArray();
	         for (char c : arr) {
	        	 int i = 0;
	        	 switch (c) {
	             case '(':  i = 1;
	                      break;
	             case '[':  i = 2;
	                      break;
	             case '{':  i = 3;
	                      break;
	             case ')':  i = -1;
	                      break;
	             case ']': i = -2;
	                      break;
	             case '}':  i = -3;
	                      break;
	             default : i = 1;
	                      break;
	         }
	        	 if (i<0){
	        		 try{
	        		 if(stack.peek()==-i){
	        			 stack.pop();
	        		 }
	        		 
	        		 else{
	        			 stack.push(i);
	        		 }
	        		 }
	        		 catch (java.util.EmptyStackException e){
	        			 isBalanced = false;
	        		 }
	        	 }
	        	 else{
	        		 stack.push(i);
	        	 }
			}
	         if(!stack.isEmpty()){
	        	 isBalanced = false;
	         }
	         System.out.println(isBalanced);
	      }
	      
	      
	      
	      sc.close();
	   }

}

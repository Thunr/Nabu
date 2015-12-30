package hackerrank.JavaExercises;

import java.util.*;

public class D2Array {
	static int hourGlassSize = 3;
	static int gridSize = 6;
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[gridSize][gridSize];
        for(int i=0; i < gridSize; i++){
            for(int j=0; j < gridSize; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int sumMax = -100;
        for(int i = 0;i<=gridSize-hourGlassSize;i++){
        	for(int j = 0;j<=gridSize-hourGlassSize;j++){
            	int sum = 0;
            	int offset = 0;
            	for(int k = 0;k<hourGlassSize;k++){
            		for(int l = offset;l<hourGlassSize-offset;l++){
            			sum+=arr[i+k][j+l];
            		}
            		if(k < hourGlassSize/2){
            			offset++;
            		}
            		else{
            			offset--;
            		}
            	}
            	if (sum > sumMax){
            		sumMax = sum;
            	}
            }
        }
        System.out.println(sumMax);
          
        
        in.close();
    }

}

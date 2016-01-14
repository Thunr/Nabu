package hackerrank.algorithms.sorting;
import java.util.Scanner;
public class InsertionPart2 {
	static Scanner in = new Scanner(System.in);
	
	//võta arv positsioonilt i (liigub paremale)
	//märgi üles hetkepositsioon = i;
	//võrdle arvuga i-1. Kui on suurem/võrdne, kirjuta kohale i. Kui ei ole suurem sisi hetkepositsioon - 1 ja kirjuta i-1 asukohale i.  
	
	public static void insertionSortPart2(int[] ar)
    {       
		for(int i = 1;i<ar.length;i++){
			int sortedNumber = ar[i];
			int index = i;
			while(index>0&&sortedNumber<=ar[index-1]){
				ar[index] = ar[index-1];
				index--;
			}
			ar[index] = sortedNumber;
			printArray(ar);
		}
		
    }  
    
    
      
    public static void main(String[] args) {
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
	
}

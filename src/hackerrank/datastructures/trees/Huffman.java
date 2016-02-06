package hackerrank.datastructures.trees;
import java.util.Scanner;
public class Huffman {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
	}
	
	private class Node{
		public int frequency;
		public char data;
		public Node left, right;
	}
	
	void decode(String s, Node n){
		char[] binaryString = s.toCharArray();
		int index = 0;
		while(index<binaryString.length){
			Node root = n;
			while(root.data=='\0'){
				if(binaryString[index]=='0')
					root = root.left;
				else
					root = root.right;
				index++;
			}
			System.out.print(root.data);
		}
	}
}

package hackerrank.datastructures.trees;
import java.util.Scanner;
public class TreeTraversal {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Node {
	    int data;
	    Node left;
	    Node right;
	}
	
	//Prints the values of binary tree in preorder traversal
	void Preorder(Node root) {
		System.out.print(root.data+" ");
		if(root.left!=null)
			Preorder(root.left);
		if(root.right!=null)
			Preorder(root.right);		
	}
	
	//Prints the values of binary tree in postorder traversal
		void Postorder(Node root) {
			if(root.left!=null)
				Postorder(root.left);
			if(root.right!=null)
				Postorder(root.right);	
			System.out.print(root.data+" ");
		}
	
}

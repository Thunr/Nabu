package hackerrank.datastructures.trees;
import java.util.Scanner;
/**
Swap operation: Given a tree and a integer, K, we have to swap the subtrees of all the nodes who are at depth h, where h  [K, 2K, 3K,...].

You are given a tree of N nodes where nodes are indexed from [1..N] and it is rooted at 1. You have to perform T swap operations on it,
and after each swap operation print the inorder traversal of the current state of the tree.

Input Format 
First line of input contains N, number of nodes in tree. Then N lines follow. 
Here each of ith line (1 <= i <= N) contains two integers, a b, where a is the index of left child,
and b is the index of right child of ith node. -1 is used to represent null node. 
Next line contain an integer, T. Then again T lines follows. Each of these line contains an integer K.

Output Format 
For each K, perform swap operation as mentioned above and print the inorder traversal of the current state of tree.
**/
public class SwapNodes {
	static Scanner sc = new Scanner(System.in);
	private class Node{
		int index;
		Node left, right;
		Node(int index, Node left, Node right){
			this.index = index;
			this.left = left;
			this.right = right;
		}
	}
	

	public static void main(String[] args) {
		int N = sc.nextInt();
	}
	
	private Node insertNode(Node root){
		if(root==null)
	}
}

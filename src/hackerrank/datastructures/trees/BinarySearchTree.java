package hackerrank.datastructures.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class BinarySearchTree <T extends Comparable<T>>{
	
	Node root;
	T newData;
	
	public BinarySearchTree(){
		
	}
	
	private class Node{
		T data;
		Node left;
		Node right;
		
		Node(T data){
			this.data = data;
		}
	}
	
	public void insertData(T data){
		if(root==null)
			root = new Node(data);
		else
			newData = data;
			insertNode(root);
	}
	private void insertNode(Node n){
		if(newData.compareTo(n.data)<=0)
			if(n.left==null)
				n.left = new Node(newData);
			else
				insertNode(n.left);
		else
			if(n.right==null)
				n.right = new Node(newData);
			else
				insertNode(n.right);
	}
	
	public int height(){
		return returnHeight(root);
	}
	
	private int returnHeight(Node n){
		if(n == null)
	           return 0;
	       int heightLeft = 1 + returnHeight(n.left);
	       int heightRight = 1 + returnHeight(n.right);
	       
	       if(heightLeft>heightRight)
	           return heightLeft;
	       else
	           return heightRight;
	}
	
	public void levelOrderTraversal(){
		Queue<Node> nodes = new LinkedList<>();
		nodes.add(root);
		while(!nodes.isEmpty()){
			Node removedNode = nodes.remove();
			if(removedNode.left!=null)
				nodes.add(removedNode.left);
			if(removedNode.right!=null)
				nodes.add(removedNode.right);
			System.out.print(removedNode.data+" ");
		}
	}
}

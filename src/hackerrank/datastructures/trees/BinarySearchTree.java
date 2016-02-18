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
		int height = 0; //for self-balancing insertion and deletion
		
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
	
	public void balancingInsert(Node n, T data){
		//insert Node
		//retrace back towards root, if |left.height - right.height|>1, rotate
		//end when height of node = 0 (root);
		
		if(data.compareTo(n.data)<=0)
			if(n.left==null)
				n.left = new Node(data);
			else{
				balancingInsert(n.left, data);
				if(getHeightFactor(n)==2){
					if(getHeightFactor(n.left)<0){
						Node temp = n.left.right;
						n.left.right = temp.left;
						temp.left = n.left;
						n.left = temp;
					}
					Node temp = n;
					n = n.left;
					temp.left = n.right;
					n.right = temp;
				}
			}				
		else
			if(n.right==null)
				n.right = new Node(data);
			else{
				balancingInsert(n.right, data);
				if(getHeightFactor(n)==-2){
					if(getHeightFactor(n.right)>0){
						Node temp = n.right.left;
						n.right.left = temp.right;
						temp.right = n.right;
						n.right = temp;
					}
					Node temp = n;
					n = n.right;
					temp.right = n.left;
					n.left = temp;
				}
			}
		setHeight(n.left);
		setHeight(n.right);
		setHeight(n);
	}
	private int getHeightFactor(Node n){
		if(n.right==null&&n.left.height==1)
			return 2;
		else if(n.left==null&&n.right.height==1)
			return -2;
		else
			return n.left.height-n.right.height;
	}
	private void setHeight(Node n){
		if(n==null)
			return;
		if(n.right==null)
			n.height = n.left.height + 1;
		else if(n.left == null)
			n.height = n.right.height + 1;
		else
			n.height = Math.max(n.right.height, n.left.height) + 1;
	}
}

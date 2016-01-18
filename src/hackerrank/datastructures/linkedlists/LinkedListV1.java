package hackerrank.datastructures.linkedlists;
import java.util.Scanner;
public class LinkedListV1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		

	}
	
	Node InsertNth(Node head, int data, int position) {
		   Node newNode = new Node();
		    newNode.data = data;
		    if(position==0){
		        newNode.next = head;
		        return newNode;
		    }
		    else{
		        Node thisNode = head;
		        while(position>1){
		            thisNode = thisNode.next;
		            position--;
		        }
		        newNode.next = thisNode.next;
	            thisNode.next=newNode;
		        return head;
		    }
		}
	Node delete(Node head, int position){
		if(position==0)
			return head.next;
		else{
			Node currentNode = head;
			while(position>1){
				currentNode = currentNode.next;
				position--;
			}
			Node deletableNode = currentNode.next;
			currentNode.next = deletableNode.next;
			return head;
		}		
	}
	
	void ReversePrint(Node head) {
		  if(head!=null){
		      Node current = head;
		      Node previous = null;
		      Node next;
		      while(current!=null){
		    	  next = current.next;
		    	  current.next = previous;
		    	  previous = current;
		    	  current = next;
		      }
		      current=previous;
		      while(current!=null){
		    	  System.out.println(current.data);
		    	  current=current.next;
		      }
		    	  
		  }

	}
	Node Reverse(Node head){
		if(head!=null){
		      Node current = head;
		      Node previous = null;
		      Node next;
		      while(current!=null){
		    	  next = current.next;
		    	  current.next = previous;
		    	  previous = current;
		    	  current = next;
		      }
		      return previous;
		    	  
		  }
		else
			return null;
	}
	
	
	
}

class Node{
	Node next;
	int data;
	public Node(int d){
		data = d;
		next = null;
	}
	public Node(){
		
	}
}
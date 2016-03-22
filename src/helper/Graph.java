package helper;

import java.util.HashMap;
import java.util.LinkedList;

public class Graph {
	static HashMap<Integer, Node> nodes;
	
	public Graph(int[] nodeValues){
		nodes = new HashMap<>(nodeValues.length + 1);
		int key = 1;
		for (int i : nodeValues) {
			nodes.put(key, new Node(i));
			key++;
		}
	}
	
	public void addEdge(int indexA, int indexB){
		Edge e = new Edge(nodes.get(indexA), nodes.get(indexB));
		
	}
	public void addEdge(int indexA, int indexB, int weight){
		Edge e = new Edge(nodes.get(indexA), nodes.get(indexB)).setWeight(weight);
		
	}
	
	static class Node{
		LinkedList<Edge> edges;
		int value;
		Node(int value){
			this.value = value;
		}
	}
	static class Edge{
		Node startNode;
		Node endNode;
		int weight;
		Edge(Node startNode, Node endNode){
			this.startNode = startNode;
			this.endNode = endNode;
			weight=1;
		}
		Edge setWeight(int newWeight){
			weight = newWeight;
			return this;
		}
	}
}

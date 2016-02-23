package hackerrank.datastructures.graphs;

import java.util.LinkedList;
import java.util.Queue;


public abstract class Graph{
	Vertex[] vertices;
	
	public Graph(int numberOfVertices){
		vertices = new Vertex[numberOfVertices];
	}
	
	public abstract void AddEdge(int startIndex, int endIndex, int weight);
	
	public int findShortestRoute(int startIndex, int endIndex, boolean isWeighted){
		return -1;
	}
	
	int breathFirstSearch(int startIndex, int endIndex){
		int distance = 0;
		Queue<Edge> q = new LinkedList<>();
		return -1;
	}
}

class Edge{
	int startIndex, endIndex;
	int weight;
	Edge(int startIndex, int endIndex, int weight){
		this.startIndex = startIndex;
		this.endIndex = endIndex;
		this.weight = weight;
	}
	int traverseEdge(int startIndex){
		if(this.startIndex==startIndex)
			return endIndex;
		else
			return this.startIndex;
	}
}

class directedEdge extends Edge{
	directedEdge(int startIndex, int endIndex, int weight) {
		super(startIndex, endIndex, weight);
	}
	@Override
	int traverseEdge(int startIndex){
		return endIndex;
	}
}

class Vertex{
	boolean isVisited;
	LinkedList<Edge> edges;
	Vertex(){
	}
	void setVisited(){
		isVisited = true;
	}
	void unVisit(){
		isVisited = false;
	}
	boolean isVisited(){
		return isVisited;
	}
	void addEdge(Edge newEdge){
		edges.add(newEdge);
	}
}

class DataVertex<T> extends Vertex{
	T data;
	DataVertex(T data) {
		super();
		this.data = data;
	}
	
	T getData(){
		return data;
	}
}

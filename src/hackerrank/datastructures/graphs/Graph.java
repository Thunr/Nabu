package hackerrank.datastructures.graphs;

import java.util.LinkedList;
import java.util.Queue;


public abstract class Graph{
	Vertex[] vertices;
	
	public Graph(int numberOfVertices){
		vertices = new Vertex[numberOfVertices];
	}
	
	public abstract void AddEdge(int startIndex, int endIndex, int weight);
	public abstract void AddEdge(int startIndex, int endIndex);
	
	public int findShortestRoute(int startIndex, int endIndex, boolean isWeighted){
		return -1;
	}
	
	int breathFirstSearch(int startIndex, int endIndex){
		int distance = 0;
		Queue<Edge> q = new LinkedList<>();
		q.addAll(vertices[startIndex].getEdges());
		while(!q.isEmpty()){
			
		}
		
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
	Edge(int startIndex, int endIndex){
		this(startIndex, endIndex, 1);
	}
	
	protected int traverseEdge(int startIndex){
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
	
	directedEdge(int startIndex, int endIndex) {
		super(startIndex, endIndex);
	}

	@Override
	protected int traverseEdge(int startIndex){
		return endIndex;
	}
}

class Vertex{
	boolean isVisited;
	LinkedList<Edge> edges;
	Vertex(){
		isVisited = false;
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
	LinkedList<Edge> getEdges(){
		return edges;
	}
}

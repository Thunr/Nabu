package hackerrank.datastructures.graphs;

import java.util.LinkedList;
import java.util.Map;


public abstract class Graph{
	Vertex[] vertices;
	Map<Vertex, LinkedList<Edge>> adjacencyList;
	
	public Graph(int numberOfVertices){
		vertices = new Vertex[numberOfVertices];
	}
	
	abstract protected void AddEdge(int index1, int index2);
}

class Edge{
	Vertex start, end;
	Edge(Vertex start, Vertex end){
		this.start = start;
		this.end = end;
	}
}

class WeightedEdge extends Edge{
	int weight;
	WeightedEdge(Vertex start, Vertex end, int weight) {
		super(start, end);
		this.weight = weight;
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

package hackerrank.datastructures.graphs;
public class DirectedGraph extends Graph{

	public DirectedGraph(int numberOfVertices) {
		super(numberOfVertices);
	}

	@Override
	public void AddEdge(int startIndex, int endIndex, int weight) {
		Edge e = new directedEdge(startIndex, endIndex, weight);
		vertices[startIndex].addEdge(e);
	}

	@Override
	public void AddEdge(int startIndex, int endIndex) {
		Edge e = new directedEdge(startIndex, endIndex);
		vertices[startIndex].addEdge(e);		
	}	
}

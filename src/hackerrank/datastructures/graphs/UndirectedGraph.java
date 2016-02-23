package hackerrank.datastructures.graphs;
public class UndirectedGraph extends Graph {

	public UndirectedGraph(int numberOfVertices) {
		super(numberOfVertices);
	}

	@Override
	public void AddEdge(int startIndex, int endIndex, int weight) {
		Edge e = new Edge(startIndex, endIndex,  weight);
		vertices[startIndex].addEdge(e);
		vertices[endIndex].addEdge(e);
	}
}

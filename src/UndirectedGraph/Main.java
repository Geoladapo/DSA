package UndirectedGraph;

public class Main {
    public static void main(String[] args) {
        var graph = new WeightedGraph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addEdge("A", "B", 3);
        graph.addEdge("A", "C", 2);
        graph.print();
    }
}

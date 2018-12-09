package net.quipV.Model;

/**
 *Structure for storing answers for a DataNode
 *Contains basic logic & getter/setter functions
 */


public class GraphEdge {
    private GraphNode start;
    private GraphNode end;
    private int weight;

    public GraphEdge(GraphNode start, GraphNode end, int weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }

    public GraphNode getStart() {
        return start;
    }

    public GraphNode getEnd() {
        return end;
    }

    public int getWeight() {
        return weight;
    }

    public void setStart(GraphNode start) {
        this.start = start;
    }

    public void setEnd(GraphNode end) {
        this.end = end;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
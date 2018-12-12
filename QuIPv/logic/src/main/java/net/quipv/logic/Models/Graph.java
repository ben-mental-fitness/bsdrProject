package net.quipv.logic.Models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Graph extends ArrayList<GraphNode> {

    private Set<GraphNode> verticesSet;
    private List<GraphNode> vertices;

    public Graph(){
        this.vertices = new ArrayList<>();
        this.verticesSet = new HashSet<>();
    }

    public void addNode(GraphNode node){

        if(isNotInGraph(node)){
            this.verticesSet.add(node);
            this.vertices.add(node);
        }
    }

    public void addEdge(GraphNode node, GraphNode neighbour){

        node.addNeighbour(neighbour, 1);
        if(isNotInGraph(node)){
            addNode(node);
        }

        if(isNotInGraph(neighbour)){
            addNode(neighbour);
        }
    }

    public List<GraphNode> getVertices() {
        return vertices;
    }

    private boolean isNotInGraph(GraphNode node){
        return !this.verticesSet.contains(node);
    }

}

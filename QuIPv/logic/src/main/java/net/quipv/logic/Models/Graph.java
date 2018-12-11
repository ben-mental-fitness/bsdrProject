package net.quipv.logic.Models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Graph extends ArrayList<GraphNode> {
    
    // A graph stores a set of all the node names in order to keep all the nodes unique
    private Set<String> nodes;

    public Graph(){
        nodes = new HashSet<>();
    }

    public Graph addNode(Graph graph, GraphNode node){

        if(isNotInGraph(node,graph)){
            graph.add(node);
            graph.nodes.add(node.getName());
        }

        return graph;
    }

    public Graph addEdge(Graph graph, GraphNode node, GraphNode neighbour){

        node.addNeighbour(neighbour, 1);
        if(isNotInGraph(node, graph)){
            addNode(graph, node);
        }

        if(isNotInGraph(neighbour, graph)){
            addNode(graph, neighbour);
        }

        return graph;
    }

    private boolean isNotInGraph(GraphNode node, Graph graph){
        return !graph.nodes.contains(node.getName());
    }
}

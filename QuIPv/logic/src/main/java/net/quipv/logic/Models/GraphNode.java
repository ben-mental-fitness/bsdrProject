package net.quipv.logic.Models;

/*
 *Structure for storing a node in the causal chain
 *Contains name, weight & list of respondents
 */

import java.util.*;
import java.util.function.Consumer;

public class GraphNode {
    private String name;
    private int count;
    private HashMap<GraphNode, Integer> neighbours;

    public GraphNode(NodeBuilder builder) {
        this.name = builder.name;
        this.count = builder.count;
        this.neighbours = builder.neighbours;
    }

    public static class NodeBuilder {
        public String name;
        public int count;
        public HashMap<GraphNode, Integer> neighbours;

        public GraphNode build() {
            return new GraphNode(this);
        }

        public NodeBuilder with(Consumer<NodeBuilder> func){
            func.accept(this);
            return this;
        }

    }

    public void addNeighbour(GraphNode neighbour, Integer weight){
        if(this.neighbours.containsKey(neighbour)){
            Integer currentWeight = this.neighbours.get(neighbour);
            this.neighbours.replace(neighbour, currentWeight + weight);
        }
        this.neighbours.put(neighbour, weight);
    }
    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public HashMap<GraphNode, Integer> getNeighbours() {return neighbours;}

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(int count) {this.count = count;}

    public void setNeighbours(HashMap<GraphNode, Integer> neighbours) {this.neighbours = neighbours;}
}
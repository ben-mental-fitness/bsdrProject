package net.quipv.logic.Models;

public class Neighbour {
    public GraphNode node;
    public Integer weight;

    public Neighbour(GraphNode node, Integer weight){
        this.node = node;
        this.weight = weight;
    }
}

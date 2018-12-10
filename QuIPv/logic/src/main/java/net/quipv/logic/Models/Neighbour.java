package net.quipv.logic.Models;

/*
 *Structure for storing a node in the causal chain
 *Contains name, weight & list of respondents
 */

import java.util.function.Consumer;

public class Neighbour {
    private GraphNode node;
    private int weight;

    public Neighbour(NeighbourBuilder builder) {
        this.node = builder.node;
        this.weight = builder.weight;
    }

    public static class NeighbourBuilder {
        public GraphNode node;
        public int weight;

        public Neighbour build() {
            return new Neighbour(this);
        }

        public NeighbourBuilder with(Consumer<NeighbourBuilder> func){
            func.accept(this);
            return this;
        }

    }

    public GraphNode getNode() {return node;}

    public void setNode(GraphNode node) {this.node = node;}

    public int getWeight() {return weight;}

    public void setWeight(int weight) {this.weight = weight;}
}

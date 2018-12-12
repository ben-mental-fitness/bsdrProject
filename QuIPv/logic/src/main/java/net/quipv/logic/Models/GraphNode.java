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
    private ArrayList<Neighbour> neighbours;

    public GraphNode(String name, int count) {
        this.name = name;
        this.count = count;
        this.neighbours = new ArrayList<>();
    }

    public void addNeighbour(GraphNode node, Integer weight){
        Neighbour neighbour = new Neighbour(node, weight);
        Integer neighbourIndex = this.neighbours.indexOf(neighbour);
        if(neighbourIndex != -1){
            Integer currentWeight = this.neighbours.get(neighbourIndex).weight;
            neighbour.weight += currentWeight;
            this.neighbours.set(neighbourIndex, neighbour);
        }
        this.neighbours.add(neighbour);
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(int count) {this.count = count;}

    @Override
    public boolean equals(Object o){

        if(o == this){
            return true;
        }

        if(!(o instanceof GraphNode)){
            return false;
        }

        GraphNode node = (GraphNode) o;

        return this.name == node.getName();
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

}
package net.quipV.Model;

/*
 *Structure for storing a node in the causal chain
 *Contains name, weight & list of respondents
 */

import java.util.*;

public class GraphNode {
    private String name;
    private int count;
    private ArrayList<Respondent> respondents;
    private ArrayList<GraphNode> outcomes;

    public GraphNode(String name, int count, ArrayList<Respondent> respondents, ArrayList<GraphNode> outcomes) {
        this.name = name;
        this.count = count;
        this.respondents = respondents;
        this.outcomes = outcomes;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public ArrayList<Respondent> getRespondents() {
        return respondents;
    }

    public ArrayList<GraphNode> getOutcomes() {return outcomes;}

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(int count) {
        this.count = count;
        //this.count = respondents.size();
    }

    public void setRespondents(ArrayList<Respondent> respondents) {
        this.respondents = respondents;
    }

    public void setOutcomes(ArrayList<GraphNode> outcomes) {this.outcomes = outcomes;}
}
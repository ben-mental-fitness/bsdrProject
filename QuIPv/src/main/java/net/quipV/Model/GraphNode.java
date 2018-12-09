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

    public GraphNode(String name, int count, ArrayList<Respondent> respondents) {
        this.name = name;
        this.count = count;
        this.respondents = respondents;
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
}
package net.quipv.logic.Helpers;

import net.quipv.logic.Models.Answer;
import net.quipv.logic.Models.Graph;
import net.quipv.logic.Models.GraphNode;
import net.quipv.logic.Models.Project;

import java.util.List;

public class GraphHelper {
    public static List<GraphNode> constructGraph(Project project){
        Graph graph = new Graph();
        List<Answer> answers = project.getAnswers();

        for(Answer answer : answers){
            String driver = answer.getDriver();
            List<String> outcomes = answer.getOutcomes();

        }

        return graph;
    }
}

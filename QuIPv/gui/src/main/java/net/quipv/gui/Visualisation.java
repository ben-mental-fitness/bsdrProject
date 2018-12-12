package net.quipv.gui;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import net.quipv.logic.Helpers.GraphHelper;
import net.quipv.logic.Helpers.ProjectHelper;
import net.quipv.logic.Models.Graph;
import net.quipv.logic.Models.GraphNode;
import net.quipv.logic.Models.Neighbour;
import net.quipv.logic.Models.Project;
import java.util.ArrayList;

public class Visualisation {

    public static void display(){
        Stage window = new Stage();
        window.setTitle("Visualisation");
        window.setMaxWidth(800);
        window.setMaxHeight(800);

        Scene visualisation;

        Project project = ProjectHelper.populate();
        Graph graph = GraphHelper.constructGraph(project);
        System.out.printf("size is: %d\n ", graph.getVertices().size());

        double mainCircleXY = 400;
        double mainCircleRadius = 300;
        int numberOfNodes = graph.getVertices().size();
        double sizeOfWindow = 800;
        double nodeRadius = mainCircleRadius/numberOfNodes;

        Group root = new Group();

        //initialise all nodes to not be connected
        int[][] selected = new int[numberOfNodes][numberOfNodes];
        for(int start = 0; start<numberOfNodes; start++) {
            for (int end = 0; end < numberOfNodes; end++) {
                selected[start][end] = 0;
            }
        }

        //selected nodes [start][end]
        for(int from = 0; from< numberOfNodes; from++){
            GraphNode node = graph.getVertices().get(from);
            ArrayList<Neighbour> neighbours = node.getNeighbours();
            for(Neighbour neighbour: neighbours){
                int to = graph.getVertices().indexOf(neighbour);
                selected[from][to] = 1;
            }
        }

        Line[][] lines = new Line[numberOfNodes][numberOfNodes];

        for(int start = 0; start<numberOfNodes; start++) {
            for(int end = 0; end<numberOfNodes; end++) {
                if(selected[start][end] == 1 ) {
                    lines[start][end] = new Line();
                    double startX = (mainCircleXY + (mainCircleRadius * (Math.cos(Math.toRadians(90 - ((360 / numberOfNodes) * start))))));
                    double startY = (mainCircleXY - (mainCircleRadius * (Math.sin(Math.toRadians(90 - ((360 / numberOfNodes) * start))))));
                    double endX = (mainCircleXY + (mainCircleRadius * (Math.cos(Math.toRadians(90 - ((360 / numberOfNodes) * end))))));
                    double endY = (mainCircleXY - (mainCircleRadius * (Math.sin(Math.toRadians(90 - ((360 / numberOfNodes) * end))))));
                    lines[start][end].setStartX(startX);
                    lines[start][end].setStartY(startY);
                    lines[start][end].setEndX(endX);
                    lines[start][end].setEndY(endY);
                    root.getChildren().addAll(lines[start][end]);
                    double middleXValue = ((endX + startX) / 2);
                    double middleYValue = ((endY + startY) / 2);

                    double frontArrowX;
                    double frontArrowY;
                    double angle = Math.atan((Math.abs(startY - endY)) / Math.abs(startX - endX));
                    double arrowTraceBack = nodeRadius;
                    double arrowBack = arrowTraceBack/2;
                    double frontArrowRadius = arrowBack/2;
                    double backArrowRadius = arrowTraceBack/2;

                    Circle circle = new Circle();
                    circle.setRadius(backArrowRadius);
                    circle.setCenterX(middleXValue);
                    circle.setCenterY(middleYValue);
                    circle.setFill(Color.RED);
                    root.getChildren().addAll(circle);
                    Text t = new Text();
                    t.setText("weight");
                    t.setX(middleXValue);
                    t.setY(middleYValue);
                    root.getChildren().addAll(t);

                    if(startX<endX && startY>endY) {
                        frontArrowX = middleXValue + (arrowTraceBack * Math.cos(angle));
                        frontArrowY = middleYValue - (arrowTraceBack * Math.sin(angle));
                    }
                    else if(startX<endX && startY<endY){
                        frontArrowX = middleXValue + (arrowTraceBack * Math.cos(angle));
                        frontArrowY = middleYValue + (arrowTraceBack * Math.sin(angle));
                    }
                    else if(startX>endX && startY>endY){
                        frontArrowX = middleXValue - (arrowTraceBack * Math.cos(angle));
                        frontArrowY = middleYValue - (arrowTraceBack * Math.sin(angle));
                    }
                    else {
                        frontArrowX = middleXValue - (arrowTraceBack * Math.cos(angle));
                        frontArrowY = middleYValue + (arrowTraceBack * Math.sin(angle));
                    }

                    Circle circle2 = new Circle();
                    circle2.setRadius(frontArrowRadius);
                    circle2.setCenterX(frontArrowX);
                    circle2.setCenterY(frontArrowY);
                    circle2.setFill(Color.GREEN);
                    root.getChildren().addAll(circle2);

//                    double angle2 = Math.toDegrees(Math.atan(Math.abs(frontArrowX - middleXValue)/Math.abs(frontArrowY - middleYValue)));
//                    System.out.printf("%f\n", angle2);
//                    double pointx1 = middleXValue + (backArrowRadius * Math.sin(angle2));
//                    double pointy1 = middleYValue + (backArrowRadius * Math.cos(angle2));
//                    double pointx2 = middleXValue - (backArrowRadius * Math.sin(angle2));
//                    double pointy2 = middleYValue - (backArrowRadius * Math.cos(angle2));
//                    System.out.printf("%f, %f, %f, %f, %f, %f\n ",frontArrowX, frontArrowY, pointx1, pointy1, pointx2, pointy2 );
//                    Polygon polygon = new Polygon();
//                    polygon.getPoints().addAll(
//                            frontArrowX, frontArrowY,
//                            pointx1, pointy1,
//                            pointx2, pointy2);
//                    polygon.setFill(Color.BLACK);
//                    root.getChildren().addAll(polygon);
                }
            }
        }
        Circle[] nodes = new Circle[numberOfNodes];
        for(int i = 0; i<numberOfNodes; i++){
            double PosX = mainCircleXY + (mainCircleRadius*(Math.cos(Math.toRadians(90-(360/numberOfNodes)*i))));
            double PosY = mainCircleXY - (mainCircleRadius*(Math.sin(Math.toRadians(90-(360/numberOfNodes)*i))));
            nodes[i] = new Circle();
            nodes[i].setCenterX(PosX);
            nodes[i].setCenterY(PosY);
            nodes[i].setRadius(nodeRadius);
            nodes[i].setFill(Color.ORANGE);
            nodes[i].setStroke(Color.BLACK);
            root.getChildren().addAll(nodes[i]);
            Text t = new Text();
            t.setText(graph.getVertices().get(i).getName());
            t.setX(PosX);
            t.setY(PosY + (1.5 * nodeRadius));
            root.getChildren().addAll(t);

        }
        BorderPane borderPane2 = new BorderPane();
        borderPane2.getChildren().addAll(root);
        visualisation = new Scene(borderPane2, sizeOfWindow, sizeOfWindow);

        window.setScene(visualisation);
        window.showAndWait();
    }
}

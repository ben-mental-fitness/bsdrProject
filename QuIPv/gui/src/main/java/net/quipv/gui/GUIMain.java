package net.quipv.gui;

import net.quipv.logic.helpers.ProjectHelper;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import net.quipv.logic.Models.*;


public class GUIMain extends Application {

    Stage window;
    Scene introScene, mainScene;


    @Override
    public void start(Stage primaryStage) throws Exception{
        //where window is the parent of every scene
        //i.e. all scenes play on window
        window = primaryStage;

        Parent root = FXMLLoader.load(getClass().getResource("/Views/introScene.fxml"));
        Parent root2 = FXMLLoader.load(getClass().getResource("/Views/mainScene.fxml"));

        introScene = new Scene(root, 754, 573);
        mainScene = new Scene(root2, 754, 573);

        primaryStage.setTitle("QuipV");
        primaryStage.setScene(introScene);
        primaryStage.show();



        Project project = ProjectHelper.populate();


        System.out.println(project);
    }




    public static void main(String[] args) {
        launch(args);
    }

}
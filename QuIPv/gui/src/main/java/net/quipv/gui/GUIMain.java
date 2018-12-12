package net.quipv.gui;

import net.quipv.logic.Helpers.ProjectHelper;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import net.quipv.logic.Models.*;


public class GUIMain extends Application {

    Stage window;
    Scene menuScene;

    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;

        Parent root = FXMLLoader.load(getClass().getResource("/Views/MainMenu.fxml"));

        menuScene = new Scene(root, 754, 573);

        primaryStage.setTitle("QuipV");
        primaryStage.setScene(menuScene);
        primaryStage.show();

        //Project project = ProjectHelper.populate();
        //System.out.println(project);
    }

    public static void main(String[] args) {
        launch(args);
    }

}
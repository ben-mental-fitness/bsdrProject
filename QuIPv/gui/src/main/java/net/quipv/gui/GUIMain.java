package net.quipv.gui;

import net.quipv.logic.Helpers.ProjectHelper;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class GUIMain extends Application {

    Stage window;
    Scene menuScene, mainScene;

    @Override
    public void start(Stage primaryStage) throws Exception{

        window = primaryStage;

        Parent root = FXMLLoader.load(getClass().getResource("/Views/MainMenu.fxml"));
        Parent root2 = FXMLLoader.load(getClass().getResource("/Views/MainScene.fxml"));

        menuScene = new Scene(root, 754, 573);

        primaryStage.setTitle("QuipV");
        primaryStage.setScene(menuScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
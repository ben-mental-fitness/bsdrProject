package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenuController {

    @FXML
    public Button openFileButton;

    @FXML
    public Button newFileButton;

    @FXML
    public void openFileError(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setContentText("Open File Currently Unsupported");

        alert.showAndWait();
    }

    @FXML
    public void newFileOpen(ActionEvent event) throws IOException {
        Scene mainScene;
        Stage primaryStage = (Stage) newFileButton.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("/Views/SelectionScene.fxml"));
        mainScene = new Scene(newRoot, 754, 573);
        primaryStage.setScene(mainScene);
    }
}

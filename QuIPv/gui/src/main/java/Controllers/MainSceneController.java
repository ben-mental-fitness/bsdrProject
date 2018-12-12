package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import net.quipv.gui.Visualisation;
import net.quipv.logic.Helpers.GraphHelper;
import net.quipv.logic.Helpers.ProjectHelper;
import net.quipv.logic.Models.Graph;
import net.quipv.logic.Models.Project;

import java.io.IOException;

public class MainSceneController {

    @FXML
    public Button button;


    @FXML
    public Button visButton;

    @FXML
    public void button(ActionEvent event){
    }

    @FXML
    public void visOpen(ActionEvent event){
        Visualisation.display();
    }
}

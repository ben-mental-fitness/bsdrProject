package Controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import net.quipv.logic.Helpers.ProjectHelper;
import net.quipv.logic.Models.Project;

public class SelectionController {

    Project project = ProjectHelper.populate();
    ObservableList<String> selectedQuestion = FXCollections.observableArrayList();

    @FXML
    public ListView<String> selectedList;

    @FXML
    public MenuItem closeFile;

    @FXML
    public MenuItem deleteItem;

    @FXML
    public Button createButton;

    @FXML
    public MenuItem importData;

    @FXML
    public ListView<String> possibilitiesList;

    @FXML
    public Button importButton;

    @FXML
    public void importFromDatabase(ActionEvent event) {
        ObservableList<Integer> questionID = FXCollections.observableArrayList();
        ObservableList<String> question = FXCollections.observableArrayList();
//        Pair<Integer, String> pair = new Pair<>(1, "One");
//        Integer key = pair.getKey();
//        String value = pair.getValue();
        for (int i = 0; i < project.getQuestions().size()-1; i++) {
            questionID.addAll(project.getQuestions().get(i).getQuestionID());
            question.addAll(project.getQuestions().get(i).getText());
        }
        this.possibilitiesList.setItems(question);
    }

    @FXML
    public void createGraph(ActionEvent event) {

    }

    @FXML
    public void itemSelectionEvent(MouseEvent event) {
        String selectedItem = possibilitiesList.getSelectionModel().getSelectedItem();
        selectedQuestion.add(selectedItem);
        this.selectedList.setItems(selectedQuestion);
    }
}


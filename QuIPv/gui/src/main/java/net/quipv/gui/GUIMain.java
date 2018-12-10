package net.quipv.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import net.quipv.logic.DBO.MySQLConnection;
import net.quipv.logic.Models.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

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

        introScene = new Scene(root, Infinity, Infinity);
        mainScene = new Scene(root2, Infinity, Infinity);

        primaryStage.setTitle("QuipV");
        primaryStage.setScene(introScene);
        primaryStage.show();

        List<InterviewEntry> interviewEntries = populateInterviewEntries();

        Project project = populateProject(interviewEntries,interviewEntries.get(0).getProjectName());


        for (InterviewEntry interviewEntry : interviewEntries) {
            System.out.println(interviewEntry);
        }

//        System.out.println(project);
    }

    private static List<InterviewEntry> populateInterviewEntries() {
        List<InterviewEntry> interviewEntries = new LinkedList<>();
        try {
            Connection myConnection = MySQLConnection.getInstance().getConnection();
            Statement stmt = myConnection.createStatement();
            ResultSet rs=stmt.executeQuery("select * from SDR_LIVE_MainTable");
            while(rs.next()){
                InterviewEntry interviewEntry = new InterviewEntry.InterviewEntryBuilder().with($ -> {
                    try {
                        $.interviewType = rs.getString(3);
                        $.respondentID = rs.getString(4);
                        $.questionID = rs.getString(5);
                        $.question = rs.getString(6);
                        $.fullAnswer = rs.getString(7);
                        $.brokenAnswer = rs.getString(8);
                        $.driver = rs.getString(9);
                        $.primaryOutcome = rs.getString(10);
                        $.secondaryOutcome = rs.getString(11);
                        $.tertiaryOutcome = rs.getString(12);
                        $.projectName = rs.getString(18);
                    } catch (Exception e){ System.out.println("Exception in lambda" + e);}

                }).build();
                interviewEntries.add(interviewEntry);
            }

            myConnection.close();


        }catch (Exception e){System.out.println(e);}

        return interviewEntries;
    }

    private static Project populateProject(List<InterviewEntry> interviewEntries, String projectName) {
        Project project;
        ArrayList<Question> questions = new ArrayList<Question>();
        ArrayList<Answer> answers = new ArrayList<Answer>();
        ArrayList<Respondent> respondents= new ArrayList<Respondent>();

        for (InterviewEntry interviewEntry : interviewEntries) {
            Question q = new Question.QuestionBuilder().with($ -> {
                try {
                    $.questionID = Integer.parseInt(interviewEntry.getQuestionID());
                    $.text = interviewEntry.getQuestion();
                } catch (Exception e){ System.out.println("Exception in lambda" + e);}
            }).build();
            questions.add(q);

            ArrayList<String> outcomes = new ArrayList<>();
            outcomes.add(interviewEntry.getPrimaryOutcome());
            outcomes.add(interviewEntry.getSecondaryOutcome());
            outcomes.add(interviewEntry.getTertiaryOutcome());

            Answer a = new Answer.AnswerBuilder().with( $ -> {
                try {
                    $.fullAnswer =interviewEntry.getFullAnswer();
                    $.brokenAnswer= interviewEntry.getBrokenAnswer();
                    $.outcome= outcomes;
                    $.driver= interviewEntry.getDriver();
                    $.respondentID= Integer.parseInt(interviewEntry.getRespondentID());
                    $.questionID= Integer.parseInt(interviewEntry.getQuestionID());
                } catch (Exception e){ System.out.println("Exception in lambda" + e);}
            }).build();
            answers.add(a);

            Respondent r = new Respondent.RespondentBuilder().with($ -> {
                try {
                    $.respondentID = Integer.parseInt(interviewEntry.getRespondentID());
                    $.interviewType = interviewEntry.getInterviewType();
                } catch (Exception e){ System.out.println("Exception in lambda" + e);}
            }).build();
            respondents.add(r);
        }

        Collections.sort(questions);
        Collections.sort(respondents);

        Set<Question> questionsWithoutDuplicates = new LinkedHashSet<Question>(questions);
        Set<Answer> answersWithoutDuplicates = new LinkedHashSet<Answer>(answers);

        questions.clear();
        answers.clear();

        questions.addAll(questionsWithoutDuplicates);
        answers.addAll(answersWithoutDuplicates);

        project = new Project.ProjectBuilder().with($ -> {
            try {
                $.name = projectName;
                $.questions = questions;
                $.answers = answers;
                $.respondents= respondents;
            } catch (Exception e){ System.out.println("Exception in lambda" + e);}

        }).build();

        return project;
    }

    public static void main(String[] args) {
        launch(args);
    }

}
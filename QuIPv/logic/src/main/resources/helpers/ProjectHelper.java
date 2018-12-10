package helpers;

import net.quipv.logic.DBO.MySQLConnection;
import net.quipv.logic.Models.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class ProjectHelper {
    public static Project populate(){

        List<InterviewEntry> interviewEntries = populateInterviewEntries();

        Project project = populateProject(interviewEntries,interviewEntries.get(0).getProjectName());

        return project;
    }

    private static List<InterviewEntry> populateInterviewEntries() {
        List<InterviewEntry> interiewEntries = new LinkedList<>();
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
                interiewEntries.add(interviewEntry);
            }

            myConnection.close();


        }catch (Exception e){System.out.println(e);}

        return interiewEntries;
    }

    private static Project populateProject(List<InterviewEntry> interiewEntries, String projectName) {
        Project project;
        ArrayList<Question> questions = new ArrayList<Question>();
        ArrayList<Answer> answers = new ArrayList<Answer>();
        ArrayList<Respondent> respondents= new ArrayList<Respondent>();

        for (InterviewEntry interviewEntry : interiewEntries) {
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

}

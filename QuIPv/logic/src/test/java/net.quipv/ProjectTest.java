package net.quipv;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import net.quipv.logic.Models.Project;
import net.quipv.logic.Models.Question;
import net.quipv.logic.Models.Answer;
import net.quipv.logic.Models.Respondent;
import java.util.ArrayList;

/**
 * Unit test for Project module.
 */
public class ProjectTest
        extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ProjectTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( GraphTest.class );
    }


    /**
     * Rigourous Test :-)
     */
    public void testCreateProject()
    {
        ArrayList<String> outcomes = new ArrayList<>();
        outcomes.add("O1");
        outcomes.add("O2");
        outcomes.add("O3");

        Answer answer = new Answer.AnswerBuilder().with($ -> {
            $.fullAnswer = "FA1";
            $.brokenAnswer = "BA1";
            $.outcomes = outcomes;
            $.driver = "D1";
            $.respondentID = 21;
            $.questionID = 11;
        }).build();

        Respondent respondent1 = new Respondent.RespondentBuilder().with($ -> {
            $.respondentID = 1;
            $.interviewType = "Individual";
        }).build();

        Question question1 = new Question.QuestionBuilder().with($ -> {
            $.questionID = 1;
            $.text = "Question 1";
        }).build();

        Project project = new Project.ProjectBuilder().with($ -> {
            $.name = "TP1";
            $.questions = new ArrayList<>(){{add(question1);}};
            $.answers = new ArrayList<>(){{add(answer);}};
            $.respondents = new ArrayList<>(){{add(respondent1);}};
        }).build();


        assertEquals( "TP1", project.getName());
        assertEquals( new ArrayList<Question>(){{add(question1);}}, project.getQuestions());
        assertEquals( new ArrayList<Answer>(){{add(answer);}}, project.getAnswers());
        assertEquals( new ArrayList<Respondent>(){{add(respondent1);}}, project.getRespondents());
    }
}

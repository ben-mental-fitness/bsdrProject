package net.quipv;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import net.quipv.logic.Helpers.ProjectHelper;
import net.quipv.logic.Models.Project;
import net.quipv.logic.Models.Question;
import net.quipv.logic.Models.Answer;
import net.quipv.logic.Models.Respondent;
import java.util.ArrayList;

/**
 * Unit test for Project module.
 */
public class ProjectHelperTest
        extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ProjectHelperTest(String testName )
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
    public void testProjectHelper()
    {
        Project project = ProjectHelper.populate();
        assertEquals( "This is dummy ProjectName 1", project.getName());

        ArrayList<Question> questions = project.getQuestions();
        assertEquals( 1, questions.get(0).getQuestionID());

        ArrayList<Answer> answers = project.getAnswers();
        assertEquals( "This is dummy full answer 2", answers.get(1).getFullAnswer());

        ArrayList<Respondent> respondents = project.getRespondents();
        assertEquals( 3, respondents.get(2).getRespondentID());
    }
}

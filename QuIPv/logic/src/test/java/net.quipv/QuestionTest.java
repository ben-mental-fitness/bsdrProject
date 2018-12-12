package net.quipv;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import net.quipv.logic.Models.Question;

/**
 * Unit test for Question module.
 */
public class QuestionTest
        extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public QuestionTest(String testName )
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
    public void testCreateQuestion()
    {

        Question question1 = new Question.QuestionBuilder().with($ -> {
            $.questionID = 1;
            $.text = "Question 1";
        }).build();

        Question question11 = new Question.QuestionBuilder().with($ -> {
            $.questionID = 11;
            $.text = "Question 11";
        }).build();

        assertEquals( 1, question1.getQuestionID());
        assertEquals( "Question 1", question1.getText());
        assertEquals( 10, question11.compareTo(question1));

        question11.setShowInVis(false);
        assertFalse(question11.isShowInVis());
    }
}

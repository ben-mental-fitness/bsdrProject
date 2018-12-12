package net.quipv;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import net.quipv.logic.Models.Answer;
import java.util.ArrayList;

/**
 * Unit test for Answer module.
 */
public class AnswerTest
        extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AnswerTest(String testName )
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
    public void testCreateAnswer()
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

        assertEquals( "FA1", answer.getFullAnswer());
        assertEquals( "BA1", answer.getBrokenAnswer());
        assertEquals( outcomes, answer.getOutcomes());
        assertEquals( "D1", answer.getDriver());
        assertEquals( 21, answer.getRespondentID());
        assertEquals( 11, answer.getQuestionID());
    }
}

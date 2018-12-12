package net.quipv;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import net.quipv.logic.Models.Respondent;

/**
 * Unit test for Respondent module.
 */
public class RespondentTest
        extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public RespondentTest(String testName )
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
    public void testCreateRespondent()
    {

       Respondent respondent1 = new Respondent.RespondentBuilder().with($ -> {
            $.respondentID = 1;
            $.interviewType = "Individual";
        }).build();

        Respondent respondent11 = new Respondent.RespondentBuilder().with($ -> {
            $.respondentID = 11;
            $.interviewType = "Individual";
        }).build();

        assertEquals( 1, respondent1.getRespondentID());
        assertEquals( "Individual", respondent1.getInterviewType());
        assertEquals( 10, respondent11.compareTo(respondent1));

        respondent11.setShowInVis(false);
        assertFalse(respondent11.isShowInVis());
    }
}

package net.quipv;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import net.quipv.logic.Models.InterviewEntry;

/**
 * Unit test for InterviewEntry module.
 */
public class InterviewEntryTest
        extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public InterviewEntryTest(String testName )
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
    public void testCreateInterviewEntry()
    {
        InterviewEntry interviewEntry = new InterviewEntry.InterviewEntryBuilder().with($ -> {
            $.questionID = "1";
            $.question = "Question1";
            $.respondentID = "2";
            $.interviewType = "Int1";
            $.fullAnswer = "FA1";
            $.brokenAnswer = "BA1";
            $.driver = "DR1";
            $.primaryOutcome = "Out1";
            $.secondaryOutcome = "Out2";
            $.tertiaryOutcome = "Out3";
            $.projectName = "Project1";
        }).build();

        assertEquals( "1", interviewEntry.getQuestionID());
        assertEquals( "Question1", interviewEntry.getQuestion());
        assertEquals( "2", interviewEntry.getRespondentID());
        assertEquals( "Int1", interviewEntry.getInterviewType());
        assertEquals( "FA1", interviewEntry.getFullAnswer());
        assertEquals( "BA1", interviewEntry.getBrokenAnswer());
        assertEquals( "DR1", interviewEntry.getDriver());
        assertEquals( "Out1", interviewEntry.getPrimaryOutcome());
        assertEquals( "Out2", interviewEntry.getSecondaryOutcome());
        assertEquals( "Out3", interviewEntry.getTertiaryOutcome());
        assertEquals( "Project1", interviewEntry.getProjectName());

    }
}

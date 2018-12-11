package net.quipv;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import net.quipv.logic.Models.Graph;

/**
 * Unit test for simple App.
 */
public class GraphTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public GraphTest(String testName )
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
    public void testAddNode()
    {
        Graph graph = new Graph();

    }
}

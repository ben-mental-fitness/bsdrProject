package net.quipV;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class QuIPvTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public QuIPvTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( QuIPvTest.class );
    }


    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        QuIPv a = new QuIPv();
        assert(a.nextPrime(9) == 11);
        assert(a.nextPrime(1) == 2);
    }
}

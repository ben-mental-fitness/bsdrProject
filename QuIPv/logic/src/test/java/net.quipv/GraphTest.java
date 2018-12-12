package net.quipv;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import net.quipv.logic.Models.Graph;
import net.quipv.logic.Models.GraphNode;

import java.util.List;

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
        GraphNode node1 = new GraphNode.NodeBuilder().with($ -> {
                        $.count = 1;
                        $.name = "Test node 1";
                }).build();

        graph.addNode(node1);
        GraphNode node2 = new GraphNode.NodeBuilder().with($ -> {
            $.count = 1;
            $.name = "Test node 2";
        }).build();

        graph.addNode(node2);

        assertEquals( "Test node 1", graph.getVertices().get(0).getName());
        assertEquals( 2, graph.getVerticesSet().size());
    }
}

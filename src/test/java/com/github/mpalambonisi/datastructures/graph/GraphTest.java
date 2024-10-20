package com.github.mpalambonisi.datastructures.graph;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    @Test
    void addVertexTest() {
        Graph graph = new Graph();
        assertTrue(graph.addVertex("A"));
        assertTrue(graph.addVertex("B"));

        HashMap<String, ArrayList<String>> expectedGraph = new HashMap<>();
        expectedGraph.put("A", new ArrayList<String>());
        expectedGraph.put("B", new ArrayList<String>());
        assertEquals(expectedGraph, graph.getAdjList());
    }

    @Test
    void addEdgeTest() {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");

        // add edges
        assertTrue(graph.addEdge("A", "B"));
        assertTrue(graph.addEdge("A", "C"));

        HashMap<String, ArrayList<String>> expectedGraph = new HashMap<>();
        expectedGraph.put("A", new ArrayList<>(Arrays.asList("B", "C")));
        expectedGraph.put("B", new ArrayList<>(List.of("A")));
        expectedGraph.put("C", new ArrayList<>(List.of("A")));
        assertEquals(expectedGraph, graph.getAdjList());
    }

    @Test
    void addEdgeToNonExistingVertexTest() {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");

        // add edges to non-existing vertex
        assertFalse(graph.addEdge("F", "D"));
        assertFalse(graph.addEdge("C", "H"));
    }

    @Test
    void removeEdgeTest() {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        // add edges
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("D","A");
        graph.addEdge("C","B");
        graph.addEdge("D","C");

        // graph before removing edges
        HashMap<String, ArrayList<String>> expectedGraph01 = new HashMap<>();
        expectedGraph01.put("A", new ArrayList<>(Arrays.asList("B", "C", "D")));
        expectedGraph01.put("B", new ArrayList<>(Arrays.asList("A", "C")));
        expectedGraph01.put("C", new ArrayList<>(Arrays.asList("A", "B", "D")));
        expectedGraph01.put("D", new ArrayList<>(Arrays.asList("A", "C")));
        assertEquals(expectedGraph01, graph.getAdjList());

        // remove
        assertTrue(graph.removeEdge("C","B"));
        assertTrue(graph.removeEdge("D","A"));

        // graph after removing edges
        HashMap<String, ArrayList<String>> expectedGraph02 = new HashMap<>();
        expectedGraph02.put("A", new ArrayList<>(Arrays.asList("B", "C")));
        expectedGraph02.put("B", new ArrayList<>(List.of("A")));
        expectedGraph02.put("C", new ArrayList<>(Arrays.asList("A", "D")));
        expectedGraph02.put("D", new ArrayList<>(List.of("C")));
        assertEquals(expectedGraph02, graph.getAdjList());
    }

    @Test
    void removeNonExistingEdgeTest() {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        // add edges
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("D","A");
        graph.addEdge("C","B");
        graph.addEdge("D","C");

        // graph before removing edges
        HashMap<String, ArrayList<String>> expectedGraph01 = new HashMap<>();
        expectedGraph01.put("A", new ArrayList<>(Arrays.asList("B", "C", "D")));
        expectedGraph01.put("B", new ArrayList<>(Arrays.asList("A", "C")));
        expectedGraph01.put("C", new ArrayList<>(Arrays.asList("A", "B", "D")));
        expectedGraph01.put("D", new ArrayList<>(Arrays.asList("A", "C")));
        assertEquals(expectedGraph01, graph.getAdjList());

        // remove non-existing edge
        assertFalse(graph.removeEdge("E", "C"));
        assertFalse(graph.removeEdge("C", "F"));
    }

    @Test
    void removeVertexTest() {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        // add edges
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("D", "A");
        graph.addEdge("C", "B");
        graph.addEdge("D", "C");

        // graph before removing vertex
        HashMap<String, ArrayList<String>> expectedGraphBefore = new HashMap<>();
        expectedGraphBefore.put("A", new ArrayList<>(Arrays.asList("B", "C", "D")));
        expectedGraphBefore.put("B", new ArrayList<>(Arrays.asList("A", "C")));
        expectedGraphBefore.put("C", new ArrayList<>(Arrays.asList("A", "B", "D")));
        expectedGraphBefore.put("D", new ArrayList<>(Arrays.asList("A", "C")));
        assertEquals(expectedGraphBefore, graph.getAdjList());

        // remove vertex "C"
        assertTrue(graph.removeVertex("C"));

        // graph after removing vertex
        HashMap<String, ArrayList<String>> expectedGraphAfter = new HashMap<>();
        expectedGraphAfter.put("A", new ArrayList<>(List.of("B", "D"))); //
        expectedGraphAfter.put("B", new ArrayList<>(List.of("A")));
        expectedGraphAfter.put("D", new ArrayList<>(List.of("A")));
        assertEquals(expectedGraphAfter, graph.getAdjList());

    }
    @Test
    void removeNonExistingVertexTest() {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        // add edges
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("D", "A");
        graph.addEdge("C", "B");
        graph.addEdge("D", "C");

        // graph before removing vertex
        HashMap<String, ArrayList<String>> expectedGraphBefore = new HashMap<>();
        expectedGraphBefore.put("A", new ArrayList<>(Arrays.asList("B", "C", "D")));
        expectedGraphBefore.put("B", new ArrayList<>(Arrays.asList("A", "C")));
        expectedGraphBefore.put("C", new ArrayList<>(Arrays.asList("A", "B", "D")));
        expectedGraphBefore.put("D", new ArrayList<>(Arrays.asList("A", "C")));
        assertEquals(expectedGraphBefore, graph.getAdjList());

        // remove non-existing vertex
        assertFalse(graph.removeVertex("E"));

    }
}
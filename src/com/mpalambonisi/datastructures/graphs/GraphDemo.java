package com.mpalambonisi.datastructures.graphs;

public class GraphDemo {
    public static void main(String[] args) {
        Graph myGraph = new Graph();

        // addVertex() demonstration
        System.out.println("\n----------------------- addVertex() demo -----------------------\n");
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.printGraph();

        // addEdge() demonstration
        System.out.println("\n----------------------- addVertex() demo -----------------------\n");
        myGraph.addVertex("C");
        myGraph.addEdge("A", "B");
        myGraph.addEdge("A","C");
        myGraph.printGraph();

        // removeEdge() demonstration
        System.out.println("\n----------------------- removeEdge() demo -----------------------\n");
        myGraph.removeEdge("A","B");
        myGraph.printGraph();

        // removeVertex() demonstration
        System.out.println("\n----------------------- removeVertex() demo -----------------------\n");
        myGraph.addVertex("D");
        myGraph.addEdge("A", "D");
        myGraph.addEdge("B", "D");
        myGraph.addEdge("C", "D");
        myGraph.addEdge("B", "C");

        System.out.print("Before : -> ");
        myGraph.printGraph();

        myGraph.removeVertex("D");

        System.out.print("\nAfter  : -> ");
        myGraph.printGraph();

    }
}

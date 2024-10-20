package com.github.mpalambonisi.datastructures.graph;
import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    private HashMap<String, ArrayList<String>> adjList = new HashMap<>(); // adjacency list

    public HashMap<String, ArrayList<String>> getAdjList() {
        return adjList;
    }

    // addVertex() implementation
    public boolean addVertex(String vertex){
        if(adjList.get(vertex) == null) {
            adjList.put(vertex, new ArrayList<String>());
            return true;
        }
        return false;
    }
    // addEdge() implementation
    public boolean addEdge(String vertex01, String vertex02){
        if(adjList.get(vertex01) != null && adjList.get(vertex02) != null){
            adjList.get(vertex01).add(vertex02);
            adjList.get(vertex02).add(vertex01);
            return true;
        }
        return false;
    }

    // removeEdge() implementation
    public boolean removeEdge(String vertex01, String vertex02){
        if (adjList.get(vertex01) != null && adjList.get(vertex02) != null){
            adjList.get(vertex01).remove(vertex02);
            adjList.get(vertex02).remove(vertex01);
            return true;
        }
        return false;
    }

    // removeVertex() implementation
    public boolean removeVertex(String vertex){
        if (adjList.get(vertex) == null)  return false;
        for (String otherVertex : adjList.get(vertex)) {
            adjList.get(otherVertex).remove(vertex);
        }
        adjList.remove(vertex);
        return true;
    }
    public void printGraph(){
        System.out.println("Graph : " + adjList);
    }

}

package com.mpalambonisi.datastructures.binarySearchTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    Node root = null;

    class Node{
        int value;
        Node right;
        Node left;
        Node(int value) {
            this.value = value;
        }
    }
    public Node getRoot() {
        return root;
    }

    // BINARY SEARCH TREE TRAVERSAL

    // 1. BREADTH FIRST SEARCH (BFS)
    public ArrayList<Integer> BFS(){
        Node currentNode = root;
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> results = new ArrayList<>();
        queue.add(currentNode);
        while(!queue.isEmpty()){
            currentNode = queue.remove();
            results.add(currentNode.value);
            if (currentNode.left != null) queue.add(currentNode.left);
            if (currentNode.right != null) queue.add(currentNode.right);
        }
        return results;
    }

    // 2. DEPTH FIRST SEARCH (DFS) - PREORDER

    // *** The use of inner classes in DFS is beneficial for:
    // * encapsulation
    // * direct access to local variables in the method
    // * easy to read code
    // * undercutting global instance variables
    public ArrayList<Integer> DFSPreOrder(){
        ArrayList<Integer> results = new ArrayList<>();
        class Traverse{
            Traverse(Node currentNode){
                results.add(currentNode.value);
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
            }
        }
        new Traverse(root);
        return results;
    }

    // 3. DEPTH FIRST SEARCH (DFS) - POSTORDER

    public ArrayList<Integer> DFSPostOrder(){
        ArrayList<Integer> results = new ArrayList<>();
        class Traverse{
            Traverse(Node currentNode){
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                if (currentNode.right != null){
                    new Traverse(currentNode.right);
                }
                results.add(currentNode.value);
            }
        }
        new Traverse(root);
        return results;
    }
    // 4. DEPTH FIRST SEARCH (DFS) - INORDER
    public ArrayList<Integer> DFSInOrder(){
        ArrayList<Integer> results = new ArrayList<>();
        class Traverse{
            Traverse(Node currentNode){
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                results.add(currentNode.value);
                if (currentNode.right != null){
                    new Traverse(currentNode.right);
                }
            }
        }
        new Traverse(root);
        return results;
    }
}

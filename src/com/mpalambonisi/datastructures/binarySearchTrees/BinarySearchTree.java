package com.mpalambonisi.datastructures.binarySearchTrees;

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
}

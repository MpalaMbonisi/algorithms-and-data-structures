package com.mpalambonisi.datastructures.BinarySearchTrees;

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

    // Implement insert()
    public boolean insert(int value){
        Node newNode = new Node(value);
        if (root == null){
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true){
            if (temp.value == newNode.value) {
                return false;
            }
            else if (newNode.value < temp.value){
               if (temp.left == null){
                   temp.left = newNode;
                   return true;
               }
               else
                   temp = temp.left;
            }
            else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                else
                    temp = temp.right;
            }
        }
    }
    // implement contains()
    public boolean contains(int value){
        if (root == null) return false;
        Node temp = root;
        while(temp!=null){
            if (value < temp.value) temp = temp.left;
            else if (value > temp.value) temp = temp.right;
            else return true;
        }
        return false;
    }
}

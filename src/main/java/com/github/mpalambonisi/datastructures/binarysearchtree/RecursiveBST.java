package com.github.mpalambonisi.datastructures.binarysearchtree;

public class RecursiveBST extends BinarySearchTree{
    // insert() implementation
    private Node insert(Node currentNode, int value){
        if (currentNode == null) return new Node(value);
        if(value < currentNode.value){
            currentNode.left = insert(currentNode.left, value);
        }else if (value > currentNode.value) {
            currentNode.right = insert(currentNode.right, value);
        }
        return currentNode;
        // ** This return value allows the parent nodes to update their child pointers appropriately,
        // thereby updating the tree structure.
    }
    public void insert(int value){
        if (root == null) root = new Node(value);
        insert(root, value);
    }

    // contains() implementation
    private boolean contains(Node currentNode, int value){
        if (currentNode == null) return false;
        if (currentNode.value == value) return true;
        if (value < currentNode.value) {
            return contains(currentNode.left, value);
        }
        else {
            return contains(currentNode.right, value);
        }
    }

    public boolean contains(int value){
        return contains(root, value);
    }

    // delete() implementation

    // ** The minValue method is designed to find the minimum integer value in the binary search tree,
    //    (BST) starting from a specific node.
    private int minValue(Node currentNode){
        while(currentNode.left != null){
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }
    private Node deleteNode(Node currentNode, int value){
        if (currentNode == null) return null;
        if (value < currentNode.value) {
            currentNode.left = deleteNode(currentNode.left, value);
        } else if (value > currentNode.value){
            currentNode.right = deleteNode(currentNode.right, value);
        }else{
            // leaf with no children
            if (currentNode.left == null && currentNode.right == null) return null;
            // has a left child without a right child
            else if (currentNode.right == null) return currentNode.left;
            // has a right child without a left child
            else if (currentNode.left == null) return currentNode.right;
            // has both right and left child
            else{
                int subTreeMin = minValue(currentNode.right);
                currentNode.value = subTreeMin;
                currentNode.right = deleteNode(currentNode.right, subTreeMin);
            }
        }
        return currentNode;
    }

    public void deleteNode(int value){
        deleteNode(root, value);
    }
}

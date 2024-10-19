package com.mpalambonisi.datastructures.binarysearchtrees;

public class LeetCodeExDemo {
    public static void main(String[] args) {

        // isBST() demonstration
        System.out.println("\n----------- isBST() demo -----------\n");
        testSingleNodeTree();
        testValidBST();
        testValidBSTWithDeepLeftSubtree();
        testValidBSTWithDeepRightSubtree();
        testBalancedBST();

        // kthSmallestNode() demonstration
        System.out.println("\n----------- kthSmallestNode() demo -----------\n");
        RecursiveBST bst = new RecursiveBST();

        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(2);
        bst.insert(4);
        bst.insert(6);
        bst.insert(8);

        System.out.println(bst.kthSmallest(1));  // Expected output: 2
        System.out.println(bst.kthSmallest(3));  // Expected output: 4
        System.out.println(bst.kthSmallest(6));  // Expected output: 7
    }

    // implementation of isBST() test methods
    private static void testSingleNodeTree() {
        System.out.println("\n----- Test: Single Node Tree -----\n");
        RecursiveBST bst = new RecursiveBST();
        bst.insert(10);
        printIsValidBST(bst);
    }

    private static void testValidBST() {
        System.out.println("\n----- Test: Valid BST -----\n");
        RecursiveBST bst = new RecursiveBST();
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        printIsValidBST(bst);
    }

    private static void testValidBSTWithDeepLeftSubtree() {
        System.out.println("\n----- Test: BST With Deep Left Subtree -----\n");
        RecursiveBST bst = new RecursiveBST();
        bst.insert(10);
        bst.insert(8);
        bst.insert(6);
        bst.insert(4);
        bst.insert(2);
        printIsValidBST(bst);
    }

    private static void testValidBSTWithDeepRightSubtree() {
        System.out.println("\n----- Test: BST With Deep Right Subtree -----\n");
        RecursiveBST bst = new RecursiveBST();
        bst.insert(10);
        bst.insert(12);
        bst.insert(14);
        bst.insert(16);
        bst.insert(18);
        printIsValidBST(bst);
    }

    private static void testBalancedBST() {
        System.out.println("\n----- Test: Balanced BST -----\n");
        RecursiveBST bst = new RecursiveBST();
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(2);
        bst.insert(7);
        bst.insert(12);
        bst.insert(18);
        printIsValidBST(bst);
    }

    private static void printIsValidBST(BinarySearchTree bst) {
        System.out.println("Is valid BST: " + bst.isValidBST());
    }
}

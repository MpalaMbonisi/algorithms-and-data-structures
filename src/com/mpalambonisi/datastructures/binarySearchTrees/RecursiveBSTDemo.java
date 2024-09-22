package com.mpalambonisi.datastructures.binarySearchTrees;

public class RecursiveBSTDemo {
    public static void main(String[] args) {
        RecursiveBST myBST = new RecursiveBST();
        System.out.println("Root : " + myBST.getRoot());

        // insert() demonstration
        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);

        /*                THIS IS THE TREE REPRESENTATION
                                  2
                                 / \
                                1   3
                                     \
                                     47
                                    /  \
                                  21    76
                                 /  \   / \
                               18    27 52 82
        */

        // contains() demonstration
        System.out.println("\n----------------- contains() recursive demo ---------------------\n");
        System.out.print("BST contains 27 : ");
        System.out.println(myBST.contains(27));

        System.out.print("\nBST contains 17 : ");
        System.out.println(myBST.contains(17));

        // delete() demonstration
        System.out.println("\n----------------- delete() recursive demo ---------------------\n");
        myBST.deleteNode(47);
        System.out.println("Deleted 47 ... \n");
        System.out.print("BST contains 47 : ");
        System.out.println(myBST.contains(47));
    }
}

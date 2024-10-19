package com.github.mpalambonisi.datastructures.binarysearchtrees;

public class IterativeBSTDemo {
    public static void main(String[] args) {
        IterativeBST myBST = new IterativeBST();
        System.out.println("Root : " + myBST.getRoot());

        // insert() demonstration
        System.out.println("\n----------------- insert() ---------------------\n");
        myBST.insert(2);
        myBST.insert(1);
        myBST.insert(3);
        /*
            THE LINES ABOVE CREATE THIS TREE:
                         2
                        / \
                       1   3
        */
        System.out.println("Root: " + myBST.getRoot().value);
        System.out.println("Root -> Left : " + myBST.getRoot().left.value);
        System.out.println("Root -> Right : " + myBST.getRoot().right.value);

        // contains() demonstration
        System.out.println("\n----------------- contains() iterative demo ---------------------\n");
        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);

        System.out.println("Binary Search Tree contains 27 : " + myBST.contains(27)); // returns true
        System.out.println("Binary Search Tree contains 17 : " + myBST.contains(17)); // returns false

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
    }
}

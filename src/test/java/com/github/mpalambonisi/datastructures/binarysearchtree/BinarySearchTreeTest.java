package com.github.mpalambonisi.datastructures.binarysearchtree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {
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
    @Test
    void binarySearchTreeWorks() {
        // create a binary search tree
        RecursiveBST bst = new RecursiveBST();
        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(27);
        bst.insert(52);
        bst.insert(82);

        // expected results = [47, 21, 76, 18, 27, 52, 82]
        ArrayList<Integer> result = new ArrayList<>();
        result.add(47);
        result.add(21);
        result.add(76);
        result.add(18);
        result.add(27);
        result.add(52);
        result.add(82);

        assertEquals(result, bst.BFS());
    }

    @Test
    void DFSPreOrderTest() {
        // create a binary search tree
        RecursiveBST bst = new RecursiveBST();
        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(27);
        bst.insert(52);
        bst.insert(82);

        // expected results = [47, 21, 18, 27, 76, 52, 82]
        ArrayList<Integer> result = new ArrayList<>();
        result.add(47);
        result.add(21);
        result.add(18);
        result.add(27);
        result.add(76);
        result.add(52);
        result.add(82);

        assertEquals(result, bst.DFSPreOrder());
    }

    @Test
    void DFSPostOrderTest() {
        // create a binary search tree
        RecursiveBST bst = new RecursiveBST();
        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(27);
        bst.insert(52);
        bst.insert(82);

        // expected results = [18, 27, 21, 52, 82, 76, 47]
        ArrayList<Integer> result = new ArrayList<>();
        result.add(18);
        result.add(27);
        result.add(21);
        result.add(52);
        result.add(82);
        result.add(76);
        result.add(47);

        assertEquals(result, bst.DFSPostOrder());
    }

    @Test
    void DFSInOrder() {
        // create a binary search tree
        RecursiveBST bst = new RecursiveBST();
        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(27);
        bst.insert(52);
        bst.insert(82);

        // expected results = [18, 21, 27, 47, 52, 76, 82]
        ArrayList<Integer> result = new ArrayList<>();
        result.add(18);
        result.add(21);
        result.add(27);
        result.add(47);
        result.add(52);
        result.add(76);
        result.add(82);

        assertEquals(result, bst.DFSInOrder());
    }
    @Test
    void kthSmallest() {
        // creating a Binary Search Tree
        RecursiveBST bst = new RecursiveBST();
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(2);
        bst.insert(4);
        bst.insert(6);
        bst.insert(8);

        assertEquals(2, bst.kthSmallest(1));
        assertEquals(4, bst.kthSmallest(3));
        assertEquals(7, bst.kthSmallest(6));
    }

    // testing the isValidBST()
    @Test
    void singleTreeNodeTest(){
        RecursiveBST bst = new RecursiveBST();
        bst.insert(10);
        assertTrue(bst.isValidBST());
    }
    @Test
    void testValidBST(){
        RecursiveBST bst = new RecursiveBST();
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        assertTrue(bst.isValidBST());
    }

    @Test
    void testValidBSTWithDeepLeftSubtree(){
        RecursiveBST bst = new RecursiveBST();
        bst.insert(10);
        bst.insert(8);
        bst.insert(6);
        bst.insert(4);
        bst.insert(2);
        assertTrue(bst.isValidBST());
    }

    @Test
    void testValidBSTWithDeepRightSubtree(){
        RecursiveBST bst = new RecursiveBST();
        bst.insert(10);
        bst.insert(12);
        bst.insert(14);
        bst.insert(16);
        bst.insert(18);
        assertTrue(bst.isValidBST());
    }

    @Test
    void testBalancedBST(){
        RecursiveBST bst = new RecursiveBST();
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(2);
        bst.insert(7);
        bst.insert(12);
        bst.insert(18);
        assertTrue(bst.isValidBST());
    }
}
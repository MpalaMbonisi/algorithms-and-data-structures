package com.github.mpalambonisi.datastructures.binarysearchtree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveBSTTest {

    @Test
    void insertTest() {
        RecursiveBST bst = new RecursiveBST();
        bst.insert(2);
        bst.insert(1);
        bst.insert(3);

        assertEquals(2, bst.getRoot().value);
        assertEquals(1, bst.getRoot().left.value);
        assertEquals(3, bst.getRoot().right.value);
    }

    @Test
    void containsIsTrueTest() {
        RecursiveBST bst = new RecursiveBST();
        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(27);
        bst.insert(52);
        bst.insert(82);

        assertTrue(bst.contains(82));
        assertTrue(bst.contains(18));
    }

    @Test
    void containsIsFalseTest(){
        RecursiveBST bst = new RecursiveBST();
        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(27);
        bst.insert(52);
        bst.insert(82);

        assertFalse(bst.contains(0));
        assertFalse(bst.contains(100));
    }

    @Test
    void deleteRootNodeTest() {
        RecursiveBST bst = new RecursiveBST();
        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(27);
        bst.insert(52);
        bst.insert(82);

        bst.deleteNode(47);
        assertFalse(bst.contains(47));
    }
    @Test
    void deleteLastNodeTest() {
        RecursiveBST bst = new RecursiveBST();
        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(27);
        bst.insert(52);
        bst.insert(82);

        bst.deleteNode(82);
        assertFalse(bst.contains(82));
    }
    @Test
    void deleteMiddleNodeTest() {
        RecursiveBST bst = new RecursiveBST();
        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(27);
        bst.insert(52);
        bst.insert(82);

        bst.deleteNode(18);
        assertFalse(bst.contains(18));
    }
}
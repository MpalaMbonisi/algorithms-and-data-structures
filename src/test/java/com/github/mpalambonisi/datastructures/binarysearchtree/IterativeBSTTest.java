package com.github.mpalambonisi.datastructures.binarysearchtree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IterativeBSTTest {

    @Test
    void insertTest() {
        IterativeBST bst = new IterativeBST();
        bst.insert(2);
        bst.insert(1);
        bst.insert(3);

        assertEquals(2, bst.getRoot().value);
        assertEquals(1, bst.getRoot().left.value);
        assertEquals(3, bst.getRoot().right.value);
    }

    @Test
    void containsIsTrueTest() {
        IterativeBST bst = new IterativeBST();
        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(27);
        bst.insert(52);
        bst.insert(82);

        assertTrue(bst.contains(27));
    }
    @Test
    void containsIsFalseTest() {
        IterativeBST bst = new IterativeBST();
        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(27);
        bst.insert(52);
        bst.insert(82);

        assertFalse(bst.contains(100));
    }
}
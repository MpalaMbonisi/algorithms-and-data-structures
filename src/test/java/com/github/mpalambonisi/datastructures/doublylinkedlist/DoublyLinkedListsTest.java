package com.github.mpalambonisi.datastructures.doublylinkedlist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListsTest {

    @Test
    void appendTest() {
        DoublyLinkedList list = new DoublyLinkedList(7);
        list.append(6);
        list.append(5);
        list.append(4);
        list.append(3);
        list.append(2);
        assertArrayEquals(new int[] {7,6,5,4,3,2}, list.toArray());
    }

    @Test
    void removeLastTest() {
        DoublyLinkedList list = new DoublyLinkedList(7);
        list.append(6);
        list.append(5);
        list.append(4);
        list.append(3);
        list.append(2);

        list.removeLast();
        assertArrayEquals(new int[] {7,6,5,4,3}, list.toArray());
    }

    @Test
    void prependTest() {
        DoublyLinkedList list = new DoublyLinkedList(7);
        list.append(6);
        list.append(5);
        list.append(4);
        list.append(3);
        list.append(2);

        list.prepend(8);
        list.prepend(9);
        assertArrayEquals(new int[] {9,8,7,6,5,4,3,2}, list.toArray());
    }

    @Test
    void removeFirstTest() {
        DoublyLinkedList list = new DoublyLinkedList(7);
        list.append(6);
        list.append(5);
        list.append(4);
        list.append(3);
        list.append(2);

        list.removeFirst();
        assertArrayEquals(new int[] {6,5,4,3,2}, list.toArray());
        list.removeFirst();
        assertArrayEquals(new int[] {5,4,3,2}, list.toArray());
    }

    @Test
    void getValidIndexTest() {
        DoublyLinkedList list = new DoublyLinkedList(9);
        list.append(8);
        list.append(7);
        list.append(6);
        list.append(5);
        list.append(4);
        list.append(3);
        list.append(2);

        assertEquals(6, list.get(3).value); // value at index 3
        assertEquals(9, list.get(0).value); // value at index 0
    }

    @Test
    void getIndexAboveLengthTest() {
        DoublyLinkedList list = new DoublyLinkedList(9);
        list.append(8);
        list.append(7);
        list.append(6);
        list.append(5);
        list.append(4);
        list.append(3);
        list.append(2);

        assertNull(list.get(10)); // value at index 10 but length = 8
    }

    @Test
    void getIndexBelowLengthTest() {
        DoublyLinkedList list = new DoublyLinkedList(9);
        list.append(8);
        list.append(7);
        list.append(6);
        list.append(5);
        list.append(4);
        list.append(3);
        list.append(2);

        assertNull(list.get(-1));
    }

    @Test
    void setFirstIndexTest() {
        DoublyLinkedList list = new DoublyLinkedList(9);
        list.append(8);
        list.append(7);
        list.append(6);
        list.append(5);
        list.append(4);
        list.append(3);
        list.append(2);

        assertTrue(list.set(0,100));
        assertArrayEquals(new int[] {100,8,7,6,5,4,3,2}, list.toArray());
    }

    @Test
    void setMiddleIndexTest() {
        DoublyLinkedList list = new DoublyLinkedList(9);
        list.append(8);
        list.append(7);
        list.append(6);
        list.append(5);
        list.append(4);
        list.append(3);
        list.append(2);

        assertTrue(list.set(5,100));
        assertArrayEquals(new int[] {9,8,7,6,5,100,3,2}, list.toArray());
    }

    @Test
    void setLastIndexTest() {
        DoublyLinkedList list = new DoublyLinkedList(9);
        list.append(8);
        list.append(7);
        list.append(6);
        list.append(5);
        list.append(4);
        list.append(3);
        list.append(2);

        assertTrue(list.set(7,100));
        assertArrayEquals(new int[] {9,8,7,6,5,4,3,100}, list.toArray());
    }

    @Test
    void insertToFirstIndexTest() {
        DoublyLinkedList list = new DoublyLinkedList(9);
        list.append(8);
        list.append(7);
        list.append(6);
        list.append(5);
        list.append(4);
        list.append(3);
        list.append(2);

        assertTrue(list.insert(0, 100));
        assertArrayEquals(new int[] {100, 9, 8, 7, 6, 5, 4, 3, 2}, list.toArray());
    }

    @Test
    void insertToMiddleIndexTest() {
        DoublyLinkedList list = new DoublyLinkedList(9);
        list.append(8);
        list.append(7);
        list.append(6);
        list.append(5);
        list.append(4);
        list.append(3);
        list.append(2);

        assertTrue(list.insert(5, 100));
        assertArrayEquals(new int[] {9, 8, 7, 6, 5, 100, 4, 3, 2}, list.toArray());
    }

    @Test
    void insertToEndIndexTest() {
        DoublyLinkedList list = new DoublyLinkedList(9);
        list.append(8);
        list.append(7);
        list.append(6);
        list.append(5);
        list.append(4);
        list.append(3);
        list.append(2);

        assertTrue(list.insert(8, 100));
        assertArrayEquals(new int[] {9, 8, 7, 6, 5, 4, 3, 2, 100}, list.toArray());
    }

    @Test
    void removeFirstIndexTest() {
        DoublyLinkedList list = new DoublyLinkedList(9);
        list.append(8);
        list.append(7);
        list.append(6);
        list.append(5);
        list.append(4);
        list.append(3);
        list.append(2);

        list.remove(0);
        assertArrayEquals(new int[] {8, 7, 6, 5, 4, 3, 2}, list.toArray());
    }

    @Test
    void removeMiddleIndexTest() {
        DoublyLinkedList list = new DoublyLinkedList(9);
        list.append(8);
        list.append(7);
        list.append(6);
        list.append(5);
        list.append(4);
        list.append(3);
        list.append(2);

        list.remove(3);
        assertArrayEquals(new int[] {9, 8, 7, 5, 4, 3, 2}, list.toArray());
    }

    @Test
    void removeLastIndexTest() {
        DoublyLinkedList list = new DoublyLinkedList(9);
        list.append(8);
        list.append(7);
        list.append(6);
        list.append(5);
        list.append(4);
        list.append(3);
        list.append(2);

        list.remove(7);
        assertArrayEquals(new int[] {9, 8, 7, 6, 5, 4, 3}, list.toArray());
    }

    @Test
    void swapFirstLastTest() {
        DoublyLinkedList list = new DoublyLinkedList(9);
        list.append(8);
        list.append(7);
        list.append(6);
        list.append(5);
        list.append(4);
        list.append(3);
        list.append(2);

        assertTrue(list.swapFirstLast());
        assertArrayEquals(new int[] {2, 8, 7, 6, 5, 4, 3, 9}, list.toArray());
    }

    @Test
    @DisplayName("for-list-with-one-value-swap-first-and-last")
    void swapFirstLastTest02() {
        DoublyLinkedList list = new DoublyLinkedList(9);

        assertFalse(list.swapFirstLast());
        assertArrayEquals(new int[] {9}, list.toArray());
    }

    @Test
    void reverseTest() {
        DoublyLinkedList list = new DoublyLinkedList(9);
        list.append(8);
        list.append(7);
        list.append(6);
        list.append(5);
        list.append(4);
        list.append(3);
        list.append(2);

        list.reverse();
        assertArrayEquals(new int[] {2, 3, 4, 5, 6, 7, 8, 9}, list.toArray());
    }

    @Test
    void isPalindromeTest() {
        DoublyLinkedList list = new DoublyLinkedList(1);
        list.append(2);
        list.append(3);
        list.append(2);
        list.append(1);

        assertTrue(list.isPalindrome());
    }

    @Test
    void isNotPalindromeTest() {
        DoublyLinkedList list = new DoublyLinkedList(1);
        list.append(2);
        list.append(3);
        list.append(1);

        assertFalse(list.isPalindrome());
    }
}
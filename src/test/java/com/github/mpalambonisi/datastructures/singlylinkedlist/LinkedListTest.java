package com.github.mpalambonisi.datastructures.singlylinkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void appendTest() {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        int[] expectedResult = {1, 2, 3, 4, 5};
        assertArrayEquals(expectedResult, list.toArray());
    }

    @Test
    void removeLastTest() {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        assertEquals(5, list.removeLast().value);
        int[] expectedResult = {1, 2, 3, 4};
        assertArrayEquals(expectedResult, list.toArray());
    }

    @Test
    void prependTest() {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        list.prepend(0);
        list.prepend(-1);
        list.prepend(-2);
        int[] expectedResult = {-2, -1, 0, 1, 2, 3, 4, 5};
        assertArrayEquals(expectedResult, list.toArray());
    }

    @Test
    void removeFirstTest() {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        assertEquals(1, list.removeFirst().value);
        int[] expectedResult = {2, 3, 4, 5};
        assertArrayEquals(expectedResult, list.toArray());
    }

    @Test
    void getFirstIndexTest() {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        assertEquals(1, list.get(0).value);
    }

    @Test
    void getMiddleIndexTest() {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        assertEquals(3, list.get(2).value);
    }

    @Test
    void getLastIndexTest() {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        assertEquals(5, list.get(4).value);
    }

    @Test
    void getIndexMoreThanLengthTest() {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        assertNull(list.get(10));
    }
    @Test
    void setMiddleIndexTest() {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        assertTrue(list.set(2, 100));
        int[] expectedResult = {1, 2, 100, 4, 5};
        assertArrayEquals(expectedResult, list.toArray());
    }

    @Test
    void setFirstIndexTest() {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        assertTrue(list.set(0, 100));
        int[] expectedResult = {100, 2, 3, 4, 5};
        assertArrayEquals(expectedResult, list.toArray());
    }

    @Test
    void setLastIndexTest() {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        assertTrue(list.set(4, 100));
        int[] expectedResult = {1, 2, 3, 4, 100};
        assertArrayEquals(expectedResult, list.toArray());
    }

    @Test
    void insertAtFirstIndexTest() {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        assertTrue(list.insert(0, 100));
        int[] expectedResult = {100, 1, 2, 3, 4, 5};
        assertArrayEquals(expectedResult, list.toArray());
    }

    @Test
    void insertAtMiddleIndexTest() {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        assertTrue(list.insert(3, 100));
        int[] expectedResult = {1, 2, 3, 100, 4, 5};
        assertArrayEquals(expectedResult, list.toArray());
    }

    @Test
    void insertAtEndIndexTest() {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        assertTrue(list.insert(5, 100));
        int[] expectedResult = {1, 2, 3, 4, 5, 100};
        assertArrayEquals(expectedResult, list.toArray());
    }

    @Test
    void removeFirstIndexTest() {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        assertEquals(1, list.remove(0).value);
        int[] expectedResult = {2, 3, 4, 5};
        assertArrayEquals(expectedResult, list.toArray());
    }

    @Test
    void removeMiddleIndexTest() {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        assertEquals(3, list.remove(2).value);
        int[] expectedResult = {1, 2, 4, 5};
        assertArrayEquals(expectedResult, list.toArray());
    }

    @Test
    void removeLastIndexTest() {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        assertEquals(5, list.remove(4).value);
        int[] expectedResult = {1, 2, 3, 4};
        assertArrayEquals(expectedResult, list.toArray());
    }

    @Test
    void reverseTest() {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        list.reverse();
        int[] expectedResult = {5, 4, 3, 2, 1};
        assertArrayEquals(expectedResult, list.toArray());
    }

    @Test
    void findMiddleNodeWithEvenArray() {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);

        assertEquals(4, list.findMiddleNode().value);
    }
    @Test
    void findMiddleNodeWithOddArray() {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        assertEquals(3, list.findMiddleNode().value);
    }

    @Test
    void hasLoopTestWithNoLoop() {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);

        assertFalse(list.hasLoop());
    }

    @Test
    void hasLoopTestWithLoop() {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);
        // create a loop by connecting the tail to the head
        list.getTail().next = list.getHead();

        assertTrue(list.hasLoop());
    }

    @Test
    void partitionListTest() {
        LinkedList list = new LinkedList(3);
        list.append(5);
        list.append(8);
        list.append(10);
        list.append(2);
        list.append(1);

        list.partitionList(5);
        int[] expectedResult = {3, 2, 1, 5, 8, 10};
        assertArrayEquals(expectedResult, list.toArray());
    }

    @Test
    void removeDuplicatesTestWithDuplicates() {
        LinkedList list = new LinkedList(1);
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(3);
        list.append(3);

        list.removeDuplicates();
        int[] expectedResult = {1, 2, 3};
        assertArrayEquals(expectedResult, list.toArray());
    }

    @Test
    void removeDuplicatesTestWithNoDuplicates() {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);

        list.removeDuplicates();
        int[] expectedResult = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expectedResult, list.toArray());
    }

    @Test
    void removeDuplicatesTestWithAllDuplicates() {
        LinkedList list = new LinkedList(1);
        list.append(1);
        list.append(1);
        list.append(1);
        list.append(1);
        list.append(1);

        list.removeDuplicates();
        int[] expectedResult = {1};
        assertArrayEquals(expectedResult, list.toArray());
    }

    @Test
    void binaryToDecimalTest01() {
        LinkedList list = new LinkedList(1);
        list.append(0);
        list.append(1);
        list.append(1);

        // 1011 -> 11
        assertEquals(11, list.binaryToDecimal());
    }

    @Test
    void binaryToDecimalTest02() {
        LinkedList list = new LinkedList(1);
        list.append(1);
        list.append(0);
        list.append(0);

        // 1100 -> 12
        assertEquals(12, list.binaryToDecimal());
    }

    @Test
    void binaryToDecimalTest03() {
        LinkedList list = new LinkedList(1);

        // 1 -> 1
        assertEquals(1, list.binaryToDecimal());
    }

    @Test
    void binaryToDecimalEmptyListTest() {
        LinkedList list = new LinkedList(0);
        list.makeEmpty();

        // empty list -> 0
        assertEquals(0, list.binaryToDecimal());
    }

    @Test
    void reverseBetweenDifferentIndicesTest() {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);

        list.reverseBetween(1,3);
        int[] expectedResult = {1, 4, 3, 2, 5, 6};
        assertArrayEquals(expectedResult, list.toArray());
    }

    @Test
    void reverseBetweenSameIndicesTest() {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);

        list.reverseBetween(2,2);
        int[] expectedResult = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expectedResult, list.toArray());
    }

    @Test
    void reverseBetweenEmptyListTest() {
        LinkedList list = new LinkedList(0);
        list.makeEmpty();

        list.reverseBetween(0,0);
        int[] expectedResult = {};
        assertArrayEquals(expectedResult, list.toArray());
    }

    @Test
    void reverseBetweenEntireListTest() {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);

        list.reverseBetween(0,5);
        int[] expectedResult = {6, 5, 4, 3, 2, 1};
        assertArrayEquals(expectedResult, list.toArray());
    }

    @Test
    void findKthFromEndTestMiddle() {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);

        assertEquals(4, list.findKthFromEnd(3).value);
    }

    @Test
    void findKthFromEndTestFirst() {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);

        assertEquals(1, list.findKthFromEnd(6).value);
    }

    @Test
    void findKthFromEndTestLast() {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);

        assertEquals(6, list.findKthFromEnd(1).value);
    }

    @Test
    void findKthFromEndTestLessThanZero() {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);

        assertNull(list.findKthFromEnd(-2));
    }

    @Test
    void findKthFromEndTestMoreThanLength() {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);

        assertNull(list.findKthFromEnd(10));
    }

    @Test
    void bubbleSortTestUnSorted() {
        LinkedList list = new LinkedList(6);
        list.append(2);
        list.append(5);
        list.append(1);
        list.append(3);
        list.append(7);
        list.append(4);

        list.bubbleSort();
        int[] expectedResult = {1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(expectedResult, list.toArray());
    }

    @Test
    void bubbleSortTestSorted() {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);
        list.append(7);

        list.bubbleSort();
        int[] expectedResult = {1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(expectedResult, list.toArray());
    }

    @Test
    void bubbleSortTestSameElements() {
        LinkedList list = new LinkedList(1);
        list.append(1);
        list.append(1);
        list.append(1);
        list.append(1);
        list.append(1);
        list.append(1);

        list.bubbleSort();
        int[] expectedResult = {1, 1, 1, 1, 1, 1, 1};
        assertArrayEquals(expectedResult, list.toArray());
    }

    @Test
    void bubbleSortTestDuplicates() {
        LinkedList list = new LinkedList(1);
        list.append(3);
        list.append(4);
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);

        list.bubbleSort();
        int[] expectedResult = {1, 1, 2, 3, 3, 4, 4};
        assertArrayEquals(expectedResult, list.toArray());
    }

    @Test
    void selectionSortTestUnSorted() {
        LinkedList list = new LinkedList(6);
        list.append(2);
        list.append(5);
        list.append(1);
        list.append(3);
        list.append(7);
        list.append(4);

        list.selectionSort();
        int[] expectedResult = {1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(expectedResult, list.toArray());
    }

    @Test
    void selectionSortTestSorted() {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);
        list.append(7);

        list.selectionSort();
        int[] expectedResult = {1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(expectedResult, list.toArray());
    }

    @Test
    void selectionSortTestSameElements() {
        LinkedList list = new LinkedList(1);
        list.append(1);
        list.append(1);
        list.append(1);
        list.append(1);
        list.append(1);
        list.append(1);

        list.selectionSort();
        int[] expectedResult = {1, 1, 1, 1, 1, 1, 1};
        assertArrayEquals(expectedResult, list.toArray());
    }

    @Test
    void selectionSortTestDuplicates() {
        LinkedList list = new LinkedList(1);
        list.append(3);
        list.append(4);
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);

        list.selectionSort();
        int[] expectedResult = {1, 1, 2, 3, 3, 4, 4};
        assertArrayEquals(expectedResult, list.toArray());
    }

    @Test
    void insertionSortTestUnSorted() {
        LinkedList list = new LinkedList(6);
        list.append(2);
        list.append(5);
        list.append(1);
        list.append(3);
        list.append(7);
        list.append(4);

        list.insertionSort();
        int[] expectedResult = {1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(expectedResult, list.toArray());
    }

    @Test
    void insertionSortTestSorted() {
        LinkedList list = new LinkedList(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);
        list.append(7);

        list.insertionSort();
        int[] expectedResult = {1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(expectedResult, list.toArray());
    }

    @Test
    void insertionSortTestSameElements() {
        LinkedList list = new LinkedList(1);
        list.append(1);
        list.append(1);
        list.append(1);
        list.append(1);
        list.append(1);
        list.append(1);

        list.insertionSort();
        int[] expectedResult = {1, 1, 1, 1, 1, 1, 1};
        assertArrayEquals(expectedResult, list.toArray());
    }

    @Test
    void insertionSortTestDuplicates() {
        LinkedList list = new LinkedList(1);
        list.append(3);
        list.append(4);
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);

        list.insertionSort();
        int[] expectedResult = {1, 1, 2, 3, 3, 4, 4};
        assertArrayEquals(expectedResult, list.toArray());
    }

    @Test
    void mergeTest() {
        LinkedList list01 = new LinkedList(2);
        list01.append(5);
        list01.append(6);
        list01.append(9);

        LinkedList list02 = new LinkedList(1);
        list02.append(3);
        list02.append(4);
        list02.append(7);
        list02.append(8);

        list02.merge(list01);
        int[] expectedResult = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(expectedResult, list02.toArray());
    }
}
package com.github.mpalambonisi.sortingalgorithms.bubblesort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void testBubbleSortWithUnSortedElements() {
        int[] nums = {7, 4, 2, 6, 5, 8, 1, 3};
        int[] expectedResult = {1, 2, 3, 4, 5, 6, 7, 8};

        BubbleSort.sort(nums);
        assertArrayEquals(expectedResult, nums);
    }
    @Test
    void testBubbleSortWithSortedElements() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expectedResult = {1, 2, 3, 4, 5, 6, 7, 8};

        BubbleSort.sort(nums);
        assertArrayEquals(expectedResult, nums);
    }
    @Test
    void testBubbleSortWithSameElements() {
        int[] nums = {1, 1, 1, 1, 1, 1, 1};
        int[] expectedResult = {1, 1, 1, 1, 1, 1, 1};

        BubbleSort.sort(nums);
        assertArrayEquals(expectedResult, nums);
    }
    @Test
    void testBubbleSortWithDuplicateElements() {
        int[] nums = {1, 2, 5, 2, 4, 3, 5, 4, 1};
        int[] expectedResult = {1, 1, 2, 2, 3, 4, 4, 5, 5};

        BubbleSort.sort(nums);
        assertArrayEquals(expectedResult, nums);
    }

    @Test
    void testBubbleSortWithEmptyArray() {
        int[] nums = {};
        int[] expectedResult = {};

        BubbleSort.sort(nums);
        assertArrayEquals(expectedResult, nums);
    }
}
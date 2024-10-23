package com.github.mpalambonisi.sortingalgorithms.quicksort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void testQuickSortWithUnSortedElements() {
        int[] nums = {7, 4, 2, 6, 5, 8, 1, 3};
        int[] expectedResult = {1, 2, 3, 4, 5, 6, 7, 8};

        QuickSort.sort(nums);
        assertArrayEquals(expectedResult, nums);
    }

    @Test
    void testQuickSortWithSortedElements() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expectedResult = {1, 2, 3, 4, 5, 6, 7, 8};

        QuickSort.sort(nums);
        assertArrayEquals(expectedResult, nums);
    }

    @Test
    void testQuickSortWithSameElements() {
        int[] nums = {1, 1, 1, 1, 1, 1, 1};
        int[] expectedResult = {1, 1, 1, 1, 1, 1, 1};

        QuickSort.sort(nums);
        assertArrayEquals(expectedResult, nums);
    }

    @Test
    void testQuickSortWithDuplicateElements() {
        int[] nums = {1, 2, 5, 2, 4, 3, 5, 4, 1};
        int[] expectedResult = {1, 1, 2, 2, 3, 4, 4, 5, 5};

        QuickSort.sort(nums);
        assertArrayEquals(expectedResult, nums);
    }

    @Test
    void testQuickSortWithEmptyArray() {
        int[] nums = {};
        int[] expectedResult = {};

        QuickSort.sort(nums);
        assertArrayEquals(expectedResult, nums);
    }
}
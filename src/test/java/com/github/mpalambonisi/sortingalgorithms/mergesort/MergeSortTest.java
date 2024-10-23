package com.github.mpalambonisi.sortingalgorithms.mergesort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void testMergeSortWithUnSortedElements() {
        int[] nums = {7, 4, 2, 6, 5, 8, 1, 3};
        int[] expectedResult = {1, 2, 3, 4, 5, 6, 7, 8};

        assertArrayEquals(expectedResult, MergeSort.sort(nums));
    }

    @Test
    void testMergeSortWithSortedElements() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expectedResult = {1, 2, 3, 4, 5, 6, 7, 8};

        assertArrayEquals(expectedResult, MergeSort.sort(nums));
    }

    @Test
    void testMergeSortWithSameElements() {
        int[] nums = {1, 1, 1, 1, 1, 1, 1};
        int[] expectedResult = {1, 1, 1, 1, 1, 1, 1};

        assertArrayEquals(expectedResult, MergeSort.sort(nums));
    }

    @Test
    void testMergeSortWithDuplicateElements() {
        int[] nums = {1, 2, 5, 2, 4, 3, 5, 4, 1};
        int[] expectedResult = {1, 1, 2, 2, 3, 4, 4, 5, 5};

        assertArrayEquals(expectedResult, MergeSort.sort(nums));
    }

    @Test
    void testMergeSortWithEmptyArray() {
        int[] nums = {};
        int[] expectedResult = {};

        assertArrayEquals(expectedResult, MergeSort.sort(nums));
    }
}
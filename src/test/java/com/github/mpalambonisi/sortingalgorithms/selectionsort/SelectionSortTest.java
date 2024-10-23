package com.github.mpalambonisi.sortingalgorithms.selectionsort;

import com.github.mpalambonisi.sortingalgorithms.bubblesort.BubbleSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @Test
    void testSelectionSortWithUnSortedElements() {
        int[] nums = {7, 4, 2, 6, 5, 8, 1, 3};
        int[] expectedResult = {1, 2, 3, 4, 5, 6, 7, 8};

        SelectionSort.sort(nums);
        assertArrayEquals(expectedResult, nums);
    }

    @Test
    void testSelectionSortWithSortedElements() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expectedResult = {1, 2, 3, 4, 5, 6, 7, 8};

        SelectionSort.sort(nums);
        assertArrayEquals(expectedResult, nums);
    }

    @Test
    void testSelectionSortWithSameElements() {
        int[] nums = {1, 1, 1, 1, 1, 1, 1};
        int[] expectedResult = {1, 1, 1, 1, 1, 1, 1};

        SelectionSort.sort(nums);
        assertArrayEquals(expectedResult, nums);
    }

    @Test
    void testSelectionSortWithDuplicateElements() {
        int[] nums = {1, 2, 5, 2, 4, 3, 5, 4, 1};
        int[] expectedResult = {1, 1, 2, 2, 3, 4, 4, 5, 5};

        SelectionSort.sort(nums);
        assertArrayEquals(expectedResult, nums);
    }

    @Test
    void testSelectionSortWithEmptyArray() {
        int[] nums = {};
        int[] expectedResult = {};

        SelectionSort.sort(nums);
        assertArrayEquals(expectedResult, nums);
    }
}
package com.github.mpalambonisi.sortingalgorithms.insertionsort;

import com.github.mpalambonisi.sortingalgorithms.bubblesort.BubbleSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    @Test
    void testInsertionSortWithUnSortedElements(){
        int[] nums = {7, 4, 2, 6, 5, 8, 1, 3};
        int[] expectedResult = {1, 2, 3, 4, 5, 6, 7, 8};

        InsertionSort.sort(nums);
        assertArrayEquals(expectedResult, nums);
    }

    @Test
    void testInsertionSortWithSortedElements(){
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expectedResult = {1, 2, 3, 4, 5, 6, 7, 8};

        InsertionSort.sort(nums);
        assertArrayEquals(expectedResult, nums);
    }

    @Test
    void testInsertionSortWithDuplicateElements(){
        int[] nums = {1, 2, 5, 2, 4, 3, 5, 4, 1};
        int[] expectedResult = {1, 1, 2, 2, 3, 4, 4, 5, 5};

        InsertionSort.sort(nums);
        assertArrayEquals(expectedResult, nums);
    }

    @Test
    void testInsertionSortWithSameElements(){
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};
        int[] expectedResult = {1, 1, 1, 1, 1, 1, 1, 1};

        InsertionSort.sort(nums);
        assertArrayEquals(expectedResult, nums);
    }

    @Test
    void testInsertionSortWithEmptyArray(){
        int[] nums = {};
        int[] expectedResult = {};

        InsertionSort.sort(nums);
        assertArrayEquals(expectedResult, nums);
    }

}
package com.github.mpalambonisi.datastructures.heap;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxHeapTest {

    @Test
    void insertTest() {
        MaxHeap maxHeap = new MaxHeap();
        maxHeap.insert(99);
        maxHeap.insert(72);
        maxHeap.insert(61);
        maxHeap.insert(58);

        List<Integer> expectResult = new ArrayList<>(Arrays.asList(99, 72, 61, 58));
        assertEquals(expectResult, maxHeap.getHeap());
    }

    @Test
    void removeTest() {
        MaxHeap maxHeap = new MaxHeap();
        maxHeap.insert(99);
        maxHeap.insert(72);
        maxHeap.insert(61);
        maxHeap.insert(58);
        maxHeap.insert(100);
        maxHeap.insert(75);

        // before removing 100 [root]
        List<Integer> expectResult01 = new ArrayList<>(Arrays.asList(100, 99, 75, 58, 72, 61));
        assertEquals(expectResult01, maxHeap.getHeap());

        maxHeap.remove();
        // after removing 100 [root]
        List<Integer> expectResult02 = new ArrayList<>(Arrays.asList(99, 72, 75, 58, 61));
        assertEquals(expectResult02, maxHeap.getHeap());
    }

    @Test
    void findKthSmallestTest01(){
        MaxHeap maxHeap = new MaxHeap();
        int[] nums = {7, 10, 4, 3, 20, 15};
        int k = 3;
        assertEquals(7, maxHeap.findKthSmallest(nums, k));
    }

    @Test
    void findKthSmallestTest02(){
        MaxHeap maxHeap = new MaxHeap();
        int[] nums = {2, 1, 3, 5, 6, 4};
        int k = 2;
        assertEquals(2, maxHeap.findKthSmallest(nums, k));
    }

    @Test
    void findKthSmallestTest03(){
        MaxHeap maxHeap = new MaxHeap();
        int[] nums = {9, 3, 2, 11, 7, 10, 4, 5};
        int k = 5;
        assertEquals(7, maxHeap.findKthSmallest(nums, k));
    }

    @Test
    void streamMaxTest01(){
        MaxHeap maxHeap = new MaxHeap();
        int[] nums = {1, 5, 2, 9, 3, 6, 8};

        List<Integer> expectedResult = new ArrayList<>(Arrays.asList(1, 5, 5, 9, 9, 9, 9));
        assertEquals(expectedResult, maxHeap.streamMax(nums));
    }

    @Test
    void streamMaxTest02(){
        MaxHeap maxHeap = new MaxHeap();
        int[] nums = {10, 2, 5, 1, 0, 11, 6};

        List<Integer> expectedResult = new ArrayList<>(Arrays.asList(10, 10, 10, 10, 10, 11, 11));
        assertEquals(expectedResult, maxHeap.streamMax(nums));
    }

    @Test
    void streamMaxForSameElementsTest(){
        MaxHeap maxHeap = new MaxHeap();
        int[] nums = {3, 3, 3, 3, 3};

        List<Integer> expectedResult = new ArrayList<>(Arrays.asList(3, 3, 3, 3, 3));
        assertEquals(expectedResult, maxHeap.streamMax(nums));
    }
}
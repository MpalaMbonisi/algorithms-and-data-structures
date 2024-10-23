package com.github.mpalambonisi.datastructures.heap;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MinHeapTest {

    @Test
    void insertTest() {
        MinHeap minHeap = new MinHeap();
        minHeap.insert(99);
        minHeap.insert(72);
        minHeap.insert(61);
        minHeap.insert(58);
        minHeap.insert(10);
        minHeap.insert(75);

        List<Integer> expectResult = new ArrayList<>(Arrays.asList(10, 58, 72, 99, 61, 75));
        assertEquals(expectResult, minHeap.getHeap());
    }

    @Test
    void removeTest() {
        MinHeap minHeap = new MinHeap();
        minHeap.insert(99);
        minHeap.insert(72);
        minHeap.insert(61);
        minHeap.insert(58);
        minHeap.insert(10);
        minHeap.insert(75);

        // before removing 10 [root]
        List<Integer> expectResult01 = new ArrayList<>(Arrays.asList(10, 58, 72, 99, 61, 75));
        assertEquals(expectResult01, minHeap.getHeap());

        minHeap.remove();
        // after removing 10 [root]
        List<Integer> expectResult02 = new ArrayList<>(Arrays.asList(58, 61, 72, 99, 75));
        assertEquals(expectResult02, minHeap.getHeap());
    }
}
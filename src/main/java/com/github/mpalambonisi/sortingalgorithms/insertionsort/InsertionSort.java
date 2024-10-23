package com.github.mpalambonisi.sortingalgorithms.insertionsort;
import com.github.mpalambonisi.datastructures.singlylinkedlist.LinkedList;

import java.util.Arrays;

/*
 * Insertion Sort Time Complexity:
 *
 * Best Case: O(n)
 * - This occurs when the array is already sorted.
 *
 * Average Case: O(n^2)
 * - In the average case, the elements are in random order.
 *
 * Worst Case: O(n^2)
 * - The worst case occurs when the array is sorted in reverse order.
 *
 * Space Complexity: O(1)
 * - Insertion sort is an in-place sorting algorithm, requiring only a constant amount of extra memory.
 */


public class
InsertionSort {
    public static void sort(int[] array){
        if (array.length == 0) return;
        for (int i=0; i<array.length;i++){
            int temp = array[i];
            int j = i - 1;
            while(j > -1 && temp < array[j]){
                array[j+1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }
}

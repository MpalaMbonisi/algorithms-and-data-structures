package com.github.mpalambonisi.sortingalgorithms.quicksort;

import java.util.Arrays;

public class QuickSort {

    private static int pivot(int[] array, int pivotIndex, int endIndex){
        int swapIndex = pivotIndex;
        for(int i = pivotIndex + 1; i <= endIndex; i++){
            if (array[i] < array[pivotIndex]){
                swapIndex++;
                // swap element at i index with element at swapIndex
                int temp = array[i];
                array[i] = array[swapIndex];
                array[swapIndex] = temp;
            }
        }
        // swap element at pivotIndex with element at swapIndex
        int temp = array[pivotIndex];
        array[pivotIndex] = array[swapIndex];
        array[swapIndex] = temp;

        return swapIndex;
    }
    private static void quickSortHelper(int[] array, int left, int right){
        if (left > right) return;
        int pivotIndex = pivot(array, left, right);
        quickSortHelper(array, left, pivotIndex - 1);
        quickSortHelper(array, pivotIndex + 1, right);
    }

    public static void sort(int[] array){
        if (array.length == 0) return;
        quickSortHelper(array, 0, array.length - 1);
    }
}

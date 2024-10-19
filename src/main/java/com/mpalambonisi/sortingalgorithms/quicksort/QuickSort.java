package com.mpalambonisi.sortingalgorithms.quicksort;

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

    private static void quickSort(int[] array){
        quickSortHelper(array, 0, array.length - 1);
    }
    public static void main(String[] args) {
        int[] myArray = {4,6,1,7,3,2,5};

        quickSort(myArray);

        System.out.println( Arrays.toString( myArray ) );
    }
}

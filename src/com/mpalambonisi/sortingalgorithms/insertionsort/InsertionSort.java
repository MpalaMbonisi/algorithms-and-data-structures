package com.mpalambonisi.sortingalgorithms.insertionsort;
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


public class InsertionSort {
    private static void insertionSort(int[] array){
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
    public static void main(String[] args) {
        int [] myArray = {4, 2, 6, 5, 1, 3};
        System.out.print("\nBefore insertion-sort : ");
        System.out.println(Arrays.toString(myArray));
        insertionSort(myArray);
        System.out.print("\nAfter insertion-sort  : ");
        System.out.println(Arrays.toString(myArray));
    }
}

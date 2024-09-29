package com.mpalambonisi.sortingalgorithms.selectionsort;
import java.util.Arrays;
/*
 * Selection Sort Time Complexity:
 *
 * Best Case: O(n^2)
 * - Even in the best case where the array is already sorted, selection sort still performs the same number of comparisons.
 *
 * Average Case: O(n^2)
 *
 * Worst Case: O(n^2)
 * - The worst case occurs when the array is sorted in reverse order, but
 *   it does not change the time complexity, as the number of comparisons remains the same in every case.
 *
 * Space Complexity: O(1)
 * - The selection sort is an in-place sorting algorithm, requiring only a constant amount of extra memory.
 */

public class SelectionSort {
    private static void selectionSort(int[] array){
        for(int i=0; i<array.length - 1;i++){
            int minIndex = i;
            for(int j=i + 1;j<array.length;j++){
                if(array[j] < array[minIndex]) minIndex = j;
            }
            if (i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int [] myArray = {4, 2, 6, 5, 1, 3};
        System.out.print("\nBefore selection-sort : ");
        System.out.println(Arrays.toString(myArray));
        selectionSort(myArray);
        System.out.print("\nAfter selection-sort  : ");
        System.out.println(Arrays.toString(myArray));
    }
}

package com.github.mpalambonisi.sortingalgorithms.mergesort;
import com.github.mpalambonisi.datastructures.singlylinkedlists.LinkedList;

import java.util.Arrays;

public class MergeSort {
    private static int[] merge(int[] array01, int[]array02){
        int[] combined = new int[array01.length + array02.length];
        int index = 0;
        int i=0;
        int j=0;

        while( i < array01.length && j < array02.length){
            if (array01[i] < array02[j]){
                combined[index] = array01[i];
                i++;
            }
            else{
                combined[index] = array02[j];
                j++;
            }
            index++;
        }
        while(i < array01.length){
            combined[index] = array01[i];
            i++;
            index++;
        }
        while (j < array02.length){
            combined[index] = array02[j];
            j++;
            index++;
        }
        return combined;
    }
    public static int[] mergeSort(int[] array){
        if (array.length == 1) return array; // base case for the recursion
        int midIndex = array.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));

        return merge(left, right);
    }
    public static void main(String[] args) {
        // implement Merge Sort algorithm
        System.out.println("\n-------------- merge sort algorithm demonstration --------------\n");
        int[] originalArray = {3,1,4,5,6,2};
        int [] sortedArray = mergeSort(originalArray);

        System.out.println( "Original Array: " + Arrays.toString( originalArray ) );

        System.out.println( "\nSorted Array: " + Arrays.toString( sortedArray ) );

        // implement merge method for two linked lists
        System.out.println("\n-------------- merge method for two linked-lists demonstration --------------\n");
        LinkedList l1 = new LinkedList(1);
        l1.append(3);
        l1.append(5);
        l1.append(7);

        LinkedList l2 = new LinkedList(2);
        l2.append(4);
        l2.append(6);
        l2.append(8);

        l1.merge(l2);

        l1.printAll();
    }

}

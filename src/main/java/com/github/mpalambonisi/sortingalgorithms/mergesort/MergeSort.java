package com.github.mpalambonisi.sortingalgorithms.mergesort;
import com.github.mpalambonisi.datastructures.singlylinkedlist.LinkedList;

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
    public static int[] sort(int[] array){
        if (array.length == 0) return new int[] {}; // for empty arrays
        if (array.length == 1) return array; // base case for the recursion
        int midIndex = array.length / 2;
        int[] left = sort(Arrays.copyOfRange(array, 0, midIndex));
        int[] right = sort(Arrays.copyOfRange(array, midIndex, array.length));

        return merge(left, right);
    }

}

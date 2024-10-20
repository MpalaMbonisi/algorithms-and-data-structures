package com.github.mpalambonisi.sortingalgorithms.bubblesort;
import com.github.mpalambonisi.datastructures.singlylinkedlist.LinkedList;

import java.util.Arrays;
/*
 * Bubble Sort Time Complexity:
 *
 * Best Case: O(n)
 * - This occurs when the array is already sorted.
 *
 * Average Case: O(n^2)
 * - This occurs when the elements are in random order.
 *
 * Worst Case: O(n^2)
 * - This occurs when the array is sorted in reverse order.
 *
 * Space Complexity: O(1)
 * - Bubble sort uses only a constant amount of additional memory, since it is an in-place sorting algorithm.
 */
public class BubbleSort {

    // array implementation
    private static void bubbleSort(int[] array){
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {

        // array demonstration
        System.out.println("\n -------- Array demonstration of BubbleSort -------- \n");
        int [] myArray = {4, 2, 6, 5, 1, 3};
        System.out.print("\nBefore bubble-sort : ");
        System.out.println(Arrays.toString(myArray));
        bubbleSort(myArray);
        System.out.print("\nAfter bubble-sort  : ");
        System.out.println(Arrays.toString(myArray));

        // linked-list demonstration
        System.out.println("\n -------- Linked-List demonstration of BubbleSort -------- \n");
        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.append(2);
        myLinkedList.append(6);
        myLinkedList.append(5);
        myLinkedList.append(1);
        myLinkedList.append(3);

        System.out.println("Unsorted Linked List : ");
        myLinkedList.printAll();
        myLinkedList.bubbleSort();
        System.out.println("\nSorted Linked List   : ");
        myLinkedList.printAll();
    }
}

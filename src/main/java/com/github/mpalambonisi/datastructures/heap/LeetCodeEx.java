package com.github.mpalambonisi.datastructures.heap;

import java.util.ArrayList;
import java.util.List;

public class LeetCodeEx {
    public static void main(String[] args) {
        // demonstration of findKthSmallest()
        System.out.println("\n---------- findKthSmallest() ---------- \n");
        // Test case 1
        int[] nums1 = {7, 10, 4, 3, 20, 15};
        int k1 = 3;
        System.out.println("Test case 1:");
        System.out.println("Expected output: 7");
        System.out.println("Actual output: " + findKthSmallest(nums1, k1));
        System.out.println();
        // Test case 2
        int[] nums2 = {2, 1, 3, 5, 6, 4};
        int k2 = 2;
        System.out.println("Test case 2:");
        System.out.println("Expected output: 2");
        System.out.println("Actual output: " + findKthSmallest(nums2, k2));
        System.out.println();

        // Test case 3
        int[] nums3 = {9, 3, 2, 11, 7, 10, 4, 5};
        int k3 = 5;
        System.out.println("Test case 3:");
        System.out.println("Expected output: 7");
        System.out.println("Actual output: " + findKthSmallest(nums3, k3));
        System.out.println();

        // demonstration of streamMax()
        System.out.println("\n---------- streamMax() ---------- \n");
        // Test case 1
        int[] nums01 = {1, 5, 2, 9, 3, 6, 8};
        System.out.println("Test case 1:");
        System.out.println("Input: [1, 5, 2, 9, 3, 6, 8]");
        System.out.println("Expected output: [1, 5, 5, 9, 9, 9, 9]");
        System.out.println("Actual output: " + streamMax(nums01));
        System.out.println();

        // Test case 2
        int[] nums02 = {10, 2, 5, 1, 0, 11, 6};
        System.out.println("Test case 2:");
        System.out.println("Input: [10, 2, 5, 1, 0, 11, 6]");
        System.out.println("Expected output: [10, 10, 10, 10, 10, 11, 11]");
        System.out.println("Actual output: " + streamMax(nums02));
        System.out.println();

        // Test case 3
        int[] nums03 = {3, 3, 3, 3, 3};
        System.out.println("Test case 3:");
        System.out.println("Input: [3, 3, 3, 3, 3]");
        System.out.println("Expected output: [3, 3, 3, 3, 3]");
        System.out.println("Actual output: " + streamMax(nums03));
        System.out.println();
    }
    /*
        *** The Kth Smallest Element in an Array
        * This method takes two parameters as input:
        *   an array of integers nums and an integer k.
        * The array nums can have both positive and negative integers and can be of any size.
        * The integer k is guaranteed to be in the range of 1 to the length of the array inclusive.
     */
    private static Integer findKthSmallest(int[] nums, int k){
        MaxHeap maxHeap = new MaxHeap();

        for (int num : nums) {
            maxHeap.insert(num);
            if (maxHeap.getHeap().size() > k){
                maxHeap.remove();
            }
        }
        return maxHeap.remove();
    }
    /*
        *** The Maximum Element in a Stream
        * Implement a function named streamMax that processes a stream of integers and returns the maximum number encountered so far for each input number.
        * This function should take in an array of integers and return a list of integers.
     */
    private static List<Integer> streamMax(int[] nums){
        MaxHeap maxHeap = new MaxHeap();
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            maxHeap.insert(num);
            list.add(maxHeap.getHeap().get(0));
        }
        return list;
    }
}

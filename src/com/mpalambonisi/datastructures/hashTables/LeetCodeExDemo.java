package com.mpalambonisi.datastructures.hashTables;

public class LeetCodeExDemo {
    public static void main(String[] args) {
        LeetCodeEx leetCodeEx = new LeetCodeEx();
        // itemInCommon() demonstration
        System.out.println("------------------- itemInCommon() ---------------------\n");
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 5};
        int[] array3 = {6, 7, 8};
        System.out.println(leetCodeEx.itemInCommon(array1, array2));
        System.out.println(leetCodeEx.itemInCommon(array2,array3));

        // findDuplicates() demonstration
        System.out.println("\n------------------- findDuplicates() ---------------------\n");
        int[] nums1 = {1, 2, 3, 2, 1, 4, 5, 4};
        int[] nums2 = {1, 2, 3, 4, 5};
        int[] nums3 = {3, 3, 3, 3, 3};
        int[] nums4 = {-1, 0, 1, 0, -1, -1, 2, 2};
        System.out.println("Duplicates found in nums1 : " + leetCodeEx.findDuplicates(nums1));;
        System.out.println("Duplicates found in nums2 : " + leetCodeEx.findDuplicates(nums2));;
        System.out.println("Duplicates found in nums3 : " + leetCodeEx.findDuplicates(nums3));;
        System.out.println("Duplicates found in nums4 : " + leetCodeEx.findDuplicates(nums4));;

    }
}

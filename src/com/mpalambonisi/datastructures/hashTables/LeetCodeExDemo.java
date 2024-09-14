package com.mpalambonisi.datastructures.hashTables;

import java.util.Arrays;
import java.util.List;

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

        // groupAnagrams() demonstration
        System.out.println("\n------------------- groupAnagrams() ---------------------\n");
        System.out.println("1st set:");
        System.out.println(leetCodeEx.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        System.out.println("\n2nd set:");
        System.out.println(leetCodeEx.groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

        System.out.println("\n3rd set:");
        System.out.println(leetCodeEx.groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));

        // twoSum() demonstration
        System.out.println("\n------------------- twoSum() ---------------------\n");
        System.out.println(Arrays.toString(leetCodeEx.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(leetCodeEx.twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(leetCodeEx.twoSum(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(leetCodeEx.twoSum(new int[]{1, 2, 3, 4, 5}, 10)));
        System.out.println(Arrays.toString(leetCodeEx.twoSum(new int[]{1, 2, 3, 4, 5}, 7)));
        System.out.println(Arrays.toString(leetCodeEx.twoSum(new int[]{1, 2, 3, 4, 5}, 3)));
        System.out.println(Arrays.toString(leetCodeEx.twoSum(new int[]{}, 0)));

        // subArraySum() implementation
        int[] array01 = {1, 2, 3, 4, 5};
        int target1 = 9;
        int[] result1 = leetCodeEx.subArraySum(array01, target1);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]");

        int[] array02 = {-1, 2, 3, -4, 5};
        int target2 = 0;
        int[] result2 = leetCodeEx.subArraySum(array02, target2);
        System.out.println("[" + result2[0] + ", " + result2[1] + "]");

        int[] array03 = {2, 3, 4, 5, 6};
        int target3 = 3;
        int[] result3 = leetCodeEx.subArraySum(array03, target3);
        System.out.println("[" + result3[0] + ", " + result3[1] + "]");

        int[] array04 = {};
        int target4 = 0;
        int[] result4 = leetCodeEx.subArraySum(array04, target4);
        System.out.println("[]");

        // removeDuplicates() implementation
        System.out.println("\n------------------- removeDuplicates() ---------------------\n");
        List<Integer> myList = List.of(1, 2, 3, 4, 1, 2, 5, 6, 7, 3, 4, 8, 9, 5);
        List<Integer> newList = leetCodeEx.removeDuplicates(myList);
        System.out.println(newList);

        // hasUniqueChars() implementation
        System.out.println("\n------------------- hasUniqueChars() ---------------------\n");
        System.out.println(leetCodeEx.hasUniqueChars("abcdefg")); // should return true
        System.out.println(leetCodeEx.hasUniqueChars("hello")); // should return false
        System.out.println(leetCodeEx.hasUniqueChars("")); // should return true
        System.out.println(leetCodeEx.hasUniqueChars("0123456789")); // should return true
        System.out.println(leetCodeEx.hasUniqueChars("abacadaeaf")); // should return false

        // findPairs() implementation
        System.out.println("\n------------------- findPairs() ---------------------\n");
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8, 10};
        int target = 7;

        List<int[]> pairs = leetCodeEx.findPairs(arr1, arr2, target);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }

        // longestConsecutiveSequence() implementation
        System.out.println("\n------------------- longestConsecutiveSequence() ---------------------\n");
        int[] seq01 = new int[] {1, 2, 3, 4, 5};
        int[] seq02 = new int[] {1, 3, 5, 7, 9};
        int[] seq03 = new int[] {1, 2, 2, 3, 4};
        int[] seq04 = new int[] {1, 0, -1, -2, -3};
        int[] seq05 = new int[] {1, 2, 3, 10, 11, 12, 13};
        int[] seq06 = new int[] {5, 1, 3, 4, 2};
        int[] seq07 = new int[] {1};
        int[] seq08 = new int[] {};
        int[] seq09 = new int[] {2, 2, 2, 2, 2};

        System.out.println("Longest Seq 1 : " + leetCodeEx.longestConsecutiveSequence(seq01));
        System.out.println("Longest Seq 2 : " + leetCodeEx.longestConsecutiveSequence(seq02));
        System.out.println("Longest Seq 3 : " + leetCodeEx.longestConsecutiveSequence(seq03));
        System.out.println("Longest Seq 4 : " + leetCodeEx.longestConsecutiveSequence(seq04));
        System.out.println("Longest Seq 5 : " + leetCodeEx.longestConsecutiveSequence(seq05));
        System.out.println("Longest Seq 6 : " + leetCodeEx.longestConsecutiveSequence(seq06));
        System.out.println("Longest Seq 7 : " + leetCodeEx.longestConsecutiveSequence(seq07));
        System.out.println("Longest Seq 8 : " + leetCodeEx.longestConsecutiveSequence(seq08));
        System.out.println("Longest Seq 9 : " + leetCodeEx.longestConsecutiveSequence(seq09));
    }
}

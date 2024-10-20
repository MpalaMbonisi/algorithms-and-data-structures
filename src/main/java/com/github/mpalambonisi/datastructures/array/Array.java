package com.github.mpalambonisi.datastructures.array;

public class Array {
    public static int removeElement(int[] array, int val){
        int i=0;
        for (int j=0; j < array.length; j++){
            if (array[j] != val){
                array[i] = array[j];
                i++;
            }
        }
        return i;
    }

    public static int[] findMaxMin(int[] myList){
        int min = myList[0];
        int max = myList[0];
        for (int z: myList) {
            if (z > max) max = z;
            else if (z < min) min = z;
        }
        return new int[] {max, min};
    }

    public static String findLongestString(String[] stringList){
        String longestString = "";
        for (String str: stringList) {
            if (str.length() > longestString.length()){
                longestString = str;
            }
        }
        return longestString;
    }

    public static int removeDuplicates(int[] nums){
        if (nums.length == 0) return 0;
        int i=0;
        for(int j=0; j < nums.length; j++){
            if (nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price: prices) {
            minPrice = Math.min(minPrice, price);
            int profit = price - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }

    public static void rotate (int[] nums, int k){
        k = k % nums.length;

        // Reverse the first part
        for (int start = 0, end = nums.length - k - 1; start < end; start++, end --){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
        // Reverse the second part
        for (int start = nums.length - k, end = nums.length - 1; start < end; start++, end--){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
        // Reverse the whole array
        for (int start=0, end = nums.length - 1; start < end; start++, end--){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
    }
    public static int maxSubarray(int[] nums){
        // Kadane's algorithm
        // Time Complexity - O(n)
        // Space Complexity - O(1)
        if (nums.length == 0) return 0;
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], nums[i] + currentSum);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}

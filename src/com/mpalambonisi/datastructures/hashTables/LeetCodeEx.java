package com.mpalambonisi.datastructures.hashTables;

import com.mpalambonisi.datastructures.singlyLinkedLists.LinkedListsDemo;

import java.util.*;

public class LeetCodeEx {

    // implementation of itemInCommon()
    public boolean itemInCommon(int[] array1, int[] array2){
        // big(0) of this method should be 0(n)
        // using a HashMap instead of a HashTable, but they are basically the same

        HashMap<Integer,Boolean> myHashMap = new HashMap<>();
        for (int z: array1) {
            myHashMap.put(z, true);
        }
        for(int y: array2){
            if (myHashMap.containsKey(y)) return true;
        }
        return false;
    }

    // implementation of findDuplicates
    public ArrayList<Integer> findDuplicates(int[] nums){
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();
        ArrayList<Integer> myList = new ArrayList<>();
        for (int n : nums) {
            if(myHashMap.put(n,true)!=null && !myList.contains(n)) myList.add(n);
        }
        return myList;
    }

    // implementation of groupAnagrams()
    // An anagram is a word or phrase formed by rearranging the letters of a different word or phrase
    // typically using all the original letters exactly once.
    public List<List<String>> groupAnagrams(String[] inputString){

        HashMap<String, List<String>> myHashMap = new HashMap<>();

        for (String s: inputString) {
            // sort the string
            char[] chars = s.toCharArray();
            Arrays.sort(chars); // sorted alphabetically
            // sortedString is in the canonical form of the String,
            // meaning all anagrams will have the same 'sortedString'
            String sortedString = new String(chars);

            // checking for anagrams
            if (myHashMap.containsKey(sortedString)){
                myHashMap.get(sortedString).add(s); // .add adds the anagram to the list
            }
            else { // handling new anagrams
                List<String> group = new ArrayList<>();
                group.add(s);
                myHashMap.put(sortedString, group);
            }
        }
        return new ArrayList<>(myHashMap.values());
    }

    // twoSum() implementation
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int i=0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)){
                return new int[] {numMap.get(complement), i};
            }
            else {
                numMap.put(nums[i], i);
            }
        }
        return new int[0];
    }
    /*
     *** Subarray Sum
     * This challenge requires writing a method named `subarraySum` that takes an array of integers `nums`
     * and an integer `target`.The goal is to find the starting and ending indices of a contiguous subarray
     * within `nums` that adds up to the given `target` sum.
     */
    public int[] subArraySum(int[] nums, int target){
        HashMap<Integer, Integer> sumIndex = new HashMap<>(); // key -> total sum value -> index
        sumIndex.put(0,-1);
        int currentSum = 0;
        for(int i=0; i<nums.length;i++){
            currentSum += nums[i];
            if (sumIndex.containsKey(currentSum - target)){
                int firstIndex = currentSum - target;
                firstIndex++;
                return new int[] {firstIndex, i};
            }
            else{
                sumIndex.put(currentSum,i);
            }
        }
        return new int[]{,};
    }

}

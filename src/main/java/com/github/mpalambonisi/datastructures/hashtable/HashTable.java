package com.github.mpalambonisi.datastructures.hashtable;

import java.util.*;

public class HashTable {
    int size = 7; // it's best practice to keep this number a prime number
    Node[] dataMap;
    class Node{
        String key;
        int value;
        Node next; // this is for handling collisions via chaining { linked lists }

        Node(String key, int value){
            this.key = key;
            this.value = value;
        }
    }
    public HashTable(){
        dataMap = new Node[size];
    }

    public Node[] getDataMap() {
        return dataMap;
    }

    // hash function
    private int hash(String key){
        // this method will always give you the same result for the same key
        int hash = 0;
        char[] keyChars= key.toCharArray();
        for (int asciiValue : keyChars) {
            hash = (hash + asciiValue * 23) % dataMap.length; // any prime number can be used
        }
        return hash;
    }
    // implementing set()
    public void set(String key, int value){
        int index = hash(key);
        Node newNode = new Node(key, value);
        if (dataMap[index] == null) dataMap[index] = newNode;
        else{
            Node temp = dataMap[index];
            while(temp!=null){
                if (temp.key.equals(newNode.key)){
                    temp.value = newNode.value;
                }
                if (!temp.key.equals(newNode.key) && temp.next == null){
                    temp.next = newNode;
                }
                temp = temp.next;
            }

        }
    }

    // implementing get()
    public int get(String key){
        int index = hash(key);
        Node temp = dataMap[index];
        while (temp!=null){
            if(temp.key.equals(key)) return temp.value;
            else temp = temp.next;
        }
        return 0;

    }

    // implementing keys()
    public ArrayList<String> keys(){
        ArrayList<String> myList = new ArrayList<>();
        for (Node n: dataMap) {
            if (n == null) continue;
            myList.add(n.key);
            while(n.next != null){
                n = n.next;
                myList.add(n.key);
            }
        }
        return  myList;
    }

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
        if(nums.length < 2) return new int[0];
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
     * This challenge requires writing a method named `subarraySum`
     * that takes an array of integers `nums` and an integer `target`.
     * The goal is to find the starting and ending indices of a contiguous subarray
     * within `nums` that adds up to the given `target` sum.
     */
    public int[] subArraySum(int[] nums, int target){
        HashMap<Integer, Integer> sumIndex = new HashMap<>(); // { key -> total sum, value -> index }
        sumIndex.put(0,-1);
        int currentSum = 0;
        for(int i=0; i<nums.length;i++){
            currentSum += nums[i];
            if (sumIndex.containsKey(currentSum - target)){
                int firstIndex = sumIndex.get(currentSum - target) + 1;
                return new int[] {firstIndex, i};
            }
            else{
                sumIndex.put(currentSum,i);
            }
        }
        return new int[]{,};
    }

    /*
     *** Remove Duplicates
     * You are given a list of integers, myList, where some elements may be repeated.
     * Your task is
     * to write a Java method that removes all duplicate elements from the list
     * and returns a new list containing only the unique elements.
     */
    public List<Integer> removeDuplicates(List<Integer> myList){
        Set<Integer> uniqueSet = new HashSet<>(myList);
        return new ArrayList<>(uniqueSet);
    }

    /*
     *** hasUniqueChars
     * Write a Java program to determine if a given string contains all unique characters or not.
     */
    public boolean hasUniqueChars (String string){
        char[] charArray = string.toCharArray();
        Set<Character> charSet = new HashSet<>();
        for (char c:charArray) {
            if (charSet.contains(c)){
                return false;
            }
            charSet.add(c);
        }
        return true;
    }

    /*
     *** findPairs()
     * Given two integer arrays arr1 and arr2, and an integer target,
     * write a method named findPairs
     * that finds all pairs of integers such that one integer is from arr1,
     * the other is from arr2, and their sum equals the target value.
     */
    public List<int[]> findPairs(int[] arr1, int[] arr2, int target){
        List<int[]> pairs = new ArrayList<>();
        Set<Integer> set4Arr1 = new HashSet<>();
        for (int num : arr1) {
            set4Arr1.add(num);
        }
        for (int num: arr2) {
            int diff = target - num;
            if (set4Arr1.contains(diff)) pairs.add(new int[] {diff, num});
        }
        return pairs;
    }

    /*
     *** longestConsecutiveSequence
     * Given an unsorted array of integers,
     *  write a function that finds the length of the longestConsecutiveSequence
     * (i.e., a sequence of integers in which each element is one greater than the previous element).
     */
    public int longestConsecutiveSequence(int [] nums){
        if (nums.length == 0) return 0;
        int diff = 0; // common difference
        int prevNum = 0; // previous number
        int counter = 0;
        Set<Integer> countersSet = new HashSet<>();

        for (int i=0; i < nums.length; i++){
            if (i==0) {
                prevNum = nums[i];
                counter = 1;
                continue;
            }
            if(nums[i] == prevNum) continue;
            if (diff != (nums[i] - prevNum) && counter > 1){
                countersSet.add(counter);
                counter = 0;
            }
            diff = nums[i] - prevNum;
            prevNum = nums[i];
            counter++;
        }
        countersSet.add(counter);

        // check return largest counter
        int largestCounter=0;
        for (Integer c : countersSet) {
            if( c > largestCounter) largestCounter = c;
        }
        return largestCounter;
    }
}

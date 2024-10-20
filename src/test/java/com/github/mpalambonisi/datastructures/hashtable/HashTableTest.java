package com.github.mpalambonisi.datastructures.hashtable;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HashTableTest {

    @Test
    void getFirstKeyTest() {
        HashTable hashTable = new HashTable();
        hashTable.set("nails", 100);
        hashTable.set("tiles", 50);
        hashTable.set("lumber", 80);
        hashTable.set("bolts", 200);
        hashTable.set("screws", 140);

        assertEquals(100, hashTable.get("nails"));
    }
    @Test
    void getMiddleKeyTest() {
        HashTable hashTable = new HashTable();
        hashTable.set("nails", 100);
        hashTable.set("tiles", 50);
        hashTable.set("lumber", 80);
        hashTable.set("bolts", 200);
        hashTable.set("screws", 140);

        assertEquals(80, hashTable.get("lumber"));
    }
    @Test
    void getLastKeyTest() {
        HashTable hashTable = new HashTable();
        hashTable.set("nails", 100);
        hashTable.set("tiles", 50);
        hashTable.set("lumber", 80);
        hashTable.set("bolts", 200);
        hashTable.set("screws", 140);

        assertEquals(140, hashTable.get("screws"));
    }

    @Test
    void getNonExistingKeyTest() {
        HashTable hashTable = new HashTable();
        hashTable.set("nails", 100);
        hashTable.set("tiles", 50);
        hashTable.set("lumber", 80);
        hashTable.set("bolts", 200);
        hashTable.set("screws", 140);

        assertEquals(0, hashTable.get("hammers"));
    }

    @Test
    void keysTest() {
        HashTable hashTable = new HashTable();
        hashTable.set("nails", 100);
        hashTable.set("tiles", 50);
        hashTable.set("lumber", 80);
        hashTable.set("bolts", 200);
        hashTable.set("screws", 140);

        assertEquals(new ArrayList<>(Arrays.asList("screws", "bolts", "tiles", "nails", "lumber")), hashTable.keys());
    }

    @Test
    void itemInCommonTest(){
        HashTable hashTable = new HashTable();
        int[] array01 = {1, 3, 5};
        int[] array02 = {2, 4, 5};

        assertTrue(hashTable.itemInCommon(array01, array02));
    }

    @Test
    void itemNotInCommonTest(){
        HashTable hashTable = new HashTable();
        int[] array01 = {6, 7, 8};
        int[] array02 = {2, 4, 5};

        assertFalse(hashTable.itemInCommon(array01, array02));
    }

    @Test
    void findDuplicatesWithDuplicates(){
        HashTable hashTable = new HashTable();
        int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};

        assertEquals(new ArrayList<Integer>(Arrays.asList(2, 1, 4)), hashTable.findDuplicates(nums));
    }

    @Test
    void findDuplicatesWithNoDuplicates(){
        HashTable hashTable = new HashTable();
        int[] nums = {1, 2, 3, 4, 5};

        assertEquals(new ArrayList<Integer>(), hashTable.findDuplicates(nums));
    }

    @Test
    void findDuplicatesWithSameNumbers(){
        HashTable hashTable = new HashTable();
        int[] nums = {3, 3, 3, 3, 3};

        assertEquals(new ArrayList<Integer>(List.of(3)), hashTable.findDuplicates(nums));
    }

    @Test
    void findDuplicatesWithNegativeNumbers(){
        HashTable hashTable = new HashTable();
        int[] nums = {-1, 0, 1, 0, -1, -1, 2, 2};

        assertEquals(new ArrayList<Integer>(Arrays.asList(0, -1, 2)), hashTable.findDuplicates(nums));
    }

    @Test
    void groupAnagramsTest01(){
        HashTable hashTable = new HashTable();
        String[] list = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> expectedList = new ArrayList<>();
        expectedList.add(new ArrayList<>(Arrays.asList("eat", "tea", "ate")));
        expectedList.add(new ArrayList<>(List.of("bat")));
        expectedList.add(new ArrayList<>(Arrays.asList("tan", "nat")));

        assertEquals(expectedList, hashTable.groupAnagrams(list));
    }

    @Test
    void groupAnagramsTest02(){
        HashTable hashTable = new HashTable();
        String[] list = new String[]{"abc", "cba", "bac", "foo", "bar"};

        List<List<String>> expectedList = new ArrayList<>();
        expectedList.add(new ArrayList<>(List.of("bar")));
        expectedList.add(new ArrayList<>(Arrays.asList("abc", "cba", "bac")));
        expectedList.add(new ArrayList<>(List.of("foo")));

        assertEquals(expectedList, hashTable.groupAnagrams(list));
    }

    @Test
    void groupAnagramsTest03(){
        HashTable hashTable = new HashTable();
        String[] list = new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"};

        List<List<String>> expectedList = new ArrayList<>();
        expectedList.add(new ArrayList<>(Arrays.asList("listen", "silent")));
        expectedList.add(new ArrayList<>(Arrays.asList("triangle", "integral")));
        expectedList.add(new ArrayList<>(Arrays.asList("garden", "ranged")));


        assertEquals(expectedList, hashTable.groupAnagrams(list));
    }

    @Test
    void twoSumWithoutSumTest(){
        HashTable hashTable = new HashTable();
        int[] actualResult = hashTable.twoSum(new int[]{1, 2, 3, 4, 5}, 10);

        assertArrayEquals(new int[] {}, actualResult);
    }
    @Test
    void twoSumWithSameListTest(){
        HashTable hashTable = new HashTable();
        int[] actualResult = hashTable.twoSum(new int[]{3, 3, 3}, 6);

        assertArrayEquals(new int[] {0, 1}, actualResult);
    }

    @Test
    void twoSumTest01(){
        HashTable hashTable = new HashTable();
        int[] actualResult = hashTable.twoSum(new int[]{1, 2, 3, 4, 5}, 7);

        assertArrayEquals(new int[] {2, 3}, actualResult);
    }

    @Test
    void twoSumTest02(){
        HashTable hashTable = new HashTable();
        int[] actualResult = hashTable.twoSum(new int[]{1, 2, 3, 4, 5}, 3);

        assertArrayEquals(new int[] {0, 1}, actualResult);
    }

    @Test
    void twoSumWithEmptyArrayTest(){
        HashTable hashTable = new HashTable();
        int[] actualResult = hashTable.twoSum(new int[]{}, 0);

        assertArrayEquals(new int[] {}, actualResult);
    }

    @Test
    void twoSumWithOneElement(){
        HashTable hashTable = new HashTable();
        int[] actualResult = hashTable.twoSum(new int[]{3}, 3);

        assertArrayEquals(new int[] {}, actualResult);
    }

    @Test
    void subArraySumTest01(){
        HashTable hashTable = new HashTable();
        int[] array = {1, 2, 3, 4, 5};
        int target = 9;
        int[] actualResult = hashTable.subArraySum(array, target);

        assertArrayEquals(new int[] {1, 3}, actualResult);
    }

    @Test
    void subArraySumTest(){
        HashTable hashTable = new HashTable();
        int[] array = {1, 2, 3, 4, 5};
        int target = 9;
        int[] actualResult = hashTable.subArraySum(array, target);

        assertArrayEquals(new int[] {1, 3}, actualResult);
    }

    @Test
    void subArraySumWithZeroAsTarget(){
        HashTable hashTable = new HashTable();
        int[] array = {-1, 2, 3, -4, 5};
        int target = 0;
        int[] actualResult = hashTable.subArraySum(array, target);

        assertArrayEquals(new int[] {0, 3}, actualResult);
    }

    @Test
    void subArraySumWithNegativeNumbers(){
        HashTable hashTable = new HashTable();
        int[] array = {2, 3, 4, 5, 6};
        int target = 3;
        int[] actualResult = hashTable.subArraySum(array, target);

        assertArrayEquals(new int[] {1, 1}, actualResult);
    }

    @Test
    void subArraySumWithEmptyArray(){
        HashTable hashTable = new HashTable();
        int[] array = {};
        int target = 0;
        int[] actualResult = hashTable.subArraySum(array, target);

        assertArrayEquals(new int[] {}, actualResult);
    }

    @Test
    void removeDuplicatesTest(){
        HashTable hashTable = new HashTable();
        List<Integer> list = List.of(1, 2, 3, 4, 1, 2, 5, 6, 7, 3, 4, 8, 9, 5);
        List<Integer> expectResult = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> actualResult = hashTable.removeDuplicates(list);

        assertEquals(expectResult, actualResult);
    }

    @Test
    void hasUniqueCharsWithDuplicates(){
        HashTable hashTable = new HashTable();
        assertFalse(hashTable.hasUniqueChars("abacadaeaf"));
    }

    @Test
    void hasUniqueCharsWithUniqueChar(){
        HashTable hashTable = new HashTable();
        assertTrue(hashTable.hasUniqueChars("abcdefg"));
    }

    @Test
    void hasUniqueCharsEmptyString(){
        HashTable hashTable = new HashTable();
        assertTrue(hashTable.hasUniqueChars(""));
    }

    @Test
    void hasUniqueCharsWithUniqueNumbers(){
        HashTable hashTable = new HashTable();
        assertTrue(hashTable.hasUniqueChars("0123456789"));
    }

    @Test
    void findPairsTest(){
        HashTable hashTable = new HashTable();
        int[] arr01 = {1, 2, 3, 4, 5};
        int[] arr02 = {2, 4, 6, 8, 10};
        int target = 7;

        List<int[]> actualResult = hashTable.findPairs(arr01, arr02, target);

        assertArrayEquals(new int[] {5,2}, actualResult.get(0));
        assertArrayEquals(new int[] {3,4}, actualResult.get(1));
        assertArrayEquals(new int[] {1,6}, actualResult.get(2));

    }

    @Test
    void longestConsSeqTest01(){
        HashTable hashTable = new HashTable();
        int[] seq = new int[] {1, 2, 3, 4, 5};

        assertEquals(5, hashTable.longestConsecutiveSequence(seq));
    }

    @Test
    void longestConsSeqTest02(){
        HashTable hashTable = new HashTable();
        int[] seq = new int[] {1, 2, 3, 10, 11, 12, 13};

        assertEquals(4, hashTable.longestConsecutiveSequence(seq));
    }

    @Test
    void longestConsSeqTest03(){
        HashTable hashTable = new HashTable();
        int[] seq = new int[] {1, 3, 5, 7, 9};

        assertEquals(5, hashTable.longestConsecutiveSequence(seq));
    }

    @Test
    void longestConsSeqOnEmptyArray(){
        HashTable hashTable = new HashTable();
        int[] seq = new int[] {};

        assertEquals(0, hashTable.longestConsecutiveSequence(seq));
    }

    @Test
    void longestConsSeqOnOneElement(){
        HashTable hashTable = new HashTable();
        int[] seq = new int[] {10};

        assertEquals(1, hashTable.longestConsecutiveSequence(seq));
    }

    @Test
    void longestConsSeqOnDuplicates(){
        HashTable hashTable = new HashTable();
        int[] seq = new int[] {2, 2, 2, 2, 2};

        assertEquals(1, hashTable.longestConsecutiveSequence(seq));
    }
}
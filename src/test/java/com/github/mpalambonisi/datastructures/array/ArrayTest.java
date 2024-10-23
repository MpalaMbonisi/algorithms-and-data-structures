package com.github.mpalambonisi.datastructures.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {

    @Test
    void removeElementRandomNumbersTest() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(7, Array.removeElement(nums, 1));
    }

    @Test
    void removeElementSortedNumbersTest() {
        int[] nums = {1, 2, 3, 4, 5, 6};
        assertEquals(5, Array.removeElement(nums, 6));
    }

    @Test
    void removeElementNegativeNumbersTest() {
        int[] nums = {-1, -2, -3, -4, -5};
        assertEquals(4, Array.removeElement(nums, -3));
    }

    @Test
    void removeElementEmptyArrayTest() {
        int[] nums = {};
        assertEquals(0, Array.removeElement(nums, 4));
    }

    @Test
    void removeElementDuplicateNumbersTest() {
        int[] nums = {1, 1, 1, 1, 1};
        assertEquals(0, Array.removeElement(nums, 1));
    }
    @Test
    void findMaxMinRandomNumbersTest() {
        int[] nums = {5, 3, 8, 1, 6, 9};
        int[] actualResult = Array.findMaxMin(nums);
        assertArrayEquals(new int[] {9,1}, actualResult);
    }

    @Test
    void findMaxMinNegativeNumbersTest() {
        int[] nums = {-5, -3, -8, -1, -6, -9};
        int[] actualResult = Array.findMaxMin(nums);
        assertArrayEquals(new int[] {-1,-9}, actualResult);
    }
    @Test
    void findMaxMinDuplicateZerosTest() {
        int[] nums = {0, 0, 0, 0, 0};
        int[] actualResult = Array.findMaxMin(nums);
        assertArrayEquals(new int[] {0, 0}, actualResult);
    }

    @Test
    void findMaxMinSortedNumbersTest() {
        int[] nums = {100, 200, 300, 400, 500};
        int[] actualResult = Array.findMaxMin(nums);
        assertArrayEquals(new int[] {500, 100}, actualResult);
    }
    @Test
    void findLongestStringTest01() {
        String[] stringList = {"apple", "banana", "kiwi", "pear"};
        assertEquals("banana", Array.findLongestString(stringList));
    }
    @Test
    void findLongestStringTest02() {
        String[] stringList = {"cat", "giraffe", "elephant", "hippopotamus"};
        assertEquals("hippopotamus", Array.findLongestString(stringList));
    }
    @Test
    void findLongestStringTest03() {
        String[] stringList = {"sun", "moon", "planet", "universe"};
        assertEquals("universe", Array.findLongestString(stringList));
    }
    @Test
    void findLongestStringTest04() {
        String[] stringList = {"java", "python", "javascript", "c"};
        assertEquals("javascript", Array.findLongestString(stringList));
    }
    @Test
    void findLongestStringTest05() {
        String[] stringList = {"", "a", "aa", "aaa"};
        assertEquals("aaa", Array.findLongestString(stringList));
    }

    @Test
    void removeDuplicatesTest01() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        assertEquals(5, Array.removeDuplicates(nums));
    }

    @Test
    void removeDuplicatesTest02() {
        int[] nums = {1, 1, 2};
        assertEquals(2, Array.removeDuplicates(nums));
    }
    @Test
    void removeDuplicatesTest03() {
        int[] nums = {-1, 0, 0, 0, 3, 3};
        assertEquals(3, Array.removeDuplicates(nums));
    }
    @Test
    void removeDuplicatesTest04() {
        int[] nums = {};
        assertEquals(0, Array.removeDuplicates(nums));
    }
    @Test
    void removeDuplicatesTest05() {
        int[] nums = {1, 1, 1, 1, 1};
        assertEquals(1, Array.removeDuplicates(nums));
    }

    @Test
    void maxProfitTest01() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        assertEquals(5, Array.maxProfit(prices));
    }
    @Test
    void maxProfitTest02() {
        int[] prices = {7, 6, 5, 4, 3, 2, 1};
        assertEquals(0, Array.maxProfit(prices));
    }
    @Test
    void maxProfitSortedPricesTest03() {
        int[] prices = {1, 2, 3, 4, 5, 6, 7};
        assertEquals(6, Array.maxProfit(prices));
    }
    @Test
    void maxProfitTest04() {
        int[] prices = {3, 2, 6, 5, 0, 3};
        assertEquals(4, Array.maxProfit(prices));
    }
    @Test
    void maxProfitTest05() {
        int[] prices = {2, 4, 1};
        assertEquals(2, Array.maxProfit(prices));
    }

    @Test
    void rotateSortedNumbersTest() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] expectedResult = {5, 6, 7, 1, 2, 3, 4};
        Array.rotate(nums, k);

        assertArrayEquals(expectedResult, nums);
    }
    @Test
    void rotateRandomNumbersTest() {
        int[] nums = {-1, -100, 3, 99};
        int k = 2;
        int[] expectedResult = {3, 99, -1, -100};
        Array.rotate(nums, k);

        assertArrayEquals(expectedResult, nums);
    }

    @Test
    void rotateTwoElementsTest() {
        int[] nums = {1, 2};
        int k = 3;
        int[] expectedResult = {2,1};
        Array.rotate(nums, k);

        assertArrayEquals(expectedResult, nums);
    }

    @Test
    void rotateOneElementsTest() {
        int[] nums = {1};
        int k = 0;
        int[] expectedResult = {1};
        Array.rotate(nums, k);

        assertArrayEquals(expectedResult, nums);
    }

    @Test
    void rotateLastIndexNumberTest() {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int k = 6;
        int[] expectedResult = {1, 2, 3, 4, 5, 6};
        Array.rotate(nums, k);

        assertArrayEquals(expectedResult, nums);
    }

    @Test
    void maxSubarrayPositiveAndNegativeNumbers() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, Array.maxSubarray(nums));
    }

    @Test
    void maxSubarrayNegativeNumberInMiddle() {
        int[] nums = {1, 2, 3, -4, 5, 6};
        assertEquals(13, Array.maxSubarray(nums));
    }

    @Test
    void maxSubarrayAllNegativeNumbers() {
        int[] nums = {-1, -2, -3, -4, -5};
        assertEquals(-1, Array.maxSubarray(nums));
    }

    @Test
    void maxSubarrayAllPositiveNumbers() {
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(15, Array.maxSubarray(nums));
    }
    @Test
    void maxSubarrayAlternatingPositiveNegativeNumbers() {
        int[] nums = {1, -1, 1, -1, 1};
        assertEquals(1, Array.maxSubarray(nums));
    }
}
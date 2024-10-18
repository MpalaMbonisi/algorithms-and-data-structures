package com.mpalambonisi.datastructures.arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        ArrayTest arrayTesting = new ArrayTest();

        System.out.println("\n--------- Remove Element Test ---------\n");
        arrayTesting.testRemoveElement();

        System.out.println("\n--------- Find Max Min Test ---------\n");
        arrayTesting.findMaxMinTest();

        System.out.println("\n--------- Find Longest String Test ---------\n");
        arrayTesting.findLongestStringTest();

        System.out.println("\n--------- Remove Duplicates Test ---------\n");
        arrayTesting.removeDuplicatesTest();

        System.out.println("\n--------- Max Profit Test ---------\n");
        arrayTesting.maxProfitTest();

        System.out.println("\n--------- Rotate Test ---------\n");
        arrayTesting.rotateTest();

        System.out.println("\n--------- Max Sub Array Test ---------\n");
        arrayTesting.maxSubArrayTest();
    }
}

package com.github.mpalambonisi.datastructures.heaps;

public class MaxHeapDemo {
    public static void main(String[] args) {
        System.out.println("\n --------------- create a heap --------------\n");
        MaxHeap myMaxHeap = new MaxHeap();
        myMaxHeap.printHeap();

        // insert() demonstration
        System.out.println("\n --------------- insert() demo --------------\n");
        myMaxHeap.insert(99);
        myMaxHeap.insert(72);
        myMaxHeap.insert(61);
        myMaxHeap.insert(58);
        myMaxHeap.printHeap();

        System.out.println("Insert 10 to heap...");
        myMaxHeap.insert(100);
        System.out.println("Insert 75 to heap...");
        myMaxHeap.insert(75);

        myMaxHeap.printHeap();

        // remove() demonstration
        System.out.println("\n --------------- remove() demo --------------\n");
        System.out.println("Before : ");
        myMaxHeap.printHeap();
        System.out.println("\nAfter 100 is removed : ");
        myMaxHeap.remove();
        myMaxHeap.printHeap();
    }
}

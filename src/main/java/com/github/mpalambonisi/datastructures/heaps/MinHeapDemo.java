package com.github.mpalambonisi.datastructures.heaps;

public class MinHeapDemo {
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();
        // insert demonstration
        System.out.println("\n ------------ insert() demo ------------ \n");
        minHeap.insert(99);
        minHeap.insert(72);
        minHeap.insert(61);
        minHeap.insert(58);
        minHeap.insert(10);
        minHeap.insert(75);
        minHeap.printHeap();

        // remove demonstration
        System.out.println("\n ------------ remove() demo ------------ \n");
        System.out.println("Before : ");
        minHeap.printHeap();
        minHeap.remove();
        System.out.println("After : ");
        minHeap.printHeap();
    }
}

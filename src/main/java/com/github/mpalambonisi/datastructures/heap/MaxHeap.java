package com.github.mpalambonisi.datastructures.heap;

import java.util.ArrayList;
import java.util.List;

public class MaxHeap extends Heap{
    public MaxHeap(){
        heap = new ArrayList<>();
    }
    // insert() implementation
    public void insert(int value){
        heap.add(value);
        int current = heap.size() - 1; // starts from index of the added element
        while(heap.get(current) > heap.get(parent(current)) && current > 0){
            swap(current, parent(current));
            current = parent(current);
        }
    }

    // remove() implementation
    public Integer remove(){
        if (heap.isEmpty()) return null;
        if (heap.size() == 1) return heap.remove(0);
        int maxValue = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));
        sinkDown(0);
        return maxValue;
    }

    private void sinkDown(int index){
        int maxIndex = index;

        while(true){
            int leftChild = leftChild(index);
            int rightChild = rightChild(index);

            if (leftChild < heap.size() && heap.get(leftChild) > heap.get(maxIndex)) maxIndex = leftChild;
            if (rightChild < heap.size() && heap.get(rightChild) > heap.get(maxIndex)) maxIndex = rightChild;
            if (index != maxIndex) {
                swap(index, maxIndex);
                index = maxIndex;
            }
            else return;
        }
    }
    /*
     *** The Kth Smallest Element in an Array
     * This method takes two parameters as input:
     *   an array of integers nums and an integer k.
     * The array nums can have both positive and negative integers and can be of any size.
     * The integer k is guaranteed to be in the range of 1 to the length of the array inclusive.
     */
    public Integer findKthSmallest(int[] nums, int k){
        for (int num : nums) {
            insert(num);
            if (getHeap().size() > k){
                remove();
            }
        }
        return remove();
    }
    /*
     *** The Maximum Element in a Stream
     * Implement a function named streamMax that processes a stream of integers and returns the maximum number encountered so far for each input number.
     * This function should take in an array of integers and return a list of integers.
     */
    public List<Integer> streamMax(int[] nums){
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            insert(num);
            list.add(getHeap().get(0));
        }
        return list;
    }
}

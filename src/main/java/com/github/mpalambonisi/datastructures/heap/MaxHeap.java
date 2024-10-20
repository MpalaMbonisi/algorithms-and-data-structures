package com.github.mpalambonisi.datastructures.heap;

import java.util.ArrayList;

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
}

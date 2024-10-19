package com.github.mpalambonisi.datastructures.heaps;

import java.util.ArrayList;

public class MinHeap extends Heap{
    public MinHeap(){
        heap = new ArrayList<>();
    }
    // insert() implementation
    public void insert(int value){
        heap.add(value);
        int currentIndex= heap.size() - 1;
        while(heap.get(currentIndex) < heap.get(parent(currentIndex)) && currentIndex > 0){
            swap(currentIndex, parent(currentIndex));
            currentIndex = parent(currentIndex);
        }
    }
    // remove() implementation
    public Integer remove(){
        if(heap.isEmpty()) return null;
        if(heap.size() == 1) return heap.remove(0);
        else{
            int minValue = heap.get(0);
            heap.set(0,heap.remove(heap.size()-1));
            sinkDown(0);
            return minValue;
        }
    }
    private void sinkDown(int index){
        int minIndex = index;

        while(true){
            int leftChild = leftChild(index);
            int rightChild = rightChild(index);
            if (leftChild < heap.size() && heap.get(leftChild) < heap.get(minIndex)) minIndex = leftChild;
            if (rightChild < heap.size() && heap.get(rightChild) < heap.get(minIndex)) minIndex = rightChild;
            if (index != minIndex){
                swap(index, minIndex);
                index = minIndex;
            }else return;
        }
    }
}

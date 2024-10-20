package com.github.mpalambonisi.datastructures.heap;

import java.util.List;

public abstract class Heap {
    protected static List<Integer> heap;

    public List<Integer> getHeap() {
        return heap;
    }

    public abstract void insert(int value);
    public abstract Integer remove();
    public void printHeap(){
        System.out.println("Heap : " + heap);
    }
    protected static int leftChild(int index){
        return 2 * index + 1;
    }
    protected int rightChild(int index){
        return 2 * index + 2;
    }
    protected int parent(int index){
        return (index - 1) / 2;
    }
    protected void swap(int index01, int index02){
        int temp = heap.get(index01);
        heap.set(index01, heap.get(index02));
        heap.set(index02, temp);
    }
}

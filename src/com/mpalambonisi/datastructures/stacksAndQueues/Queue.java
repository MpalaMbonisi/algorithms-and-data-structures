package com.mpalambonisi.datastructures.stacksAndQueues;

public class Queue {
    private Node first;
    private Node last;
    private int length;
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    public Queue(int value){
        Node newNode = new Node(value);
        first = last = newNode;
        length=1;
    }

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    public int getLength() {
        return length;
    }

    // implement enqueue()
    public void enqueue(int value){
        Node newNode = new Node(value);
        if(length == 0) first = last = newNode;
        else if (length > 0){
            last.next = newNode;
            last = newNode;
        }
        length++;
    }
    // implement dequeue
    public Node dequeue(){
        if(length ==0) return null;
        Node dequeNode = first;
        if(length ==1) first = last = null;
        else if(length > 1){
            first = first.next;
            dequeNode.next = null;
        }
        length--;
        return dequeNode;
    }
    public void printQueue() {
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("First: null");
            System.out.println("Last: null");
        } else {
            System.out.println("First: " + first.value);
            System.out.println("Last: " + last.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nQueue:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printQueue();
        }
    }
}

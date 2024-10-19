package com.github.mpalambonisi.datastructures.queues;

public class QueueDemo {
    public static void main(String[] args) {

        // queue demonstration
        System.out.println("\n --------------- QUEUE ----------------- \n");
        Queue myQueue = new Queue(2);
        myQueue.printAll();

        // enqueue() demonstration
        System.out.println("\n --------------- enqueue() ----------------- \n");
        System.out.print("Before enqueue() : ");
        myQueue.printQueue();

        myQueue.enqueue(1);

        System.out.print("\n\nAfter enqueue() : ");
        myQueue.printQueue();

        // dequeue() demonstration
        System.out.println("\n --------------- dequeue() ----------------- \n");
        // (2) Items - Returns 2 Node
        System.out.println(myQueue.dequeue().value);
        // (1) Item - Returns 1 Node
        System.out.println(myQueue.dequeue().value);
        // (0) Items - Returns null
        System.out.println(myQueue.dequeue());
    }
}

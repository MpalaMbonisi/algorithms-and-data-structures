package com.mpalambonisi.datastructures.singlyLinkedLists;

public class LinkedListsDemo {
    public static void main(String[] args) {

        LinkedLists myLinkedList = new LinkedLists(4);
        myLinkedList.printList();

        // append() demonstration
        myLinkedList.append(2);
        System.out.println("Appended....");
        myLinkedList.printList();

        // removeLast() demo
        System.out.println("RemovedLast Node: " + myLinkedList.removeLast().value);

        // prepend() demonstration
        myLinkedList.prepend(6);
        System.out.println("Prepended....");
        myLinkedList.printList();

        // removeFirst() demonstration
        System.out.println("RemovedFirst Node: " + myLinkedList.removeFirst().value);

        // get() demonstration
        System.out.println("\n===========================\n");
        myLinkedList.append(1);
        myLinkedList.append(9);
        myLinkedList.append(2);
        myLinkedList.printList();
        System.out.println("Found: " + myLinkedList.get(2).value);

        // set() demonstration
        System.out.println("\n===========================\n");
        myLinkedList.printList();

        // insert() demonstration
        System.out.println("\n===========================\n");
        myLinkedList.insert(1, 18);

        System.out.println("\nLL after insert(18) ");
        myLinkedList.printList();

        myLinkedList.insert(0, 0);

        System.out.println("\nLL after insert(0) at beginning:");
        myLinkedList.printList();

        myLinkedList.insert(6, 150);

        System.out.println("\nLL after insert(4) at end:");
        myLinkedList.printList();

        // remove() demonstration
        System.out.println("\n===========================\n");
        System.out.println("\nRemoved node:");
        System.out.println(myLinkedList.remove(2).value);
        System.out.println("LL after remove(2)");
        myLinkedList.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myLinkedList.remove(0).value);
        System.out.println("LL after remove() of first node:");
        myLinkedList.printList();

        System.out.println("\nRemoved node:");
        System.out.println(myLinkedList.remove(4).value);
        System.out.println("LL after remove() of last node:");
        myLinkedList.printList();

        // reverse()
        System.out.println("\n===========================\n");
        System.out.println("LL before reverse():");
        myLinkedList.printList();

        myLinkedList.reverse();

        System.out.println("\nLL after reverse():");
        myLinkedList.printList();

        // findMiddleNode() demonstration
        System.out.println("\n===========================\n");
        myLinkedList.printList();
        System.out.println( "Middle Node: "+ myLinkedList.findMiddleNode().value);

        myLinkedList.append(6);
        myLinkedList.append(11);
        myLinkedList.append(45);

        myLinkedList.printList();
        System.out.println( "Middle Node: "+ myLinkedList.findMiddleNode().value);

        // hasLoop() demonstration
        System.out.println("\n===========================\n");
        // create a loop by connecting the tail to the second node
        myLinkedList.getTail().next = myLinkedList.getHead().next;


        System.out.println("Has Loop:");
        System.out.println( myLinkedList.hasLoop());

    }
}
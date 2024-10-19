package com.mpalambonisi.datastructures.singlylinkedlists;

public class LinkedListsDemo {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(4);

        System.out.println("\n==============================================\n");

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
        System.out.println("\n=================== get() ====================\n");
        myLinkedList.append(1);
        myLinkedList.append(9);
        myLinkedList.append(2);
        myLinkedList.printList();
        System.out.println("Found: " + myLinkedList.get(2).value);

        // set() demonstration
        System.out.println("\n=================  set()  ====================\n");
        myLinkedList.printList();

        // insert() demonstration
        System.out.println("\n================== insert() ==================\n");
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
        System.out.println("\n================ remove()  ===================\n");
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
        System.out.println("\n================ reverse() ===================\n");
        System.out.println("LL before reverse():");
        myLinkedList.printList();

        myLinkedList.reverse();

        System.out.println("\nLL after reverse():");
        myLinkedList.printList();

        // findMiddleNode() demonstration
        System.out.println("\n============= findMiddleNode() ===============\n");
        myLinkedList.printList();
        System.out.println( "Middle Node: "+ myLinkedList.findMiddleNode().value);

        myLinkedList.append(6);
        myLinkedList.append(11);
        myLinkedList.append(45);

        myLinkedList.printList();
        System.out.println( "Middle Node: "+ myLinkedList.findMiddleNode().value);

        // hasLoop() demonstration
        System.out.println("\n================ hasLoop() ===================\n");
        // create a loop by connecting the tail to the second node
        myLinkedList.getTail().next = myLinkedList.getHead().next;


        System.out.println("Has Loop:");
        System.out.println( myLinkedList.hasLoop());

        // partitionList() demonstration
        System.out.println("\n============ partitionList() =================\n");
        // Create a new LinkedList and append values to it
        LinkedList myLinkedList01 = new LinkedList(3);
        myLinkedList01.append(5);
        myLinkedList01.append(8);
        myLinkedList01.append(10);
        myLinkedList01.append(2);
        myLinkedList01.append(1);

        // Print the list before partitioning
        System.out.println("LL before partitionList:");
        myLinkedList01.printList(); // Output: 3 5 8 10 2 1

        // Call the partitionList method with x = 5
        myLinkedList01.partitionList(5);

        // Print the list after partitioning
        System.out.println("LL after partitionList:");
        myLinkedList01.printList(); // Output: 3 2 1 5 8 10

        // removeDuplicates() demonstration
        System.out.println("\n=========== removeDuplicates() ===============\n");
        LinkedList myLinkedList02 = new LinkedList(1);

        myLinkedList02.append(1);
        myLinkedList02.append(2);
        myLinkedList02.append(2);
        myLinkedList02.append(3);
        myLinkedList02.append(3);
        myLinkedList02.append(3);
        myLinkedList02.append(4);

        myLinkedList02.removeDuplicates();

        myLinkedList02.printList();

        // binaryToDecimal() demonstration
        System.out.println("\n=========== binaryToDecimal() ================\n");
        // ---------------
        // Convert 1011 to 11
        // ---------------
        LinkedList myLinkedList03 = new LinkedList(1);
        myLinkedList03.append(0);
        myLinkedList03.append(1);
        myLinkedList03.append(1);
        System.out.println("Convert 1011 to 11:");
        System.out.println("Input: 1 -> 0 -> 1 -> 1");
        System.out.println("Output: " + myLinkedList03.binaryToDecimal());
        System.out.println("---------------");

        // ---------------
        // Convert 1100 to 12
        // ---------------
        LinkedList myLinkedList04 = new LinkedList(1);
        myLinkedList04.append(1);
        myLinkedList04.append(0);
        myLinkedList04.append(0);
        System.out.println("Convert 1100 to 12:");
        System.out.println("Input: 1 -> 1 -> 0 -> 0");
        System.out.println("Output: " + myLinkedList04.binaryToDecimal());
        System.out.println("---------------");

        // ---------------
        // Convert 1 to 1
        // ---------------
        LinkedList myLinkedList05 = new LinkedList(1);
        System.out.println("Convert 1 to 1:");
        System.out.println("Input: 1");
        System.out.println("Output: " + myLinkedList05.binaryToDecimal());
        System.out.println("---------------");

        // ---------------
        // Convert empty list to 0
        // ---------------
        LinkedList myLinkedList06 = new LinkedList(0);
        myLinkedList06.makeEmpty();
        System.out.println("Convert empty list to 0:");
        System.out.println("Input: empty");
        System.out.println("Output: " + myLinkedList06.binaryToDecimal());
        System.out.println("---------------");

        // binaryToDecimal() demonstration
        System.out.println("\n=========== reverseBetween() ================\n");
        // Create a linked list with values 1, 2, 3, 4, and 5
        LinkedList myLinkedList07 = new LinkedList(1);
        myLinkedList07.append(2);
        myLinkedList07.append(3);
        myLinkedList07.append(4);
        myLinkedList07.append(5);

        System.out.println("Original linked list: ");
        myLinkedList07.printList();

        // Reverse a sublist within the linked list
        myLinkedList07.reverseBetween(1, 3);
        System.out.println("\nReversed sublist (1, 3): ");
        myLinkedList07.printList();

        // Reverse another sublist within the linked list
        myLinkedList07.reverseBetween(0, 4);
        System.out.println("\nReversed entire linked list: ");
        myLinkedList07.printList();

        // Reverse a sublist of length 1 within the linked list
        myLinkedList07.reverseBetween(2, 2);
        System.out.println("\nReversed sublist of length 1 (2, 2): ");
        myLinkedList07.printList();

        // Reverse an empty linked list
        LinkedList emptyList = new LinkedList(0);
        emptyList.makeEmpty();
        emptyList.reverseBetween(0, 0);
        System.out.println("\nReversed empty linked list: ");
        emptyList.printList();
    }
}
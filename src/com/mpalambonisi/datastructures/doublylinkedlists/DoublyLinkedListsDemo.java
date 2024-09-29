package com.mpalambonisi.datastructures.doublylinkedlists;

public class DoublyLinkedListsDemo {
    public static void main(String[] args) {
        DoublyLinkedLists myList = new DoublyLinkedLists(7);
        myList.printAll();

        // append() demonstration
        System.out.println("\n------------- append() demo --------------\n");
        myList.append(6);
        myList.printList();

        // removeLast() demonstration
        System.out.println("\n------------ removeLast() demo ---------------\n");
        myList.removeLast();
        myList.printList();

        // prepend() demonstration
        System.out.println("\n------------ prepend() demo ---------------\n");
        myList.prepend(6);
        myList.prepend(8);
        myList.printList();

        // removeFirst() demonstration
        System.out.println("\n------------ removeFirst() demo ---------------\n");
        System.out.println("Removed Node : " + myList.removeFirst().value);
        myList.printList();

        // get() demonstration
        System.out.println("\n------------ get() demo ---------------\n");
        myList.append(2);
        myList.append(3);
        myList.append(10);
        myList.append(4);
        myList.printList();
        System.out.println("get(1) : " + myList.get(1).value);
        System.out.println("get(3) : " + myList.get(3).value);
        System.out.println("get(6) : " + myList.get(6));

        // set() demonstration
        System.out.println("\n------------ set() demo ---------------\n");
        System.out.println("set(2,99).....");
        myList.set(2,99);
        myList.printList();

        // insert() demonstration
        System.out.println("\n------------ insert() demo ---------------\n");
        System.out.println("DLL before insert():");
        myList.printList();
        myList.insert(3, 21);
        System.out.println("\nDLL after insert(2) at index 3:");
        myList.printList();
        myList.insert(0, 0);
        System.out.println("\nDLL after insert(0) at beginning:");
        myList.printList();
        myList.insert(4, 12);
        System.out.println("\nDLL after insert(4) at end:");
        myList.printList();

        // remove() demonstration
        System.out.println("\n------------ remove() demo ---------------\n");
        myList.printList();
        System.out.println("Removed node at index 0 : " + myList.remove(0).value);
        myList.printList();
        System.out.println("Removed node at index 3: " + myList.remove(3).value);
        myList.printList();


        // ------------- LEETCODE EXERCISES ----------------------

        // swapFirstLast() demo
        System.out.println("\n------------ swapFirstLast() demo ---------------\n");
        myList.printList();
        myList.swapFirstLast();
        myList.printList();

        // reverse() demo
        System.out.println("\n------------ reverse() demo ---------------\n");
        myList.reverse();
        myList.printList();

        // isPalindrome() demo
        System.out.println("\n------------ isPalindrome() demo ---------------\n");
        DoublyLinkedLists myDLL1 = new DoublyLinkedLists(1);
        myDLL1.append(2);
        myDLL1.append(3);
        myDLL1.append(2);
        myDLL1.append(1);

        System.out.println("List1 isPalindrome:");
        myDLL1.printList();
        System.out.println( myDLL1.isPalindrome() );



        DoublyLinkedLists myDLL2 = new DoublyLinkedLists(1);
        myDLL2.append(2);
        myDLL2.append(3);

        System.out.println("\nList2 isPalindrome:");
        myDLL2.printList();
        System.out.println( myDLL2.isPalindrome() );

    }
}

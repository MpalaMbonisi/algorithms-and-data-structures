package com.mpalambonisi.datastructures.singlylinkedlists;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;
        Node (int value){ // made the access mode Default because it's an inner-class
            this.value = value;
        }
    }

    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length==0) head = tail = newNode;
        else if (length>0){
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast(){
        if (length==0) return null;
        Node temp = head;
        Node pre = head;
        while(temp.next!=null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length==0) head = tail = null;
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length==0) head = tail = newNode;
        else if(length>0){
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        if (length==0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length==0) tail=null;
        return temp;
    }

    public Node get(int index){
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp;
    }
    public boolean set(int index, int value){
        if (get(index)!=null){
            get(index).value = value;
            return true;
        }
        else return false;
    }
    public boolean insert(int index, int value){
        if(index < 0 || index > length) return false;

        else if (index==0) {
            prepend(value);
            return true;
        }
        else if (index==length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index){
        if (index<0 || index >= length) return null;
        else if (index==0) return removeFirst();
        else if (index == length - 1) return removeLast();
        Node prev = get(index - 1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i =0; i < length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    // implementation of Bubble-Sort Algorithm
    public void bubbleSort(){
        if (length < 2) return;
        Node sortedUntil = null;

        while(this.head.next != sortedUntil){
            Node currentNode = head;
            while (currentNode.next != sortedUntil){
                if (currentNode.value > currentNode.next.value){
                    int temp = currentNode.value;
                    currentNode.value = currentNode.next.value;
                    currentNode.next.value = temp;
                }
                currentNode = currentNode.next;
            }
            sortedUntil = currentNode;
        }
    }

    // implementation of Selection Sort
    public void selectionSort(){
        if (length < 2) return;
        Node currentNode = this.head;

        while(currentNode.next != null){
            Node smallest = currentNode;
            Node innerCurrent = currentNode.next;

            while(innerCurrent != null){
                if (innerCurrent.value < smallest.value){
                    smallest = innerCurrent;
                }
                innerCurrent = innerCurrent.next;
            }
            if (smallest != currentNode) {
                int temp = smallest.value;
                smallest.value = currentNode.value;
                currentNode.value = temp;
            }
            currentNode = currentNode.next;
        }
    }

    // implementation of Insertion Sort
    public void insertionSort() {
        // If the list has less than 2 elements, no need to sort, so return
        if (length < 2) return;

        // Split the list into two parts: sorted and unsorted
        Node sortedListHead = this.head;
        Node unsortedListHead = this.head.next;
        sortedListHead.next = null; // Mark the end of the sorted part
        tail = sortedListHead; // The tail is now the last element of the sorted part

        // Iterate over the unsorted part of the list
        while (unsortedListHead != null) {

            if (unsortedListHead.value < sortedListHead.value) {
                Node temp = unsortedListHead;
                unsortedListHead = unsortedListHead.next;
                temp.next = sortedListHead;
                sortedListHead = temp; // Update the head of the sorted list
            } else {
                // Otherwise, search for the correct position in the sorted list
                Node searchPointer = sortedListHead;

                // Move through the sorted part until the correct position is found
                while (searchPointer.next != null && searchPointer.next.value < unsortedListHead.value) {
                    searchPointer = searchPointer.next;
                }

                // Insert the unsorted node at the correct position in the sorted list
                Node temp = unsortedListHead;
                unsortedListHead = unsortedListHead.next;
                temp.next = searchPointer.next;
                searchPointer.next = temp;

                // If the node is inserted at the end, update the tail reference
                if (temp.next == null) tail = temp;
            }
        }

        // Update the head of the list to the new sorted list head
        head = sortedListHead;
    }

    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value + " - ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void printAll(){
        if(length == 0){
            System.out.println("Head: null");
            System.out.println("Tail: null");
        }else{
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length: " + length);
        System.out.println("\nLinked List: ");
        if (length == 0){
            System.out.println("empty");
        }else{
            printList();
        }
    }

    //          ------ LEECODE EXERCISE QUESTIONS --------
    public Node findMiddleNode(){
        if (head == null) return null;

        Node fastPointer = head;
        Node slowPointer = head;

        while(fastPointer!=null && fastPointer.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer;
    }

    // Tortoise and hare algorithm
    public boolean hasLoop(){
        if(length == 0) return false;
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) return true;
        }
        return false;
    }

    // FindKthFromEnd() implementation
    // This algorithm uses two pointers, called 'slow' and 'fast'.

    public Node findKthFromEnd(int k){
        Node fast = head;
        Node slow = head;

        for (int i=0;i<k;i++){
            if(fast!=null) {
                fast=fast.next;
            }
            else return null;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;

        }
        return slow;
    }

}

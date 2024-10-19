package com.github.mpalambonisi.datastructures.doublylinkedlists;

public class DoublyLinkedLists {
    private Node head;
    private Node tail;
    private int length;
    static class Node{
        int value;
        Node next;
        Node prev;
        Node(int value){
            this.value = value;
        }
    }
    public DoublyLinkedLists(int value){
        Node newNode = new Node(value);
        head = tail = newNode;
        length++;
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

    // ---------- methods ---------------
    public void append(int value){
        Node newNode = new Node(value);

        if (length==0) head = tail = newNode;

        if (length > 0){
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast(){
        Node temp = tail;
        if (length == 0) return null;

        else if (length == 1) head = tail = null;

        else if (length > 1) {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if (length == 0) head = tail = newNode;
        else if (length > 0){
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        length++;
    }
    public Node removeFirst(){
        Node temp = head;
        if (length==0) return null;
        else if (length==1) head = tail = null;
        else if (length > 1) {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }
    public Node get(int index){
        if (index < 0 || index >= length) return null;
        Node temp = head;
        if (index < length/2){
            for(int i=0; i<index;i++){
                temp = temp.next;
            }
        }
        else{
            temp = tail;
            for(int i=(length - 1); i>index ; i--){
                temp = temp.prev;
            }
        }
        return temp;
    }
    public boolean set(int index, int value){
        Node temp = get(index);
        if (temp == null) return false;
        else {
            temp.value = value;
            return true;
        }
    }
    public boolean insert(int index, int value){
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        else if (index == length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node before = get(index-1);
        Node after = before.next;
        newNode.next = after;
        newNode.prev = before;
        before.next = newNode;
        after.prev = newNode;
        length++;
        return true;
    }
    public Node remove(int index){
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length - 1) return removeLast();
        Node temp = get(index);
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.prev = temp.next = null;
        length--;
        return temp;
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

    // ------------- LEETCODE EXERCISES ----------------------

    // 1. Swap First and Last ( interview question )
    public void swapFirstLast(){
        if (length < 2) System.out.println("There are no nodes to swap...");
        else{
            int temp = head.value;
            head.value = tail.value;
            tail.value = temp;
            System.out.println("... swap complete ...");
        }
    }

    // 2. Reverse Double Linked List ( interview question )
    public void reverse(){
        Node currentNode = head;
        Node tempNode = null;
        while (currentNode != null){
            tempNode = currentNode.prev;
            currentNode.prev = currentNode.next;
            currentNode.next = tempNode;
            currentNode = currentNode.prev;
        }
        tempNode = head;
        head = tail;
        tail = tempNode;

    }

    // 3. isPalindrome() ( interview question )
    public boolean isPalindrome(){
        if (length <= 1) return true;
        Node startHalf = head;
        Node endHalf = tail;
        for(int i=0; i < length / 2;i++){
            if (startHalf.value == endHalf.value){
                startHalf = startHalf.next;
                endHalf = endHalf.prev;
            }
            else return false;
        }
        return true;
    }

    // 4.

}

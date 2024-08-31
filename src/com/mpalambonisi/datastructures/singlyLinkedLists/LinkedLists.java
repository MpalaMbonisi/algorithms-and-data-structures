package com.mpalambonisi.datastructures.singlyLinkedLists;

public class LinkedLists {
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

    public LinkedLists (int value){
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

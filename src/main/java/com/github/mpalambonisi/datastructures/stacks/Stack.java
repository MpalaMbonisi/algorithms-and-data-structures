package com.github.mpalambonisi.datastructures.stacks;

public class Stack {
    private Node top;
    private int height;

    public Node getTop() {
        return top;
    }

    public int getHeight() {
        return height;
    }

    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    public Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    // implement push()
    public void push(int value){
        Node newNode = new Node(value);
        if(height == 0) top = newNode;
        else if (height > 0){
            newNode.next = top;
            top = newNode;
        }
        height++;
    }
    public Node pop(){
        Node poppedNode = top;
        if (height == 0) top = null;
        else if (height > 0){
            top = poppedNode.next;
            poppedNode.next = null;
        }
        height--;
        return poppedNode;
    }
    public void printStack(){
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void printAll(){
        if(height == 0){
            System.out.println("Top: null");
        }else{
            System.out.println("Top: " + top.value);;
        }
        System.out.println("Height: " + height);
        System.out.println("\nStack : ");
        if (height == 0){
            System.out.println("empty");
        }else{
            printStack();
        }
    }
}


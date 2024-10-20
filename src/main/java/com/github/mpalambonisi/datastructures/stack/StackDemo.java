package com.github.mpalambonisi.datastructures.stack;

public class StackDemo {
    public static void main(String[] args) {

        // stack demonstration
        System.out.println("\n --------------- STACK ----------------- \n");
        Stack myStack = new Stack(1);
        myStack.printAll();

        // push() demonstration
        System.out.println("\n --------------- push() ----------------- \n");
        myStack.push(2);
        myStack.push(3);
        myStack.printStack();

        // pop() demonstration
        System.out.println("\n --------------- pop() ----------------- \n");
        System.out.println("Popped Node : " + myStack.pop().value);
        myStack.printStack();
        System.out.println("Popped Node : " + myStack.pop().value);
        myStack.printStack();

        // creating stacks using arraylists
        System.out.println("\n --------------- ARRAYLIST STACK ----------------- \n");
        StackArrayList myStackArrayList = new StackArrayList();

        // push() demonstration
        myStackArrayList.push(1);
        myStackArrayList.push(2);
        myStackArrayList.push(3);

        myStackArrayList.printStack();

        // pop() demonstration
        System.out.println("Stack before pop():");
        myStackArrayList.printStack();

        System.out.println("\nPopped node: " + myStackArrayList.pop());

        System.out.println("\nStack after pop():");
        myStackArrayList.printStack();

        // reverse a String using Stacks that use ArrayLists
        String myString = "hello";
        String reversedString = StackArrayList.reverseString(myString);
        System.out.println(reversedString);

    }
}

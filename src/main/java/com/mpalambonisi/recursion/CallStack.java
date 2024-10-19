package com.mpalambonisi.recursion;

/*
 * The call stack is a data structure used by the Java runtime to keep track of the methods that are currently being executed.
 * Every time a method is called, a new frame is added to the call stack. Once the method completes, the frame is removed.
 * The call stack follows the Last In, First Out (LIFO) principle, meaning the most recently called method is executed first.
 *
 * In this code:
 * 1. The main method starts execution and calls method01.
 * 2. method01 is pushed onto the call stack, and it calls method02.
 * 3. method02 is then pushed onto the call stack, and it calls method03.
 * 4. method03 is pushed onto the call stack and executed first. It prints "Method Three executed...".
 * 5. After method03 completes, its frame is 'popped' from the stack, and control returns to method02.
 * 6. method02 prints "Method Two executed..." and completes. Its frame is popped, and control returns to method01.
 * 7. method01 prints "Method One executed..." and completes. Finally, its frame is popped, and the main method completes.
 */

public class CallStack {
    private static void method03(){
        System.out.println("Method Three executed...");
    }
    private static void method02(){
        method03();
        System.out.println("Method Two executed...");
    }
    private static void method01(){
        method02();
        System.out.println("Method One executed...");
    }
    public static void main(String[] args) {
        method01();
    }
}

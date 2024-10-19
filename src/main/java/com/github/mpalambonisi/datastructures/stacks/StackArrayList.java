package com.github.mpalambonisi.datastructures.stacks;

import java.util.ArrayList;
// ---------------- Stack that uses an ArrayList ------------------------
public class StackArrayList<T> {
    private ArrayList<T> stackList = new ArrayList<>();

    public ArrayList<T> getStackList() {
        return stackList;
    }

    public void printStack() {
        for (int i = stackList.size() - 1; i >= 0; i--) {
            System.out.println(stackList.get(i));
        }
    }

    public boolean isEmpty() {
        return stackList.size() == 0;
    }

    public T peek() {
        if (isEmpty()) return null;
        else
            return stackList.get(stackList.size() - 1);
    }

    public int size() {
        return stackList.size();
    }

    // push() implementation
    public void push(T value) {
        stackList.add(value);

    }

    // pop() implementation
    public T pop(){
        if (isEmpty()) return null;
        else{
            int lastIndex = stackList.size() - 1;
             return stackList.remove(lastIndex);
        }
    }

    // reverseString() * interview question *
    public static String reverseString(String str){
        StackArrayList<Character> myStack = new StackArrayList<>();
        String reversedString = "";
        for (char c: str.toCharArray()
             ) {
            myStack.push(c);
        }
        while(!myStack.isEmpty()){
            reversedString += myStack.pop();
        }
        return reversedString;
    }
}

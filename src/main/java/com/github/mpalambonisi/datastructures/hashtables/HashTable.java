package com.github.mpalambonisi.datastructures.hashtables;

import java.util.ArrayList;

public class HashTable {
    int size = 7; // it's best practice to keep this number a prime number
    Node[] dataMap;
    class Node{
        String key;
        int value;
        Node next; // this is for handling collisions via chaining { linked lists }

        Node(String key, int value){
            this.key = key;
            this.value = value;
        }
    }
    public HashTable(){
        dataMap = new Node[size];
    }

    public Node[] getDataMap() {
        return dataMap;
    }

    // hash function
    private int hash(String key){
        // this method will always give you the same result for the same key
        int hash = 0;
        char[] keyChars= key.toCharArray();
        for(int i = 0; i < keyChars.length; i++){
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue * 23) % dataMap.length; // any prime number can be used
        }
        return hash;
    }
    // implementing set()
    public void set(String key, int value){
        int index = hash(key);
        Node newNode = new Node(key, value);
        if (dataMap[index] == null) dataMap[index] = newNode;
        else{
            Node temp = dataMap[index];
            while(temp!=null){
                if (temp.key.equals(newNode.key)){
                    temp.value = newNode.value;
                }
                if (!temp.key.equals(newNode.key) && temp.next == null){
                    temp.next = newNode;
                }
                temp = temp.next;
            }

        }
    }

    // implementing get()
    public int get(String key){
        int index = hash(key);
        Node temp = dataMap[index];
        while (temp!=null){
            if(temp.key.equals(key)) return temp.value;
            else temp = temp.next;
        }
        return 0;

    }

    // implementing keys()
    public ArrayList<String> keys(){
        ArrayList<String> myList = new ArrayList<>();
        for (Node n: dataMap) {
            if (n == null) continue;
            myList.add(n.key);
            while(n.next != null){
                n = n.next;
                myList.add(n.key);
            }
        }
        return  myList;
    }

    public void printTable() {
        for(int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            if(dataMap[i] != null) {
                Node temp = dataMap[i];
                while (temp != null) {
                    System.out.println("   {" + temp.key + ", " + temp.value + "}");
                    temp = temp.next;
                }
            }
        }
    }
}

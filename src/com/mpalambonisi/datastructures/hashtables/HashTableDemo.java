package com.mpalambonisi.datastructures.hashtables;

public class HashTableDemo {
    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();
        myHashTable.printTable();

        // set() demonstration
        System.out.println("\n------------------- set() --------------------\n");
        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);
        myHashTable.set("bolts", 200);
        myHashTable.set("screws", 140);
        myHashTable.printTable();

        // get() demonstration
        System.out.println("\n------------------- get() --------------------\n");
        System.out.println("lumber : " + myHashTable.get("lumber"));
        System.out.println("bolts : " + myHashTable.get("bolts"));
        System.out.println("hammer : " + myHashTable.get("hammer"));

        // keys() demonstration
        System.out.println("\n------------------- keys() --------------------\n");
        System.out.println(myHashTable.keys());
    }
}

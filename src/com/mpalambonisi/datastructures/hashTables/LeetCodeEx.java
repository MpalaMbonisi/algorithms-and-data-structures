package com.mpalambonisi.datastructures.hashTables;

import java.util.ArrayList;
import java.util.HashMap;

public class LeetCodeEx {

    // implementation of itemInCommon()
    public boolean itemInCommon(int[] array1, int[] array2){
        // big(0) of this method should be 0(n)
        // using a HashMap instead of a HashTable, but they are basically the same

        HashMap<Integer,Boolean> myHashMap = new HashMap<>();
        for (int z: array1) {
            myHashMap.put(z, true);
        }
        for(int y: array2){
            if (myHashMap.containsKey(y)) return true;
        }
        return false;
    }

    // implementation of findDuplicates
    public ArrayList<Integer> findDuplicates(int[] nums){
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();
        ArrayList<Integer> myList = new ArrayList<>();
        for (int n : nums) {
            if(myHashMap.put(n,true)!=null && !myList.contains(n)) myList.add(n);
        }
        return myList;
    }
}

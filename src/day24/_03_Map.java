package day24;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class _03_Map {
    public static void main(String[] args) {
        // HashMap       : Works quickly and stores elements based on its own algorithm
        // LinkedHashMap : Stores elements in the order they were inserted
        // TreeMap       : Stores elements always sorted by the key

        // Creating a HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(9, "fox");
        hashMap.put(2, "cat");
        hashMap.put(30, "dog");
        hashMap.put(11, "bird");
        hashMap.put(4, "wolf");

        System.out.println("HashMap = " + hashMap);

        // Creating a LinkedHashMap
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(9, "fox");
        linkedHashMap.put(2, "cat");
        linkedHashMap.put(30, "dog");
        linkedHashMap.put(11, "bird");
        linkedHashMap.put(4, "wolf");

        System.out.println("LinkedHashMap = " + linkedHashMap);

        // Creating a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(9, "fox");
        treeMap.put(2, "cat");
        treeMap.put(30, "dog");
        treeMap.put(11, "bird");
        treeMap.put(4, "wolf");

        System.out.println("TreeMap = " + treeMap);
    }
}

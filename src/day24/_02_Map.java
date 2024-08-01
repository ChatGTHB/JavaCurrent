package day24;

import java.util.HashMap;
import java.util.Map;

public class _02_Map {
    public static void main(String[] args) {
        // Creating a HashMap with Integer keys and String values
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1001, "John Doe");
        hashMap.put(1002, "Jane Smith");
        hashMap.put(2001, "Alice Johnson");
        hashMap.put(5001, "Bob Brown");
        hashMap.put(1002, "Eve White"); // The value for key 1002 is updated

        // Printing all keys
        System.out.println("hashMap.keySet() = " + hashMap.keySet());
        // Printing all values
        System.out.println("hashMap.values() = " + hashMap.values());

        System.out.println();

        // Iterating through keys
        for (Integer key : hashMap.keySet()) {
            System.out.println("key = " + key);
        }

        System.out.println();

        // Iterating through values
        for (String value : hashMap.values()) {
            System.out.println("value = " + value);
        }

        System.out.println();

        // Iterating through key-value pairs
        for (Map.Entry<Integer, String> keyAndValue : hashMap.entrySet()) {
            System.out.println(keyAndValue.getKey() + " - " + keyAndValue.getValue());
        }
    }
}

package day24;

import java.util.HashMap;

public class _01_Map {
    public static void main(String[] args) {
        // Set -> HashSet, LinkedHashSet, TreeSet
        // Map -> HashMap, LinkedHashMap, TreeMap

        // Map = Key + Set -> A set with keys
        // Key + Value pairs

        // We will specify the types for the keys and values.
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1001, "Ismet Temur");
        hashMap.put(2001, "Esma");
        hashMap.put(2, "Oguzhan");
        hashMap.put(1003, "Kaan");
        hashMap.put(1001, "Ahmet Kaya"); // Since the key 1001 already exists,
        // it will update the value. It sets (updates) the value.

        System.out.println("Hash Map = " + hashMap);

        // Retrieve values using keys
        System.out.println("hashMap.get(2001) = " + hashMap.get(2001));
        System.out.println("hashMap.get(1003) = " + hashMap.get(1003));

        // Check if a key exists
        System.out.println("hashMap.containsKey(1003) = " + hashMap.containsKey(1003));
        // Check if a value exists
        System.out.println("hashMap.containsValue(Kaan) = " + hashMap.containsValue("Kaan"));

        // Get all keys
        System.out.println("hashMap.keySet() = " + hashMap.keySet());
        // Get all values
        System.out.println("hashMap.values() = " + hashMap.values());
        // Get all key-value pairs
        System.out.println("hashMap.entrySet() = " + hashMap.entrySet());

        // Remove a key-value pair
        hashMap.remove(1001);
        System.out.println("Hash Map after removal = " + hashMap);
        // Get the size of the map
        System.out.println("hashMap.size() = " + hashMap.size());

        // Clear all key-value pairs
        hashMap.clear();
        System.out.println("Hash Map after clear = " + hashMap);
    }
}

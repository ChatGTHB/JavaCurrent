package day23;

import java.util.HashSet;

public class _05_Sets {
    public static void main(String[] args) {
        // Creating a HashSet of integers
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(5);  // element to be removed later
        hashSet.add(7);
        hashSet.add(34);
        hashSet.add(3);
        hashSet.add(4);

        // Printing the size and elements of the HashSet
        System.out.println("Hash Set Size = " + hashSet.size());
        System.out.println("Hash Set = " + hashSet);

        // Removing an element by its value
        hashSet.remove(5); // removes the element with value 5, no index
        System.out.println("Hash Set Size after removal = " + hashSet.size());
        System.out.println("Hash Set after removal = " + hashSet);

        // Checking if an element exists in the HashSet
        if (hashSet.contains(7)) {
            System.out.println("7 is present in the HashSet");
        } else {
            System.out.println("7 is not present in the HashSet");
        }

        // Clearing all elements from the HashSet
        hashSet.clear();
        System.out.println("Hash Set after clear = " + hashSet);
    }
}

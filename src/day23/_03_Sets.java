package day23;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _03_Sets {
    public static void main(String[] args) {
        // SETS: Collections that do not allow duplicate elements.
        // HashSet: Used for fast insertion and retrieval of elements without any guarantee of order.
        // LinkedHashSet: Maintains the insertion order of elements.
        // TreeSet: Keeps elements sorted according to their natural order or a specified comparator.

        // HashSet: Fast, uses its own algorithm to maintain order (no guarantee of order)
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("one");
        hashSet.add("two");
        hashSet.add("three");
        hashSet.add("four");
        hashSet.add("five");
        System.out.println("Hash Set = " + hashSet);
        // HashSet stores the elements without any specific order.
        // This provides fast insertion, deletion, and lookup operations.

        // LinkedHashSet: Maintains insertion order
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("one");
        linkedHashSet.add("two");
        linkedHashSet.add("three");
        linkedHashSet.add("four");
        linkedHashSet.add("five");
        System.out.println("Linked Hash Set = " + linkedHashSet);
        // LinkedHashSet stores the elements in the order they were inserted.
        // This maintains the insertion order while providing fast access.

        // TreeSet: Always sorted
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("one");
        treeSet.add("two");
        treeSet.add("three");
        treeSet.add("four");
        treeSet.add("five");
        System.out.println("Tree Set = " + treeSet);
        // TreeSet stores the elements in their natural order or according to a specified comparator.
        // This ensures that the elements are always sorted.
    }
}

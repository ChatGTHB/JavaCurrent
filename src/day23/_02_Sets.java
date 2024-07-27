package day23;

import java.util.HashSet;

public class _02_Sets {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(38);
        hashSet.add(22);
        hashSet.add(4);

        System.out.println("hashSet = " + hashSet);

        // Let's see if it will be added
        hashSet.add(4); // Even if you try to add, SETs do not add duplicates
        hashSet.add(2); // Even if you try to add, SETs do not add duplicates

        System.out.println("hashSet = " + hashSet);
    }
}

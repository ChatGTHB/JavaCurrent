package day23;

import java.util.HashSet;

public class _07_Sets {
    public static void main(String[] args) {
        // Creating the first set (setA)
        HashSet<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);

        // Creating the second set (setB)
        HashSet<Integer> setB = new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);

        System.out.println("setA = " + setA);
        System.out.println("setB = " + setB);

        // Union of setA and setB
        HashSet<Integer> unionSet = new HashSet<>();
        unionSet.addAll(setA);
        unionSet.addAll(setB);
        System.out.println("Union of setA and setB = " + unionSet);

        // Difference between setA and setB
        HashSet<Integer> differenceSet = new HashSet<>();
        differenceSet.addAll(setA);
        differenceSet.removeAll(setB);
        System.out.println("Difference between setA and setB = " + differenceSet);

        // Intersection of setA and setB
        HashSet<Integer> intersectionSet = new HashSet<>();
        intersectionSet.addAll(setA);
        intersectionSet.retainAll(setB);
        System.out.println("Intersection of setA and setB = " + intersectionSet);
    }
}

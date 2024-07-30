package day23;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class _06_Question {
    public static void main(String[] args) {
        /**
         Fill an array with 10 random integers (between 0 and 10, inclusive).
         Then, create a new collection without any duplicate values.
         */

        // Creating an array with 10 elements
        Integer[] array = new Integer[10];

        // Filling the array with random numbers between 0 and 10
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }

        // Printing the original array
        System.out.println("Array = " + Arrays.toString(array));

        // Method 1: Using TreeSet and Collections.addAll
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        Collections.addAll(treeSet1, array);
        System.out.println("Tree Set 1 = " + treeSet1);

        // Method 2: Using TreeSet constructor with Arrays.asList
        TreeSet<Integer> treeSet2 = new TreeSet<>(Arrays.asList(array));
        System.out.println("Tree Set 2 = " + treeSet2);

        // Method 3: Using TreeSet addAll method with Arrays.asList
        TreeSet<Integer> treeSet3 = new TreeSet<>();
        treeSet3.addAll(Arrays.asList(array));
        System.out.println("Tree Set 3 = " + treeSet3);
    }
}

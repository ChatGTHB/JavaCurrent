package day23;

import java.util.HashSet;

public class _08_ExampleHashSet {
    public static void main(String[] args) {
        /**
         * Generate an array of 10 unique random numbers between 1 and 20 (inclusive).
         * We want 10 random numbers without any duplicates.
         */

        HashSet<Integer> numbers = new HashSet<>();

        while (numbers.size() < 10) { // Stops when the set contains 10 elements
            int randomNum = (int) (Math.random() * 20) + 1;
            numbers.add(randomNum); // Adds the number if it's not already in the set
        }

        // Print the set of unique random numbers
        System.out.println("numbers = " + numbers);
    }
}

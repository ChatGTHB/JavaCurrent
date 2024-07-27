package day22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {
        // ArrayList is a member of the Collection group
        // Just like we use Arrays.sort to sort arrays,
        // we will use Collection methods to handle ArrayLists.

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(5);
        numbers.add(456);
        numbers.add(45);
        numbers.add(3);

        System.out.println("numbers = " + numbers);

        // Sorting
        Collections.sort(numbers);
        System.out.println("numbers = " + numbers);

        // Reversing
        Collections.reverse(numbers);
        System.out.println("numbers = " + numbers);

        // Max and Min
        System.out.println("max() = " + Collections.max(numbers));
        System.out.println("min() = " + Collections.min(numbers));

        // Filling all elements with a value
        Collections.fill(numbers, 0); // set all elements to 0
        System.out.println("numbers = " + numbers);

        // Replacing a specific value with another value
        Collections.replaceAll(numbers, 0, 5);
        System.out.println("numbers = " + numbers);

        // Assigning values during initialization
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 45, 6, 7, 8));
        System.out.println("list = " + list);

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("ismet", "mehmet", "Ayşe"));
        System.out.println("list2 = " + list2);

        // Adding multiple elements to a list
        Collections.addAll(list, 3, 4, 5, 6, 7);
        System.out.println("list = " + list);

        // If you want to convert an array to a list
        Integer[] array2 = {2, 3, 4, 5};
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(array2));
        System.out.println("list4 = " + list4);
    }
}

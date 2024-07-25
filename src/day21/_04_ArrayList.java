package day21;

import java.util.ArrayList;

public class _04_ArrayList {
    public static void main(String[] args) {
        int number = 5;            // Memory area that can hold one number and is named 'number'
        int[] array = new int[5];  // Memory area that can hold 5 numbers and is named 'array' (apartment)
        // It always has a fixed length of 5, even if you only use 3 of them, 2 remain unused

        // Instead of an array, what if there was something that had no initial length,
        // that could grow as I add elements and shrink as I remove them, like a shopping list, flexible in size
        // Array's cousin: LIST form of ARRAY

        ArrayList<Integer> list = new ArrayList<>(); // will grow as you add elements, shrink as you remove them
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Double> doubleList = new ArrayList<>();

        ArrayList<String> names = new ArrayList<>();
        System.out.println("names = " + names); // directly print the list

        names.add("Burak"); // add elements
        names.add("Aslı");
        names.add("Selda");
        names.add("Serkan");

        System.out.println("names = " + names);
        System.out.println("names.size() = " + names.size());

        names.add(1, "Mertcan"); // add in between, others shift up
        System.out.println("names = " + names);

        names.set(2, "Ulvi");  // replace element at the given index
        System.out.println("names = " + names);

        boolean isThere = names.contains("Burak");
        System.out.println("isThere = " + isThere);

        names.remove(1); // if given a number, it is treated as an index and removes the element
        System.out.println("names = " + names);

        int indexOfSelda = names.indexOf("Selda"); // returns the index of the given element
        System.out.println("indexOfSelda = " + indexOfSelda);

        String firstElement = names.get(0); // returns the element at the given index
        System.out.println("firstElement = " + firstElement);

        names.clear(); // clears the list
        System.out.println("names = " + names);
    }
}

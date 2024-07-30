package day23;

import java.util.Iterator;
import java.util.TreeSet;

public class _04_Sets {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Red");
        colors.add("RED");

        // Printing the entire set
        System.out.println("colors = " + colors);

        // Printing each element individually using for-each loop
        for (String element : colors) // order is guaranteed
            System.out.println("element = " + element);

//        int[] array = {34, 5, 6, 7, 8, 89, 899, 77};
//        for(int element : array)
//            System.out.println("element = " + element);

        // How to iterate through the set and guarantee the order in memory
        Iterator<String> iterator = colors.iterator(); // positioned at the start of the set
        while (iterator.hasNext()) { // while there are elements
            System.out.println("color = " + iterator.next());
            // .next() represents the current element the iterator points to
        }
    }
}

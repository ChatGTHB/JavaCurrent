package day42;

import java.util.ArrayList;
import java.util.List;

public class Q48 {
    public static void main(String[] args) {
        List colors = new ArrayList();

        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");

        colors.remove(2); // Removes the element at index 2 ("red")
        System.out.println("colors = " + colors);

        colors.add(3, "cyan"); // Adds "cyan" at index 3 (last position in this case)
        // It can only be added to an index equal to or smaller than the list size,
        // but adding to an index larger than the list size will throw an error.

        System.out.println("colors = " + colors);
    }
}

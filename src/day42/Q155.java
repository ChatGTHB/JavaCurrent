package day42;

import java.util.ArrayList;

public class Q155 {
    public static void main(String[] args) {

        ArrayList<Integer> points = new ArrayList<>();

        points.add(1);
        points.add(2); // points.remove(1);
        points.add(3);
        points.add(4);
        points.add(null);

        System.out.println("points = " + points);
        points.remove(1);  // Does this remove the value at index 1 or the value 1 (i.e., index 0)?
        System.out.println("points = " + points);

        points.remove(null); // Since this is not a number, it removes the value `null`.

        System.out.println("points = " + points);
        // points.remove((Object)1); // Removes the value `1`.

        // When removing a value, if there are duplicate values, it removes the first occurrence.
        // points.clear(); // Removes all elements from the list.

        // points.remove((Object)1); // Removes the value `1`.
        // System.out.println("points = " + points);
        // If you pass a number, it will treat it as an index and remove the element at that index.
        // If you pass an Object (value), it will remove that value.

        // points.remove((Object)7); // Tries to remove the value `7`. If the value is not found, no error is thrown.
        // points.remove(1); // If a number is provided, it first treats it as an index.
        // points.remove(7); // If you try to remove a non-existent index, it throws an error.
    }
}

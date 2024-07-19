package day18;

import java.util.Arrays;

public class _05_2DArrays {
    public static void main(String[] args) {
        int[][] table = {
                {5, 6, 7, 34, 5},  // 1st row
                {56, 7, 89, 34, 6} // 2nd row
        };

        // Print all elements of the 0th row
        System.out.println(Arrays.toString(table[0]));
        // Print all elements of the 1st row
        System.out.println(Arrays.toString(table[1]));

        // Print the number of elements in the 0th row
        System.out.println("Number of elements in 0th row: " + table[0].length);
        // Print the number of elements in the 1st row
        System.out.println("Number of elements in 1st row: " + table[1].length);
        // Print the number of rows
        System.out.println("Number of rows: " + table.length);

        System.out.println();

        // Print the entire table
        for (int row = 0; row < table.length; row++) {            // Iterate through rows
            for (int column = 0; column < table[row].length; column++) { // Iterate through columns
                System.out.print(table[row][column] + "\t");
            }
            System.out.println();
        }
    }
}

package day18;

public class _04_2DArrays {
    public static void main(String[] args) {
        int[] array1 = new int[10]; // Array with 10 elements, all default to 0
        int[] array2 = {2, 3, 4, 5, 66, 7, 8, 99, 23, 3}; // Array with 10 elements, initialized with values

        int[][] table1 = new int[2][5]; // 2D array with 2 rows and 5 columns, total 10 elements

        int[][] table2 = { // 2D array with initial values
                {5, 6, 7, 34, 5},   // 1st row
                {56, 7, 89, 34, 6}  // 2nd row
        };

        // Method 1: Printing each row separately
        for (int i = 0; i < 5; i++) { // Print all elements of the first row
            System.out.println(table2[0][i]);
        }

        for (int i = 0; i < 5; i++) { // Print all elements of the second row
            System.out.println(table2[1][i]);
        }
        System.out.println("*****");

        // Method 2: Nested loops to print the entire table
        for (int row = 0; row < table2.length; row++) {       // Iterate through rows
            for (int column = 0; column < table2[row].length; column++) {   // Iterate through columns
                System.out.print(table2[row][column] + "\t");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}

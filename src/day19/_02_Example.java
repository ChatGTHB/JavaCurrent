package day19;

import java.util.Arrays;
import java.util.Scanner;

public class _02_Example {
    public static void main(String[] args) {
        // Fill a 2x3 table with random numbers up to 10.
        // Then take a number from the user.
        // If this number exists in the table, print its position (row, column).

        int[][] table = new int[2][3];

        // Fill the table with random numbers
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (int) (Math.random() * 10);
            }
        }

        // Take the number to search from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int searchNumber = scanner.nextInt();

        // Search for the number in the table
        boolean found = false;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] == searchNumber) {
                    System.out.println("Found at (row, column): (" + i + ", " + j + ")");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Number not found in the table.");
        }

        // Print the table
        System.out.println("Row 0 = " + Arrays.toString(table[0]));
        System.out.println("Row 1 = " + Arrays.toString(table[1]));
    }
}

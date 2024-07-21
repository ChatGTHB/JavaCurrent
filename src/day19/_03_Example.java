package day19;

import java.util.Arrays;
import java.util.Scanner;

public class _03_Example {
    public static void main(String[] args) {
        // Question of the Day: Fill a 3x2 array with numbers taken from the user.
        // Then, assign only the odd elements to a one-dimensional array.

        Scanner scanner = new Scanner(System.in);
        int[][] table = new int[3][2]; // 3 rows, 2 columns

        // Fill the 2D array with user input and count the odd numbers
        int oddCount = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print("Enter a number: ");
                table[i][j] = scanner.nextInt();

                if (table[i][j] % 2 == 1) {
                    oddCount++;
                }
            }
        }

        // Print the 2D array to verify its contents
        System.out.println("Row 0 = " + Arrays.toString(table[0]));
        System.out.println("Row 1 = " + Arrays.toString(table[1]));
        System.out.println("Row 2 = " + Arrays.toString(table[2]));

        // Create a 1D array to hold the odd numbers
        int[] oddNumbers = new int[oddCount];

        // Fill the 1D array with the odd numbers from the 2D array
        int oddIndex = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (table[i][j] % 2 == 1) {
                    oddNumbers[oddIndex] = table[i][j];
                    oddIndex++;
                }
            }
        }

        // Print the 1D array of odd numbers
        System.out.println("Odd numbers = " + Arrays.toString(oddNumbers));
    }
}

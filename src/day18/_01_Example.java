package day18;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Example {
    public static void main(String[] args) {
        // Fill an array of 10 elements with random numbers (including 10),
        // then ask the user to input a number to search for.
        // If the number is found, print its index.

        int[] array = new int[10];  // Define an array with 10 elements

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);  // Fill the array with random numbers from 0 to 10
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search for (0-10): ");
        int searchNumber = scanner.nextInt(); // Get the number to search from the user

        boolean found = false;
        for (int i = 0; i < array.length; i++) { // Check if the number exists in the array
            if (array[i] == searchNumber) {
                System.out.println("Number found at index " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Number not found in the array.");
        }

        System.out.println("Array = " + Arrays.toString(array));
    }
}

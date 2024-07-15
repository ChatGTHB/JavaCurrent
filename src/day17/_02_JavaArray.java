package day17;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        // How to read from and write to an array

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        // Reading values into the array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + i + " of the array: ");
            array[i] = scanner.nextInt();
        }

        // Writing values from the array
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }

        // Using array.length instead of a fixed number ensures that
        // if the size of the array changes, we don't need to update
        // the loop boundaries.
    }
}

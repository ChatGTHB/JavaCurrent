package day20;

import java.util.Arrays;
import java.util.Scanner;

public class _07_JavaMethod {
    public static void main(String[] args) {
        // After filling a 5-element array with the user in the main method,
        // find and print the smallest and largest elements of the array
        // and its average in separate functions.

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a number: ");
            array[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(array));

        printLargest(array);
        printSmallest(array);
        printAverage(array);
    }

    public static void printLargest(int[] array) {
        Arrays.sort(array);
        System.out.println("Largest= " + array[array.length - 1]);
    }

    public static void printSmallest(int[] array) {
        Arrays.sort(array);
        System.out.println("Smallest= " + array[0]);
    }

    public static void printAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        double average = (double) sum / array.length;

        System.out.println("Average= " + average);
    }
}

package day09;

import java.util.Scanner;

public class _07_Example {
    public static void main(String[] args) {
        // Print whether an entered number is an odd number or not.
        // true veya false

        Scanner input = new Scanner(System.in);
        System.out.print("Number= ");
        int number = input.nextInt();

        int remaining = number % 2; // The module always gives the rest

        System.out.println("Is odd number? " + (remaining == 1));  // Method1

        boolean isOdd = (remaining == 1);
        System.out.println("isOdd = " + isOdd);              // Method2
    }
}

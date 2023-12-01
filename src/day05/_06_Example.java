package day05;

import java.util.Scanner;

public class _06_Example {

    public static void main(String[] args) {

        // Print the sum of the 2 integers you receive from the user to the screen.
        Scanner input = new Scanner(System.in);

        System.out.print("Number1 = ");
        int number1 = input.nextInt();

        System.out.print("Number2 = ");
        int number2 = input.nextInt();

        int total = number1 + number2;
        System.out.println("Total = " + total); // Method 1

        System.out.println("Total = " + (number1 + number2)); // Method 2
    }
}

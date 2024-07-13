package day13;

import java.util.Scanner;

public class _06_WhileLoop {
    public static void main(String[] args) {
        // Print the sum of 5 entered integers

        // Steps within the loop:
        // Ask for a number
        // Read the number and add to the sum
        // Increment the counter
        // What is the loop condition?

        Scanner scanner = new Scanner(System.in);

        int counter = 0, sum = 0;

        while (counter < 5) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            sum = sum + number;
            counter++;
        }
        System.out.println("Sum = " + sum);
    }
}

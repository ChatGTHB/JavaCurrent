package day14;

import java.util.Scanner;

public class _02_WhileLoop {
    public static void main(String[] args) {
        // Find the sum of the odd numbers among the 6 numbers entered by the user

        // What will happen inside the loop?
        // Read number, if it's odd then sum = sum + number, counter++
        // Loop condition: counter < 6

        Scanner scanner = new Scanner(System.in);
        int counter = 0, sum = 0;

        while (counter < 6) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number % 2 == 1) // if it's odd
                sum = sum + number;

            counter = counter + 1; // counter++;
        }
        System.out.println("Sum = " + sum);
    }
}

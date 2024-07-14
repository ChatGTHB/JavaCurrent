package day14;

import java.util.Scanner;

public class _03_DoWhile {
    public static void main(String[] args) {
        // Request numbers from the user until they enter 0,
        // and sum the numbers. When 0 is entered, print the total sum.

        // What happens inside the loop?
        // Read number, sum = sum + number,
        // Loop condition: number != 0

        Scanner scanner = new Scanner(System.in);
        int sum = 0, number;

        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        sum = sum + number;

        while (number != 0) {  // Check the condition, then loop
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            sum = sum + number;
        }
        System.out.println("Sum = " + sum);

        // Reset sum for the do-while loop
        sum = 0;

        // do-while loop
        // Execute once without checking the condition, then loop if the condition is met
        do {  // This loop runs once regardless of the condition
            System.out.print("2nd loop - Enter a number: ");
            number = scanner.nextInt();
            sum = sum + number;
        } while (number != 0);

        System.out.println("Sum = " + sum);

        // While: check the condition first, then loop
        // Do-While: execute once, then check the condition, then loop

        // If the check is first, use WHILE
        // If the check is last, use DO_WHILE
    }
}

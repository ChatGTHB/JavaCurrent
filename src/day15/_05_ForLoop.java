package day15;

import java.util.Scanner;

public class _05_ForLoop {
    public static void main(String[] args) {
        // Find the product of numbers up to (and including) a number entered by the user
        // Part 2: Terminate the operation if the product exceeds 10,000.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int limit = scanner.nextInt();

        int product = 1;
        for (int i = 1; i <= limit; i++) {
            product = product * i;  // 1*2*3*4*5...

            if (product > 10000) {
                System.out.println("The product has exceeded 10,000. Loop terminated.");
                break;
            }
        }
        System.out.println("Product = " + product);
    }
}

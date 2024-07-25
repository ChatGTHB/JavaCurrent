package day21;

import java.util.Scanner;

public class _01_JavaMethod {
    public static void main(String[] args) {
        /**
         * Find the sum of numbers up to a number entered by the user
         * in a function and print it from the main method.
         * For example, 5 -> 1+2+3+4+5
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = findSum(number); // Math.max(4, 5);

        System.out.println("Sum = " + sum);
    }

    public static int findSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }
        return sum;
    }
}

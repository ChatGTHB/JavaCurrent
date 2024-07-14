package day15;

import java.util.Scanner;

public class _03_ForLoop {
    public static void main(String[] args) {
        // Find the sum of numbers up to and including a number entered by the user.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number up to which the sum is to be calculated: ");
        int limit = scanner.nextInt();

        int sum = 0;
        // Generally, i or j is used instead of counter
        for (int i = 1; i <= limit; i++) {
            sum = sum + i;
        }
        System.out.println("Sum = " + sum);
    }
}


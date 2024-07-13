package day13;

import java.util.Scanner;

public class _07_WhileLoop {
    public static void main(String[] args) {
        // Find the sum of only the positive numbers among the 6 numbers entered
        Scanner scanner = new Scanner(System.in);
        int counter = 0, sum = 0;

        while (counter < 6) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number > 0) {
                sum = sum + number;
            }
            counter++;
        }
        System.out.println("Sum = " + sum);
    }
}

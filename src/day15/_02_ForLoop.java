package day15;

import java.util.Scanner;

public class _02_ForLoop {
    public static void main(String[] args) {
        // Print the sum of 5 entered integers

        // What happens inside the loop?
        // Read number, sum = sum + number
        // Loop condition: counter <= 5

        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int counter = 1; counter <= 5; counter++) {
            System.out.print("Enter number " + counter + ": ");
            int number = scanner.nextInt();
            sum = sum + number;
        }
        System.out.println("Sum = " + sum);
    }
}

package day14;

import java.util.Scanner;

public class _04_DoWhile {
    public static void main(String[] args) {
        // Write a program that keeps printing "Program is running" until the user enters 'x',
        // and prints "Program finished" when 'x' is entered.

        // What happens inside the loop?
        // Reading input, if it is different from 'x' then printing a message
        // The loop will continue as long as the entered input is different from 'x'

        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Enter a phrase: ");
            input = scanner.next();

            if (!input.equalsIgnoreCase("x")) {
                System.out.println("Program is running");
            }

        } while (!input.equalsIgnoreCase("x"));

        System.out.println("Program finished");
    }
}

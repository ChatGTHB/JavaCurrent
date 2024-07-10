package day11;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {

        // Print whether an entered number is odd or even.

        Scanner input = new Scanner(System.in);

        System.out.println("Number: ");
        int number = input.nextInt();

        // Method 1

        int remain = number % 2;

        if (remain == 0) System.out.println("Even number");
        else System.out.println("Odd number");

        // Method 2

        if (number % 2 == 0) System.out.println("Even number");
        else System.out.println("Odd number");
    }
}

package day11;

import java.util.Scanner;

public class _07_JavaTernary {
    public static void main(String[] args) {
        // Print whether the number to be entered by the user is odd or even.

        Scanner input = new Scanner(System.in);

        System.out.print("Number: ");
        int number = input.nextInt();

        // Normal method
        if (number % 2 == 0) System.out.println("Even");
        else System.out.println("Odd");

        // Short method for if -else
        String result = number % 2 == 0 ? "Yes" : "No";
        // ? if      : NOT
        System.out.println("result = " + result);
    }
}

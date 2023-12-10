package day10;

import java.util.Scanner;

public class _09_IfElse {
    public static void main(String[] args) {

        // If the number entered is positive and an odd number,
        // print the appropriate number on the screen
        // as if the appropriate number has not been entered

        Scanner input = new Scanner(System.in);

        System.out.print("Number: ");
        int number = input.nextInt();

        // int remaind = number%2;

        if (number > 0 && number % 2 == 1) System.out.println("Appropriate number entered.");
        else System.out.println("Appropriate number has not been entered.");
    }
}

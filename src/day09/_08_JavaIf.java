package day09;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {

        // Print whether an entered number is negative or positive.
        // If it is zero, print zero.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number= ");
        int number = input.nextInt();

        if (number > 0) System.out.println("positive");

        if (number < 0) System.out.println("negative");

        if (number == 0) System.out.println("zero");

        // You can always use {} parentheses,
        // but it is not mandatory to use them
        // if there is only one command that will work
        // when the if condition is met.
    }
}

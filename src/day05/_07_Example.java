package day05;

import java.util.Scanner;

public class _07_Example {

    public static void main(String[] args) {

        // Find the perimeter of the field in the form of a square with one side taken from the user and print it.
        Scanner input = new Scanner(System.in);

        System.out.print("One side length of the field =");
        int side = input.nextInt();

        System.out.println("Perimeter = " + (4 * side));
    }
}

package day09;

import java.util.Scanner;

public class _09_JavaIf {
    public static void main(String[] args) {

        // Print the value of the larger of the two entered numbers on the screen;
        // If two numbers are equal, print equally.

        Scanner input = new Scanner(System.in);

        System.out.print("Number1= ");
        int number1 = input.nextInt();

        System.out.print("Number2= ");
        int number2 = input.nextInt();

        if (number1 > number2) System.out.println("Number1 greater= " + number1);

        if (number1 < number2) System.out.println("Number2 greater= " + number2);

        if (number1 == number2) System.out.println("Number1 and Number2 are equal");
    }
}

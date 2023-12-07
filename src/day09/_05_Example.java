package day09;

import java.util.Scanner;

public class _05_Example {
    public static void main(String[] args) {

        // Print whether the 2 numbers entered by the user are equal to each other

        Scanner input = new Scanner(System.in);

        System.out.print("Number1= ");
        int number1 = input.nextInt();

        System.out.print("Number2= ");
        int number2 = input.nextInt();

        System.out.println("Eşit Mi = " + (number1 == number2)); // Method 1

        boolean isEquals = (number1 == number2);
        System.out.println("isEquals = " + isEquals);            // Method 2
    }
}

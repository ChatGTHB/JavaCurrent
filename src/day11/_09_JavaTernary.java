package day11;

import java.util.Scanner;

public class _09_JavaTernary {
    public static void main(String[] args) {

        /**
         *    Question: Print whether an entered number is zero,
         *    negative or positive with the Ternary operator.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Number: ");
        int number = input.nextInt();

        String result = number == 0 ? "Zero" : (number > 0 ? "Pozitive" : "Negative");

        System.out.println("Result = " + result);
    }
}

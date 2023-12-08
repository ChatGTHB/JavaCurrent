package day09;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) { // 1- Start

        // Baklava slice , if
        // If a number entered is greater than 10, "Write greater than 10"
        // 1- Start
        // 2- Read number
        // 3- If the number > is 10, "Print greater than 10"
        // 4- Stop

        // 2- Read number
        Scanner input = new Scanner(System.in);
        System.out.print("Number= ");
        int number = input.nextInt();

        // 3- if number > 10
        if (number > 10) // At the end of the condition; none, normal brackets are a must
        {   // If the condition is met, the department that will work
            System.out.println("Greater than 10"); // Write "Greater than 10"
        } // curly braces

    } // 4- Stop
}

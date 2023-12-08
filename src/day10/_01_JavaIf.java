package day10;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {

        // Print whether an entered number is odd or even
        // Print single or double

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int remain = number % 2;  // What is the remainder of this number?

        if (remain == 0) System.out.println("Even Number");

        if (remain == 1) System.out.println("Odd Number");
    }
}

//        1,3,5,9,1003,57
//        If I divide them by 2, the remainder is 1
//
//        246,1000,40
//        If I divide them by 2, the rest is always 0
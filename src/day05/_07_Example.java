package day05;

import java.util.Scanner;

public class _07_Example {

    public static void main(String[] args) {

        /**
         Ask the user for the required side (int) lengths of a rectangular field, find its perimeter and area, and print it.
         perimeter=a+b+a+b    area =a*b
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter long side: ");
        int longSide = input.nextInt();

        System.out.print("Enter short side: ");
        int shortSide = input.nextInt();

        int perimeter = longSide + longSide + shortSide + shortSide;
        int area = longSide * shortSide;

        System.out.println("The perimeter = " + perimeter);
        System.out.println("The area = " + area);
    }
}
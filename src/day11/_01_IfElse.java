package day11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {

        //  According to a student's grade entered,
        //  if it is 50 and greater than 50, you pass,
        //  if it is smaller, you fail.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your grade:");
        int studentGrade = input.nextInt();

        // Method 1: The computer gets tired in vain
        if (studentGrade >= 50) System.out.println("You've passed, congratulations!");

        if (studentGrade < 50) {
            System.out.println("Sorry, you're stuck");
            System.out.println("We are waiting for you to summer school");
        }

        // Method 2: Should be
        if (studentGrade >= 50) System.out.println("You've passed, congratulations!");
        else // If the up is not a must
            System.out.println("Sorry, you're stuck");
    }
}

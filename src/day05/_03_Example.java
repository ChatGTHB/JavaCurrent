package day05;

import java.util.Scanner;

public class _03_Example {

    public static void main(String[] args) {

        // Take the user's name and surname and print them on the screen
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name and surname :");
        String fullName = input.nextLine();

        System.out.println("fullName : " + fullName);
    }
}
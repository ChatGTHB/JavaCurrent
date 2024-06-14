package day05;

import java.util.Scanner;

public class _04_Example {

    public static void main(String[] args) {

        // Get the user's name and surname separately from the user
        // print them to the screen together.
        Scanner input = new Scanner(System.in);

        System.out.print("Your name:");
        String name = input.nextLine();

        System.out.print("Your surname:");
        String surname = input.nextLine();

        System.out.println("Your name and surname: " + name + " " + surname);
    }
}

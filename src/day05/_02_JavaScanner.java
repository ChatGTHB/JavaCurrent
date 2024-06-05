package day05;

import java.util.Scanner;

public class _02_JavaScanner {

    public static void main(String[] args) {

        // type  name    first value, new car from cars
        Scanner input = new Scanner(System.in);
        // From Computers MyPc = new Computer();
        // System.in: The task of reading input from the keyboard was given

        System.out.print("Enter a number:");  // It was written so that it would be known what was wanted.
        int enteredNumber = input.nextInt(); // This command is waiting for a number to be entered
        // Give me the number you read

        System.out.println("enteredNumber = " + enteredNumber);
        System.out.println("Finished");
    }
}

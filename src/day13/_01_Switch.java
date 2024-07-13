package day13;

import java.util.Scanner;

public class _01_Switch {
    public static void main(String[] args) {

        // After receiving 2 integers from the user,
        // Perform the desired operation according to the following letters received from the user:
        // T for addition, S for subtraction, M for multiplication, D for division,
        // and print the result.

        Scanner scanInt = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);

        System.out.print("1st Number = ");
        int number1 = scanInt.nextInt();  // e.g., 15

        System.out.print("2nd Number = ");
        int number2 = scanInt.nextInt();  // e.g., 3

        System.out.println("For addition, enter A");
        System.out.println("For subtraction, enter S");
        System.out.println("For multiplication, enter M");
        System.out.println("For division, enter D");
        System.out.print("Your choice = ");
        String choice = scanStr.next().toUpperCase(); // T, S, M, D

        switch (choice) {
            case "A":
                System.out.println("Sum = " + (number1 + number2));
                break;
            case "S":
                System.out.println("Difference = " + (number1 - number2));
                break;
            case "M":
                System.out.println("Product = " + (number1 * number2));
                break;
            case "D":
                System.out.println("Quotient = " + ((double) number1 / number2));
                break;
            default:
                System.out.println("Invalid input");
                break;
        }

        // Working principle: if choice equals T, perform the corresponding case and exit (break)
        // default: if none of the above conditions are met, it's like the ELSE of all the cases above
    }
}

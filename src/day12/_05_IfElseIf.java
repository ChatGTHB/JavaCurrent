package day12;

import java.util.Scanner;

public class _05_IfElseIf {
    public static void main(String[] args) {

        // After receiving 2 integers from the user,
        // Perform the desired operation according to the following letters received from the user:
        // S for sum, SU for subtraction, M for multiplication, D for division,
        // and print the result.

        Scanner inputInt = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);

        System.out.print("Number 1: ");
        int number1 = inputInt.nextInt();  // 15

        System.out.print("Number 2: ");
        int number2 = inputInt.nextInt();  // 3

        System.out.println("For sum enter S");
        System.out.println("For subtraction enter SU");
        System.out.println("For multiplication enter M");
        System.out.println("For division enter D");
        System.out.print("Your choice: ");
        String yourChoice = inputStr.next().toUpperCase(); // S, SU, M, D

        if (yourChoice.equals("S")) {
            System.out.println("Sum= " + (number1 + number2));
        } else if (yourChoice.equals("SU")) {
            System.out.println("Subtraction= " + (number1 - number2));
        } else if (yourChoice.equals("M")) {
            System.out.println("Multiplication= " + (number1 * number2));
        } else if (yourChoice.equals("D")) {
            if (number2 != 0) {
                System.out.println("Division= " + ((double) number1 / number2));
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}

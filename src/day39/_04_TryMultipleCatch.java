package day39;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04_TryMultipleCatch {
    public static void main(String[] args) {
        System.out.println("The program has started");

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Number1 = ");
            int number1 = scanner.nextInt();

            System.out.print("Number2 = ");
            int number2 = scanner.nextInt();

            // This will throw an ArithmeticException if number2 is zero
            int division = number1 / number2;
            System.out.println("Result = " + division);

            // Uncomment these lines to generate a general exception (StringIndexOutOfBoundsException)
            // String word = "";
            // char letter = word.charAt(3);

        } catch (InputMismatchException ex) { // Specific exception for incorrect input type
            System.out.println("Please enter a valid number.");
        } catch (ArithmeticException ex) { // Specific exception for division by zero
            System.out.println("Please do not enter zero as the divisor.");
        } catch (Exception ex) { // General exception for all other errors
            System.out.println("An error occurred, please try again.");
        }
        System.out.println("The program has ended");
    }
}


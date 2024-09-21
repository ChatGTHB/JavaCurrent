package day39;

import java.util.Scanner;

public class _02_RuntimeException {
    public static void main(String[] args) {
        System.out.println("The program has started");

        Scanner scanner = new Scanner(System.in);

        try {
            // Try block: this is where you try to execute code that may cause an exception

            System.out.print("Number1 = ");
            int number1 = scanner.nextInt();  // Taking the first number as input

            System.out.print("Number2 = ");
            int number2 = scanner.nextInt();  // Taking the second number as input

            // Division operation that might cause an ArithmeticException (e.g., divide by zero)
            int divisionResult = number1 / number2;
            System.out.println("division result = " + divisionResult);

        } catch (Exception error) {
            // Catch block: if any exception occurs in the try block, this block will execute
            System.out.println("An error occurred");
            System.out.println(error);  // Print the error message
        }
        System.out.println("The program has ended");
    }
}

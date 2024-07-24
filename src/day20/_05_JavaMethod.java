package day20;

import java.util.Scanner;

public class _05_JavaMethod {
    public static void main(String[] args) {
        // Print the larger of the two entered numbers.
        printLargest();  // This method will read and print
        printLargest();

        printLargest(56, 70); // Using multiple parameters
    }

    public static void printLargest(int num1, int num2) {
        if (num1 > num2) System.out.println(num1 + " is larger");
        else if (num2 > num1) System.out.println(num2 + " is larger");
        else System.out.println("Both numbers are equal");
    }

    public static void printLargest() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2 = scanner.nextInt();

        // Call the overloaded method to print the largest number
        printLargest(num1, num2);
    }
}

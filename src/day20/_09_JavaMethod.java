package day20;

import java.util.Scanner;

public class _09_JavaMethod {
    public static void main(String[] args) {
        // Find the larger of the two numbers entered by the user and print it in the main method.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the 2nd number: ");
        int num2 = scanner.nextInt();

        // int max = Math.max(num1, num2);

        int max = findLargest(num1, num2); // takes input, returns a value
        System.out.println("The largest number is: " + max);
    }

    public static int findLargest(int n1, int n2) {
        return (n1 > n2 ? n1 : n2);
    }
}

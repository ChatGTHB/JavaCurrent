package day11;

import java.util.Scanner;

public class _03_Example {
    public static void main(String[] args) {
        // Find out if 2 int numbers entered next to each other
        // with a space between them are equal to each other
        // 456 67

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 2 numbers with 1 space next to each other: ");
        String stringNumbers = input.nextLine(); //4567 6

        int spaceIndex = stringNumbers.indexOf(" ");
        String stringNumber1 = stringNumbers.substring(0, spaceIndex);
        String stringNumber2 = stringNumbers.substring(spaceIndex + 1);

        int number1 = Integer.parseInt(stringNumber1);
        int number2 = Integer.parseInt(stringNumber2);

        if (number1 == number2) System.out.println("Equal");
        else System.out.println("Not Equal");

        // Method 2
        if (stringNumber1.equals(stringNumber2)) System.out.println("Equal");
        else System.out.println("Not Equal");
    }
}

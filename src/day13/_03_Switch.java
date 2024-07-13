package day13;

import java.util.Scanner;

public class _03_Switch {
    public static void main(String[] args) {

        // Print the value of the ones place of a given number in words.
        // For example:
        // 234  -> ones place -> 4  -> four
        //  45  -> five
        //   6  -> six

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int number = scan.nextInt();

        int onesPlace = number % 10;

        switch (onesPlace) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
        }
    }
}

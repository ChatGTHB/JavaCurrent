package day13;

import java.util.Scanner;

public class _04_Switch {
    public static void main(String[] args) {
        // Print the number of days in the month corresponding to the entered month number.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Month number = ");
        int monthNo = scanner.nextInt();

        switch (monthNo) {
            case 1:
                System.out.println(31);
                break;
            case 2:
                System.out.println(28);
                break;
            case 3:
                System.out.println(31);
                break;
            case 4:
                System.out.println(30);
                break;
            case 5:
                System.out.println(31);
                break;
            case 6:
                System.out.println(30);
                break;
            case 7:
                System.out.println(31);
                break;
            case 8:
                System.out.println(31);
                break;
            case 9:
                System.out.println(30);
                break;
            case 10:
                System.out.println(31);
                break;
            case 11:
                System.out.println(30);
                break;
            case 12:
                System.out.println(31);
                break;
            default:
                System.out.println("Invalid Month Number");
        }

        // Alternative approach
        switch (monthNo) {
            case 2:
                System.out.println(28);
                break;

            case 3:
            case 1:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31);
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;

            default:
                System.out.println("Invalid Month Number");
        }
    }
}

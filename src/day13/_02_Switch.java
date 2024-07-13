package day13;

import java.util.Scanner;

public class _02_Switch {
    public static void main(String[] args) {
        // Print the name of the day corresponding to the day number entered by the user.

        Scanner scan = new Scanner(System.in);
        System.out.print("Day number = ");
        int dayNo = scan.nextInt();

//        if (dayNo == 1)
//            System.out.println("Monday");
//        else
//            if (dayNo == 2)
//                System.out.println("Tuesday");

        switch (dayNo) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}

package day11;

import java.util.Scanner;

public class _05_Example {
    public static void main(String[] args) {

        /**
         Parking fees :
         It is 50 TL for up to 3 hours, 100 TL for up to 5 hours, and 120 TL for more than 5.
         Print the fee by taking the number of hours left from the user

         If it's < 3 o'clock, write 50 TL
         If > hour = 3 and < hour is 5, write 100 TL
         If the hour is > = 5, write 120 TL
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Your stay in the parking lot: ");
        int hour = input.nextInt();

        // Method2
        if (hour < 3) System.out.println("Fee = 50 TL");
        if (hour >= 3 && hour < 5) System.out.println("Fee = 100 TL");
        if (hour >= 5) System.out.println("Fee = 120 TL");

        // Method2
        if (hour < 3) System.out.println("Fee = 50 TL");
        else {
            if (hour < 5) System.out.println("Fee = 100 TL");
            else System.out.println("Fee = 120 TL");
        }
    }
}

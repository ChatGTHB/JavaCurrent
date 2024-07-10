package day11;

import java.util.Scanner;

public class _10_JavaTernary {
    public static void main(String[] args) {

        // Parking fees: (Do it with the ternary operator.)
        // 50 TL for up to 3 hours, 100 TL for up to 5 hours, 120 TL for more than 5 hours.
        // Print the fee by taking the number of hours left from the user

        // If hour is < 3, write 50 TL
        // If  hour is >= 3 and hour is < 5, write 100 TL
        // If the hour is >= 5, write 120 TL

        Scanner input = new Scanner(System.in);
        System.out.print("Hour: ");
        int hour = input.nextInt();

        // As string    ? -> if      : -> else
        String stringFee = (hour < 3 ? "50 tl" : (hour < 5 ? "100tl" : "120tl"));
        System.out.println("stringFee = " + stringFee);

        // As int
        int fee = (hour < 3 ? 50 : (hour < 5 ? 100 : 120));
        System.out.println("fee = " + fee + " tl");
    }
}









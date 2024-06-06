package day06;

import java.util.Scanner;

public class _05_Example {

    public static void main(String[] args) {

        /**
         Take the address information from the user
         as Street (string), Street (string), Postcode (int),
         Country (string) and Owner (boolean) and print it on one line.
         */

        Scanner inputString = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);
        Scanner intBoolean = new Scanner(System.in);

        System.out.print("Street: ");
        String street = inputString.nextLine();

        System.out.print("Alley: ");
        String alley = inputString.nextLine();

        System.out.print("Post Code: ");
        int postCode = inputInt.nextInt();

        System.out.print("Country: ");
        String country = inputString.nextLine();

        System.out.print("Are you a home owner? (True/Falsed): ");
        boolean owner = intBoolean.nextBoolean();

        System.out.println(street + " " + alley + " " + postCode + " " + country + " " + owner);
    }
}

package day11;

import java.util.Scanner;

public class _08_JavaTernary {
    public static void main(String[] args) {

        /**
         Task: If the number entered is greater than 50, print the value "Greater",
         if not, print the "Not" value on the screen. Do it with the ternary operator.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        String result = number > 50 ? "Great" : "Not Great";

        System.out.println("result = " + result);

        // int intResult= number > 50 ? 1 : 0;
        // boolean booleanResult= number > 50 ? true : false;
    }
}

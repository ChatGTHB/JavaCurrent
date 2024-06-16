package day06;

import java.util.Scanner;

public class _04_Example {

    public static void main(String[] args) {

        /**
         Ask the user whether they are a student; If the answer is yes, answer True;
         otherwise, answer False and print the answer received.
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Are you student ? = ");
        boolean answer = input.nextBoolean(); // True,true or False,false

        System.out.println("answer = " + answer);
    }
}

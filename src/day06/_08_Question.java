package day06;

import java.util.Scanner;

public class _08_Question {

    public static void main(String[] args) {

        // Print only the last letter of an entered string.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence = ");
        String sentence = input.nextLine();

        int length = sentence.length();
        char lastLetter = sentence.charAt(length - 1); // LAST LETTER
        System.out.println("lastLetter = " + lastLetter);
    }
}

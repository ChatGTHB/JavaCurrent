package day06;

import java.util.Scanner;

public class _08_Question {
    public static void main(String[] args) {

        // Print only the last letter of an entered string.

        Scanner oku = new Scanner(System.in);
        System.out.print("Cümle giriniz=");
        String sentence = oku.nextLine();

        int length = sentence.length();
        char lastLetter = sentence.charAt(length - 1); // LAST LETTER
        System.out.println("lastLetter = " + lastLetter);
    }
}

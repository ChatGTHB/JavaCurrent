package day11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {

        // If the length of a string is greater than 10 and the word "study" (upper or lower) is mentioned in the string,
        // print yes on the screen, otherwise print no.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        // If the sentence is greater than 10 characters AND the word study is in it
        // Write YES
        // Not
        // Write NO

        // Method 1
        if (sentence.length() > 10 && sentence.toLowerCase().contains("study")) System.out.println("YES");
        else System.out.println("NO");

        // Method 2
        int length = sentence.length();
        boolean isThere = sentence.toLowerCase().contains("study");

        if (length > 10 && isThere) System.out.println("YES");
        else System.out.println("NO");
    }
}

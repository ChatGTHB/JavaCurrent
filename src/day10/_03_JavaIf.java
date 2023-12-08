package day10;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {

        // Find out if the letter a is mentioned in a sentence entered,
        // if it is passed, print YES, if not, print NO

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        // Method 1

        boolean isThere = sentence.contains("a");

        if (isThere) System.out.println("YES");

        if (!isThere) System.out.println("NO");

        // Method 2

        if (sentence.contains("a")) System.out.println("YES");

        if (!sentence.contains("a")) System.out.println("NO");

        // Method 3

        boolean isThere2 = sentence.contains("a");

        if (isThere2)     // isThere==true  isThere
            System.out.println("YES");

        if (!isThere2) System.out.println("NO");


        // Method 4

        if (sentence.contains("a")) System.out.println("YES");

        if (!sentence.contains("a")) System.out.println("NO");
    }
}







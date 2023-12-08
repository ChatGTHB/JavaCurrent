package day10;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {

        // Print whether there is a lowercase or uppercase letter a in an entered sentence.
        // In the form of YES or NO

        //        weather  -> Say YES
        //        WEATHER  -> Say YES

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        sentence = sentence.toUpperCase();

        if (sentence.contains("A")) System.out.println("YES");

        if (!sentence.contains("A")) System.out.println("NO");


        /********* Different Method  ******************/

        String sentenceWithoutA = sentence.replace("A", "").replace("a", "");
        // String sentenceWithoutA = sentence.replaceAll("[aA]","");

        if (sentenceWithoutA.length() == sentence.length()) System.out.println("NO");

        if (sentenceWithoutA.length() != sentence.length()) System.out.println("YES");
    }
}






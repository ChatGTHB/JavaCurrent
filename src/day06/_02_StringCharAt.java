package day06;

public class _02_StringCharAt {

    public static void main(String[] args) {

        // charAt(index) ; Returns the character at the desired point
        //                      111
        //            0123456789012
        String sentence = "Hello World!"; // length 13
        System.out.println("sentence.length() = " + sentence.length());

        char firstLetter = sentence.charAt(0); // 0 room number, that is, indexed character
        System.out.println("The first letter = " + firstLetter);
    }
}
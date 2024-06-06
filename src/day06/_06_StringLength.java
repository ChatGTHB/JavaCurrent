package day06;

public class _06_StringLength {

    public static void main(String[] args) {

        // StringLength -> gives the length of a String (how many letters there are)

        String sentence = "It's very rainy today"; // A space is like a letter.

        int length = sentence.length(); // Returns the number of letters in the value in the sentence.

        System.out.println("Length = " + length);
        System.out.println("Length2 = " + sentence.length()); // The second option
    }
}

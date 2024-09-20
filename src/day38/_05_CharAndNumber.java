package day38;

public class _05_CharAndNumber {
    public static void main(String[] args) {
        // char is actually represented by numbers behind the scenes, based on the ASCII table.

        char firstLetter = 'A';
        int number = 65;
        char letter2 = (char) number; // Converts the number to the corresponding character in the ASCII table.

        System.out.println("firstLetter = " + firstLetter);  // Output: A
        System.out.println("letter2 = " + letter2);  // Output: A

        // In the ASCII table, uppercase letters (A-Z) are followed by lowercase letters (a-z) with a difference of 32.
        char letter3 = (char) 97;  // ASCII value 97 corresponds to 'a'
        System.out.println("letter3 = " + letter3);  // Output: a

        // Display the characters corresponding to numbers from 0 to 255 in the ASCII table
        for (int i = 0; i <= 255; i++) {
            char letter = (char) i;  // Convert the number to its ASCII character equivalent
            System.out.println(i + ". character = " + letter);  // Print the number and corresponding character
        }
    }
}

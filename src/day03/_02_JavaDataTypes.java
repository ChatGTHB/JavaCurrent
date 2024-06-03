package day03;

public class _02_JavaDataTypes {

    public static void main(String[] args) {

        int number; // allocates int space in memory, only integers are discarded

        // Integers
        byte byteValue = 7;              // Used for numbers between -128 and 127
        short shortValue = 1645;         // Between -32000 and 32000
        int intValue = 2500000;          // -2.5 million, +2.5 million, when java sees a number it thinks int directly, DEFAULT
        long longValue = 3333444444444L; // Since it accepts numbers as int by default
        // For long numbers, l should be placed at the absolute end.

        // Fractional and decimal numbers
        double doubleValue = 3.14343455555667777; // There is 16 digit precision after the point, DEFAULT
        float floatValue = 3.141233f;             // Since it is called an unstable variable, although it takes up little space, it is not preferred

        // word, letter
        char firstLetter = 'A';   // letters are written between single quotes
        String name = "Joseph";    // Since the words are fixed, they are written between double quotes,

        // If soutv is selected when you press so, it understands that the variable will be written and prints it in format.
        System.out.println("byteValue = " + byteValue);
        System.out.println("shortValue = " + shortValue);
        System.out.println("intValue = " + intValue);
        System.out.println("longValue = " + longValue);

        System.out.println("doubleValue = " + doubleValue);
        System.out.println("floatValue = " + floatValue);

        System.out.println("firstLetter = " + firstLetter);
        System.out.println("name = " + name);
    }
}

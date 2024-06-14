package day03;

public class _01_Variables {

    public static void main(String[] args) {

        // ctrl+alt+l corrects text

        int total; // It is not mandatory to give an initial value when defining a variable
        int counter = 0; // initial value can be given when defining a variable
        System.out.println(counter);

        counter = counter + 2;  // 2
        System.out.println("counter=" + counter); // counter=2
        // If the + sign is between numbers, it adds
        // If the + sign is used with a word, it adds it next to it.

        System.out.println(); // post processing line, there is no action here, then go to the next line
        System.out.println("hello!");  // Writes fixed text to the screen
        System.out.println("counter"); // Writes the word fixed counter on the screen
        System.out.println(counter); // Writes the value of the variable named counter to the screen

        System.out.println("counter=" + counter);
    }
}
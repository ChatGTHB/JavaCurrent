package day13;

public class _05_WhileLoop {
    public static void main(String[] args) {
        // Print "hello" 5 times on the screen
        // 1- counter = 0;
        // 2- print "hello"
        // 3- counter = counter + 1
        // 4- if counter < 5 => go to step 2

        int counter = 0;

        while (counter < 5) {  // loop as long as the condition is true
            System.out.println("hello");
            counter = counter + 1;   // counter++;
        }
        System.out.println("Program finished.");
    }
}

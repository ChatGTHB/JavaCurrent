package day15;

public class _01_ForLoop {
    public static void main(String[] args) {
        // Print the numbers from 1 to 5 on the screen.

        int counter = 1;
        while (counter <= 5) {
            System.out.println("counter while = " + counter);
            counter++;
        }

        // The creators of Java said
        // if the start, end, and increment values of a loop are known,
        // there is an easier way.
        for (counter = 1; counter <= 5; counter++) // 65%
            System.out.println("counter for = " + counter);

        // Loop Rule:
        // If the number of iterations of a loop is known: FOR
        // If the number of iterations of a loop is NOT known: WHILE
        // If the check is at the END of the loop: DO_WHILE
    }
}

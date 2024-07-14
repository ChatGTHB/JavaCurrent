package day15;

public class _04_ForLoop {
    public static void main(String[] args) {
        // Find the sum of even numbers from 1 to 100.
        // Also, print "You have exceeded 60" when the sum exceeds 60.
        // Stop the loop when the sum exceeds 60.

        // Loop parameters:
        // Start value: 2
        // End value: 100
        // Increment value: 2

        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += i;

            if (sum > 60) {
                System.out.println("You have exceeded 60");
                break; // break stops the loop when executed
            }
        }
        System.out.println("Sum = " + sum);
    }
}

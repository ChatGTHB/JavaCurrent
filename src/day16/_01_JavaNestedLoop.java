package day16;

public class _01_JavaNestedLoop {
    public static void main(String[] args) {
        // Print the following pattern using a single star:
        //  *****
        //  *****
        //  *****
        //  *****
        //  *****

        // The outer loop runs 5 times, creating 5 rows
        for (int row = 1; row <= 5; row++) {
            // The inner loop runs 5 times for each row, creating 5 columns
            for (int col = 1; col <= 5; col++) {
                System.out.print("*");// This will run 25 times
            }
            // Move to the next line after printing 5 stars
            System.out.println();
        }
    }
}

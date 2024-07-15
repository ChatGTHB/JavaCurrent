package day16;

public class _02_JavaNestedLoop {
    public static void main(String[] args) {
        // Write a program that produces the following output using only one star:
        // *        1st row has 1 star
        // **       2nd row has 2 stars
        // ***      3rd row has 3 stars
        // ****     4th row has 4 stars
        // *****    5th row has 5 stars

        // The outer loop runs 5 times, creating 5 rows
        for (int row = 1; row <= 5; row++) {
            // The inner loop runs 'row' times, printing the number of stars equal to the row number
            for (int col = 1; col <= row; col++) {
                System.out.print("*");// This will run 25 times
            }
            // Move to the next line after printing the stars for the current row
            System.out.println();
        }
    }
}

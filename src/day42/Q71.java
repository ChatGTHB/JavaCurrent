package day42;

public class Q71 {
    public static void main(String[] args) {
        // Create a 2D array with 2 rows and varying column lengths
        int[][] arr = new int[2][];
        arr[0] = new int[]{1, 3, 5, 7}; // Initialize the first row
        arr[1] = new int[]{1, 3};       // Initialize the second row

        // Print the number of rows
        System.out.println("Number of rows in arr: " + arr.length);

        // Print the length of each row
        System.out.println("Length of row 0: " + arr[0].length);
        System.out.println("Length of row 1: " + arr[1].length);

        // Iterate over the rows of the array
        for (int[] row : arr) {
            // For each row, print elements up to the number of rows (arr.length)
            for (int i = 0; i < arr.length; i++) {
                // Ensure we don't access elements out of bounds
                if (i < row.length) {
                    System.out.print(row[i] + " ");
                }
            }
            // Uncomment the line below if you'd like to print each row on a new line
            // System.out.println();
        }
    }
}

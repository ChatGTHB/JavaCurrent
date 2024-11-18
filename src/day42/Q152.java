package day42;

public class Q152 {
    public static void main(String[] args) {

        int[][] n = {{1, 3},  // Row 0
                {2, 4}}; // Row 1

        for (int i = n.length - 1; i >= 0; i--) { // Loop through rows in reverse order: i = 1, 0

            for (int y : n[i]) { // Enhanced for loop through elements of the current row
                System.out.print(y);  // Prints: 2, 4, 1, 3 (from the last row to the first)
            }
        }
    }
}

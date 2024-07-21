package day19;

public class _01_Example {
    public static void main(String[] args) {
        // Fill a 2x5 table with random numbers up to 100.
        // After filling the table, find out how many odd numbers it contains.

        int[][] table = new int[2][5];

        // Fill the table with random numbers
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                table[row][col] = (int) (Math.random() * 100); // Executes 10 times
            }
        }

        int oddCount = 0; // Variable to count the number of odd numbers
        // Count the odd numbers in the table
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                if (table[row][col] % 2 == 1) {
                    oddCount++;
                }
            }
        }

        System.out.println("Number of odd numbers = " + oddCount);
    }
}

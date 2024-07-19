package day18;

public class _06_Example {
    public static void main(String[] args) {
        // Fill a 2x3 table with random numbers up to 100
        // Print the table after filling it

        int[][] table = new int[2][3];  // 2x3 table

        // Fill the table with random numbers up to 100
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (int) (Math.random() * 100);
            }
        }

        // Print the filled table
        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table[row].length; column++) {
                System.out.print(table[row][column] + "\t");
            }
            System.out.println();
        }
    }
}


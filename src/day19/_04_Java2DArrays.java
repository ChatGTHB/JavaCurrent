package day19;

import java.util.Arrays;

public class _04_Java2DArrays {
    public static void main(String[] args) {
        int[][] table = new int[2][3]; // 2 rows and 3 columns array

        // Different row sizes can be defined using this way
        int[][] table2 = {
                {2, 8},
                {22, 33, 44, 5, 6, 7, 8},
                {3, 4, 5, 6, 6, 7}
        };

        // table2[0] = new int[9]; // You can also redefine any row with a different size if needed.

        // Print each element of table2
        for (int i = 0; i < table2.length; i++) {
            for (int j = 0; j < table2[i].length; j++) {
                System.out.print(table2[i][j] + "\t");
            }
            System.out.println();
        }

        // Print each row of table2
        System.out.println("Row 0 = " + Arrays.toString(table2[0]));
        System.out.println("Row 1 = " + Arrays.toString(table2[1]));
        System.out.println("Row 2 = " + Arrays.toString(table2[2]));
    }
}

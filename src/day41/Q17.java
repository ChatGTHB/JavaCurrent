package day41;

public class Q17 {
    public static void main(String[] args) {
        int[][] arr = new int[2][4];

        arr[0] = new int[]{1, 3, 5, 7}; // row 0
        arr[1] = new int[]{1, 3};       // row 1

        // Traditional for loop
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");

            System.out.println();
        }

        System.out.println("-----------");

        // Enhanced for loop
        for (int[] row : arr) {
            for (int element : row)
                System.out.print(element + " ");

            System.out.println();
        }
    }
}

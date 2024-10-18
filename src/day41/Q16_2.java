package day41;

public class Q16_2 {
    public static void main(String[] args) {
        int cnt = 0;
        String[][] arr = {
                {"A", "B", "C"},   // row 0
                {"D", "E"}         // row 1
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " "); // A, B

                if (arr[i][j].equals("B")) { // When it reaches "B", break is triggered, it exits the inner loop
                    break;
                }
            }
            continue;
        }

    }
}
// Output: A B D E

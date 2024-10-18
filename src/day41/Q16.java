package day41;

public class Q16 {
    public static void main(String[] args) {
        int cnt = 0;
        String[][] arr = {{"A", "B", "C"},   // row 0
                {"D", "E"}         // row 1
        };

        for (int i = 0; i < arr.length; i++) {  // row 0
            for (int j = 0; j < arr[i].length; j++) {  // columns 0,1,2
                System.out.print(arr[i][j] + " "); // A, B, C, D, E

                if (arr[i][j].equals("B")) {
                    continue; // no effect
                }
            }
            continue; // no effect
        }
    }
}

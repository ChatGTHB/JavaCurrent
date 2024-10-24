package day41;

public class Q54 {
    public static void main(String[] args) {
        int cnt = 0;
        String[][] arr = {{"A", "B", "C"}, {"D", "E"}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " "); // A, B, D, E

                if (arr[i][j].equals("B")) {
                    break;
                }
            }
            continue; // no effect
        }
    }
}

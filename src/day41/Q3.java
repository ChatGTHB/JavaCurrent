package day41;

public class Q3 {
    public static void main(String[] args) {
        int num[][] = new int[1][3];  // row index: 0, column index: 0,1,2

        // assigning values
        for (int i = 0; i < num.length; i++) {

            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = 10;  // 0,0   0,1    0,2
            }
        }

        // printing
        for (int i = 0; i < num.length; i++) {

            for (int j = 0; j < num[i].length; j++) {
                System.out.println(i + "," + j + "=" + num[i][j]);  // 0,0   0,1    0,2
            }
        }
    }
}

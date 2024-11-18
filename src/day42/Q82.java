package day42;

public class Q82 {
    public static void main(String[] args) {
        String[][] chs = new String[2][]; // 2 rows, columns are not specified
        chs[0] = new String[2];  // 2 columns, the 0th row has 2 columns
        chs[1] = new String[5];  // 5 columns, the 1st row has 5 columns
        int i = 97;

        for (int a = 0; a < chs.length; a++) {  // Loop over 2 rows
            for (int b = 0; b < chs.length; b++) { // Loop over 2 columns
                chs[a][b] = "" + i;
                i++;
            }
        }

        for (String[] ca : chs) { // Enhanced for loop over rows
            for (String c : ca) { // Enhanced for loop over columns
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}

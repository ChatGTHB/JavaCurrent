package day42;

public class Q18 {
    public static void main(String[] args) {
        String[][] chs = new String[5][2];
        chs[0] = new String[2];
        chs[1] = new String[5];
        int i = 97;

        System.out.println("chs.length = " + chs.length); // Prints 5

        for (int a = 0; a < chs.length; a++) { // a goes up to 5
            for (int b = 0; b < chs[a].length; b++) { // Use chs[a].length instead of chs.length
                chs[a][b] = "" + (char)i; // Convert i to char for ASCII letters
                i++;
            }
        }

        for (String[] ca : chs) {
            for (String c : ca) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}

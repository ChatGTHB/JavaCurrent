package day42;

public class S18 {

    public static void main(String[] args) {

        String[][] chs = new String[5][2]; // dizinin adı.length :satır sayısı
        chs[0] = new String[2];  // 0 ı yeniledim
        chs[1] = new String[5];  // 1 yeniledim
        int i = 97;

        System.out.println("chs.length = " + chs.length); //5

        for (int a = 0; a < chs.length; a++) {  // a 5 e kadar gider
            for (int b = 0; b < chs.length; b++) { //b 5 e kadar gider
                chs[a][b] = "" + i;
                i++;
            }
        }

        for (String[] ca : chs) {
            for (String c : ca) {
                System.out.println(c + " ");
            }
            System.out.println();
        }
    }
}

package day19;

import java.util.Arrays;

public class _04_Java2DArrays {

    public static void main(String[] args) {

        int[][] tablo = new int[2][3];

        int[][] tablo2 = // farklı satır boyutları ancak bu tanımlama şekli ile oluşturulabilir.
                {{2, 8}, {22, 33, 44, 5, 6, 7, 8}, {3, 4, 5, 6, 6, 7}};

        //tablo2[0]=new int[9];  // ya da herhangi bir satırı yeniden istediğiniz boyutla verebilirsiniz.

        for (int i = 0; i < tablo2.length; i++) {

            for (int j = 0; j < tablo2[i].length; j++)
                System.out.print(tablo2[i][j] + "\t");

            System.out.println();
        }

        System.out.println("0.satır = " + Arrays.toString(tablo2[0]));
        System.out.println("1.satır = " + Arrays.toString(tablo2[1]));
        System.out.println("2.satır = " + Arrays.toString(tablo2[2]));
    }
}

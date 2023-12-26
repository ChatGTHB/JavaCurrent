package day18;

import java.util.Scanner;

public class _03_2DArrays {

    public static void main(String[] args) {

        // 2 Boyutlu dizi (2D Arrays) nedir ?
        int sayi = 0;  // 1 tane sayı tutar

        int[] dizi = new int[10]; // 10 tane sayı tutar, apartman

        int[] ders1Notlar = new int[50];  // ayrı ayrı 50
        int[] ders2Notlar = new int[50];  // ayrı ayrı 50
        int[] ders3Notlar = new int[50];  // ayrı ayrı 50

        // 3 tane 50 yi tek kalemde tek değişkende nasıl tanımlarım
        int[][] tumDersNotlar = new int[3][50];  // 3 tane 50, yukarıdaki ile aynı, site

        //       [satır][sütun]
        tumDersNotlar[0][0] = 80;  // 2 indexle eleman ulaşılır, bu ilk elemanı

        System.out.println("tumDersNotlar = " + tumDersNotlar[0][0]);

        Scanner oku = new Scanner(System.in);
        tumDersNotlar[0][0] = oku.nextInt();
    }
}

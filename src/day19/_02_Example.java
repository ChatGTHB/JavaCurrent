package day19;

import java.util.Arrays;
import java.util.Scanner;

public class _02_Example {
    public static void main(String[] args) {

        // 2x3 lük bir tabloyu random 10 a kadar sayılarla doldurunuz.
        // Daha sonra kullanıcıdan bir sayı alınız.
        // Bu sayı tabloda var ise yerini (satir,sütun) yazdırınız.

        int[][] tablo = new int[2][3];

        //doldurma
        for (int i = 0; i < tablo.length; i++) {

            for (int j = 0; j < tablo[i].length; j++)
                tablo[i][j] = (int) (Math.random() * 10);
        }
        // aranacak sayı kullanıcıdan alındı
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int arananSayi = oku.nextInt();

        // sayı tüm tablo elemanlarında arandı
        for (int i = 0; i < tablo.length; i++) {

            for (int j = 0; j < tablo[i].length; j++)
                if (tablo[i][j] == arananSayi) {
                    System.out.println("satir,sütun=" + i + "," + j);
                }
        }

        //tablonun fotoğrafı yazıldı
        System.out.println("0.Satır = " + Arrays.toString(tablo[0]));
        System.out.println("1.Satır = " + Arrays.toString(tablo[1]));
    }
}

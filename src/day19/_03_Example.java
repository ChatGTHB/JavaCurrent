package day19;

import java.util.Arrays;
import java.util.Scanner;

public class _03_Example {

    public static void main(String[] args) {

        // Günün Sorusu :  3x2 lik bir diziyi kullanıcıdan sayı alarak doldurun
        // Sonra sadece tek elemenlarını tek boyutlu bir diziye atayınız.

        Scanner oku=new Scanner(System.in);
        int[][] tablo=new int[3][2]; // 3 satır 2 sütun
        // kullanıcıdan dolduralım bunu

        int tekMiktar=0;
        for (int i = 0; i < tablo.length; i++) {

            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print("Sayı giriniz=");
                tablo[i][j]=oku.nextInt();

                if ( tablo[i][j] % 2 == 1)
                    tekMiktar++;
            }

        }

        // tabloyu yazdıralım, bakalım
        System.out.println("0.Satır = " + Arrays.toString(tablo[0]));
        System.out.println("1.Satır = " + Arrays.toString(tablo[1]));
        System.out.println("2.Satır = " + Arrays.toString(tablo[2]));

        // içindeki tek sayıları
        int[] tekler=new int[tekMiktar];  // buna doldurun

        int teklerIndex=0;
        for (int i = 0; i < tablo.length; i++) {

            for (int j = 0; j < tablo[i].length; j++)
                if ( tablo[i][j] % 2 == 1)
                {
                    tekler[teklerIndex]=tablo[i][j];
                    teklerIndex++;
                }
        }
        System.out.println("tekler = " + Arrays.toString(tekler));
    }
}

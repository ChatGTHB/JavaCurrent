package day21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _05_ArrayList_Example {

    public static void main(String[] args) {

        /**
         Kullanıcıdan alacağınız 6 elemanlı(sayı) bir dizinin
         sadece tek sayı olan elemanlarını ayrı diziye(liste)(ArrayList) atayarak
         yazdırınız.
         */

        Scanner oku = new Scanner(System.in);
        int[] dizi = new int[6];

        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Sayı=");
            dizi[i] = oku.nextInt();
        }

        System.out.println("dizi = " + Arrays.toString(dizi));

        ArrayList<Integer> tekler = new ArrayList<>();

        for (int i = 0; i < dizi.length; i++) {

            if (dizi[i] % 2 == 1) tekler.add(dizi[i]);
        }

        //1.yol fotoğraf
        System.out.println("tekler = " + tekler);

        //2.yol tek tek elemanları
        for (int i = 0; i < tekler.size(); i++)
            System.out.print(tekler.get(i) + "\t");

    }
}

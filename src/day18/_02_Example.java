package day18;

import java.util.Arrays;

public class _02_Example {

    public static void main(String[] args) {

        // 10 elemanlı bir diziyi random(10 dahil sayılarla) doldurduktan sonra,
        // dizide kaç tek ve kaç çift olduğunu bulunuz

        int[] dizi = new int[10];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 11);
        }

        int tekMiktar = 0, ciftMiktar = 0;

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] % 2 == 0) {
                ciftMiktar++;    // ciftMiktar = ciftMiktar + 1;
            } else tekMiktar++;  // tekMiktar = tekMiktar + 1;
        }

        System.out.println("dizi = " + Arrays.toString(dizi));
        System.out.println("tekMiktar = " + tekMiktar);
        System.out.println("ciftMiktar = " + ciftMiktar);
    }
}

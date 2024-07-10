package day17;

import java.util.Arrays;

public class _05_JavaArrayMethods {
    public static void main(String[] args) {
        String[] isimler = {"Ahmet", "Zeynep", "Roman", "Cihan"};

        //diiyi ekrana direk yazdırmak
        System.out.println("isimler = " + Arrays.toString(isimler));

        //dizi sıralama
        Arrays.sort(isimler);
        System.out.println("isimler = " + Arrays.toString(isimler));

        int[] a = {1, 8, 65, 45};
        Arrays.sort(a);
        System.out.println("en küçük = " + a[0]);
        System.out.println("en büyük = " + a[a.length - 1]);

        // Elemanları hızlı doldurma aynı değerle
        Arrays.fill(a, 5); // hepsine 5 doldur
        System.out.println("a = " + Arrays.toString(a));
    }
}

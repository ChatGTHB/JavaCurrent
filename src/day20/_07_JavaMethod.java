package day20;

import java.util.Arrays;
import java.util.Scanner;

public class _07_JavaMethod {
    public static void main(String[] args) {

        // Kullanıcı ile 5 elemanlı bir diziyi mainde doldurduktan sonra,
        // dizinin en küçük ve en büyük elemanı ile
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız

        Scanner oku = new Scanner(System.in);
        int[] dizi = new int[5];

        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Sayı giriniz: ");
            dizi[i] = oku.nextInt();
        }

        System.out.println(Arrays.toString(dizi));

        enBuyukYaz(dizi);
        enKucukYaz(dizi);
        ortalamaYaz(dizi);
    }

    public static void enBuyukYaz(int[] dizi) {
        Arrays.sort(dizi);
        System.out.println("En büyük= " + dizi[dizi.length - 1]);
    }

    public static void enKucukYaz(int[] dizi) {
        Arrays.sort(dizi);
        System.out.println("En küçük= " + dizi[0]);
    }

    public static void ortalamaYaz(int[] dizi) {

        int toplam = 0;
        for (int i = 0; i < dizi.length; i++)
            toplam = toplam + dizi[i];

        int ort = toplam / dizi.length;

        System.out.println("ort = " + ort);
    }
}

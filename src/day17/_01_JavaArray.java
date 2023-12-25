package day17;

import java.util.Scanner;

public class _01_JavaArray {
    public static void main(String[] args) {

        // 50 kişilik bir sınıfın notlarını giriniz, ortalamadan büyük
        // kaç not olduğunu bulunuz ve bunları yazdırnız.

        Scanner oku = new Scanner(System.in);
        int[] notlar = new int[50]; //50 tane int sayi gibi

        int notToplam = 0; // burada veri girişi ve not toplamı yapılıyor
        for (int i = 0; i < notlar.length; i++) {
            System.out.print("Not giriniz=");
            notlar[i] = oku.nextInt();
            notToplam = notToplam + notlar[i];
        }

        int ort = notToplam / notlar.length;  // ortalama bulunuyor
        System.out.println("ort = " + ort);

        int gecenler = 0; // aşağıda geçen sayısı ve geçen notlar bulunyor
        for (int i = 0; i < notlar.length; i++) {
            if (notlar[i] >= ort) {
                System.out.println("notlar[i] = " + notlar[i]);
                gecenler++;
            }
        }
        System.out.println("gecenler = " + gecenler);
    }
}

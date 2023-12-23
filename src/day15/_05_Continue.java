package day15;

import java.util.Scanner;

public class _05_Continue {
    public static void main(String[] args) {

        // Kullanıcıdan 5 tane sayı isteyiniz.
        // Bu sayılardan 6 ile 10 arasındakiler hariç, diğerlerini toplasın.

        Scanner oku = new Scanner(System.in);
        int toplam = 0;

        for (int i = 1; i <= 5; i++) // bu döngü kaç döner
        {
            // sayı oku
            // ve kriter geçerli ise topla
            System.out.print(i + ".Sayı giriniz=");
            int sayi = oku.nextInt();

            if (sayi > 6 && sayi < 10) continue;//döngünün bundan sonrasını pas geç
            // bir sonraki adıma devam et

            toplam = toplam + sayi;
        }
        System.out.println("toplam = " + toplam);
    }
}

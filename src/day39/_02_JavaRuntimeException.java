package day39;

import java.util.Scanner;

public class _02_JavaRuntimeException {
    public static void main(String[] args) {
        System.out.println("Program çalışmaya başladı");

        Scanner oku = new Scanner(System.in);

        try {  // olay yeri inceleme, hata bölgesi
            System.out.print("Sayı1=");
            int sayi1 = oku.nextInt();

            System.out.print("Sayı2=");
            int sayi2 = oku.nextInt();

            int bolum = sayi1 / sayi2;
            System.out.println("bolum = " + bolum);
        } catch (Exception hata) // oluşan hatayı hata isimli değişkene atıyor
        {
            System.out.println("hata oluştu");
            System.out.println(hata);
        }

        System.out.println("Program bitti");
    }
}

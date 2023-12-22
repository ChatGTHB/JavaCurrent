package day14;

import java.util.Scanner;

public class _06_ForLoop {
    public static void main(String[] args) {

        //Girilen  5 tam sayının toplamının sonucunu yazdırınız

        // Döngünü içnde ne var
        // sayi oku, toplam=toplam+sayi
        // döngü şartı sayac <5

        Scanner oku = new Scanner(System.in);
        int toplam = 0;

        for (int sayac = 1; sayac <= 5; sayac++) {
            System.out.print(sayac + ".sayi giriniz=");
            int sayi = oku.nextInt();
            toplam = toplam + sayi;
        }

        System.out.println("toplam = " + toplam);
    }
}

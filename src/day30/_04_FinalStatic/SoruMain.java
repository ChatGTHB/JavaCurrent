package day30._04_FinalStatic;

import java.util.Scanner;

public class SoruMain {
    public static void main(String[] args) {

//        Sabitler s=new Sabitler();
//        int a=s.birGundekiSaatSayisi;

//        int b=Sabitler.birGundekiSaatSayisi;

        int gun;
        int saat;
        int dak;

        Scanner oku = new Scanner(System.in);
        System.out.print("Gun: ");
        gun = oku.nextInt();
        System.out.print("Saat: ");
        saat = oku.nextInt();
        System.out.print("Dakika: ");
        dak = oku.nextInt();

        int toplamSaniye = Sabitler.hesapla(gun, saat, dak);
        System.out.println("toplamSaniye = " + toplamSaniye);
    }
}

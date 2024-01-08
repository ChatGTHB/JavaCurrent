package day25._04_Example;

import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {

        Scanner okuInt = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);
        Ogrenci ogrenci = new Ogrenci();

        System.out.print("Öğrenci Adı=");
        ogrenci.adi = okuStr.nextLine();
        System.out.print("Öğrenci Soyadı=");
        ogrenci.soyadi = okuStr.nextLine();
        System.out.print("Öğrenci Sınıfı=");
        ogrenci.sinifi = okuInt.nextInt();
        System.out.print("Öğrenci Adres=");
        ogrenci.adres = okuStr.nextLine();

        System.out.println("ogrenci.adi = " + ogrenci.adi);
        System.out.println("ogrenci.soyadi = " + ogrenci.soyadi);
        System.out.println("ogrenci.sinifi = " + ogrenci.sinifi);
        System.out.println("ogrenci.adres = " + ogrenci.adres);
    }
}

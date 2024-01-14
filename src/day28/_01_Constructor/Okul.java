package day28._01_Constructor;

import java.util.Scanner;

public class Okul {

    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        Ogrenci ogrenci1 = new Ogrenci(); // nesnenin oluşma anı
        ogrenci1.id = 1;
        ogrenci1.ad = "ismet";
        ogrenci1.soyad = "temur";
        ogrenci1.sinifi = 5;
        System.out.println(ogrenci1.ad);

        Ogrenci ogrenci2 = new Ogrenci(2, "Ali", "Veli", 6);
        System.out.println(ogrenci2.ad);
    }

}

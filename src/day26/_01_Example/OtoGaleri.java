package day26._01_Example;

import java.util.ArrayList;
import java.util.Scanner;

public class OtoGaleri {

    public static void main(String[] args) {

        ArrayList<Araba> galeri = new ArrayList<>();
        Scanner okuInt = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            Araba araba = new Araba();

            System.out.print("Araba No=");
            araba.arabaNo = okuInt.nextInt();
            System.out.print("Araba Markası=");
            araba.marka = okuStr.nextLine();
            System.out.print("Araba Üretim Yılı=");
            araba.uretimYili = okuInt.nextInt();

            galeri.add(araba);
        }

        galeriYazdir(galeri); // gideni var, döneni yok
        uretimYiliOrtamalasiYaz(galeri); // gideni var, döneni yok
        int ort = uretimYiliOrtamalasiBulVer(galeri); // gideni var, var
        System.out.println("ort = " + ort);
    }

    public static int uretimYiliOrtamalasiBulVer(ArrayList<Araba> galeri) {
        int toplamUretimYili = 0;
        for (Araba araba : galeri) {
            toplamUretimYili = toplamUretimYili + araba.uretimYili;
        }
        return toplamUretimYili / galeri.size();
    }

    public static void uretimYiliOrtamalasiYaz(ArrayList<Araba> galeri) {
        int toplamUretimYili = 0;
        for (Araba araba : galeri) {
            toplamUretimYili = toplamUretimYili + araba.uretimYili;
        }
        System.out.println("Ortalama=" + (toplamUretimYili / galeri.size()));
    }

    public static void galeriYazdir(ArrayList<Araba> galeri) {
        for (Araba araba : galeri) {
            System.out.println(araba.arabaNo + " " + araba.marka + " " + araba.uretimYili);
        }
    }
}

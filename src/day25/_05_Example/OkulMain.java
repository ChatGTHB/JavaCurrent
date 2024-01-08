package day25._05_Example;

import java.util.ArrayList;
import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {

        Ogrenci[] sinif = new Ogrenci[3]; // İçi boş; şu anda öğrenci tipi var burada

        Scanner okuInt = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);

        for (int i = 0; i < sinif.length; i++) {
            Ogrenci ogrenci = new Ogrenci();   // sinif[i]=new Ogrenci();
            System.out.print("Öğrenci Adı=");
            ogrenci.ad = okuStr.nextLine();
            System.out.print("Öğrenci Soyadı=");
            ogrenci.soyad = okuStr.nextLine();
            System.out.print("Öğrenci Sınıfı=");
            ogrenci.sinif = okuInt.nextInt();
            System.out.print("Öğrenci Adres=");
            ogrenci.adres = okuStr.nextLine();
            sinif[i] = ogrenci;
        }

        for (int i = 0; i < sinif.length; i++) {
            System.out.println("ogrenci.adi = " + sinif[i].ad);
            System.out.println("ogrenci.soyadi = " + sinif[i].soyad);
            System.out.println("ogrenci.sinifi = " + sinif[i].sinif);
            System.out.println("ogrenci.adres = " + sinif[i].adres);
        }

        /*********************************/
        ArrayList<Integer> notlar = new ArrayList<>();  // istediğini kadar Integer ekle
        ArrayList<Ogrenci> sinif2 = new ArrayList<>();  // istediğin kadar Öğrenci ekle

        for (int i = 0; i < 3; i++) {
            Ogrenci ogrenci = new Ogrenci();
            System.out.print("Öğrenci Adı=");
            ogrenci.ad = okuStr.nextLine();
            System.out.print("Öğrenci Soyadı=");
            ogrenci.soyad = okuStr.nextLine();
            System.out.print("Öğrenci Sınıfı=");
            ogrenci.sinif = okuInt.nextInt();
            System.out.print("Öğrenci Adres=");
            ogrenci.adres = okuStr.nextLine();
            sinif2.add(ogrenci);
        }

        for (Ogrenci ogrenci : sinif2) {
            System.out.println("ogr1.adi = " + ogrenci.ad);
            System.out.println("ogr1.soyadi = " + ogrenci.soyad);
            System.out.println("ogr1.sinifi = " + ogrenci.sinif);
            System.out.println("ogr1.adres = " + ogrenci.adres);
        }
    }
}

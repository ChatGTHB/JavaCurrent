package day25._03_Example;

public class Okul {
    public static void main(String[] args) {

        Ogrenci ogrenci = new Ogrenci();

        ogrenci.okulNo = 2001;
        ogrenci.ad = "Cilem";
        ogrenci.soyad = "Okkali";
        ogrenci.sinif = 12;
        ogrenci.adres = "Kadıköy";

        System.out.println("ogrenci.okulNo = " + ogrenci.okulNo);
        System.out.println("ogrenci.ad = " + ogrenci.ad);
        System.out.println("ogrenci.soyad = " + ogrenci.soyad);
        System.out.println("ogrenci.sinif = " + ogrenci.sinif);
        System.out.println("ogrenci.adres = " + ogrenci.adres);
    }
}



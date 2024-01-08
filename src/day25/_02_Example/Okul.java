package day25._02_Example;

public class Okul {
    public static void main(String[] args) {

        Ogrenci ogrenci = new Ogrenci();
        ogrenci.okulNo = 1001;
        ogrenci.adi = "Kaan";
        ogrenci.soyadi = "Gül";
        ogrenci.adresi = "Üsküdar";
        ogrenci.sinifi = 12;

        System.out.println("ogrenci.okulNo = " + ogrenci.okulNo);
        System.out.println("ogrenci.adi = " + ogrenci.adi);
        System.out.println("ogrenci.soyadi = " + ogrenci.soyadi);
        System.out.println("ogrenci.sinifi = " + ogrenci.sinifi);
        System.out.println("ogrenci.adresi = " + ogrenci.adresi);
    }
}

class Ogrenci {
    int okulNo;
    String adi;
    String soyadi;
    int sinifi;
    String adresi;
}
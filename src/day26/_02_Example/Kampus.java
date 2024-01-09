package day26._02_Example;

public class Kampus {
    public static void main(String[] args) {

        Ogrenci ogr1 = new Ogrenci();
        ogr1.okulNo = 1001;
        ogr1.ad = "İsmet";
        ogr1.soyad = "Temur";
        ogr1.okulu.okulAd = "Bayrak Okulu";
        ogr1.okulu.mudurAd = "Şeyma Nur";
        ogr1.okulu.adres = "Çekmeköy";

        Ogrenci ogr2 = new Ogrenci();
        ogr2.okulNo = 1002;
        ogr2.ad = "Ömer";
        ogr2.soyad = "Faruk";

        ogr2.okulu = new Okul(); // ya tanımda ya da burada
        ogr2.okulu.okulAd = "Atatürk okulu";
        ogr2.okulu.mudurAd = "Ahmet Kaya";
        ogr2.okulu.adres = "Şişli";

        System.out.println(ogr1.ad);
        System.out.println(ogr1.okulu.okulAd);
    }
}

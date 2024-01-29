package day32._01_Encapsulation;

public class ToplulukMain {

    public static void main(String[] args) {

        Kisi kisi1 = new Kisi();

        kisi1.ad = "İsmet";
        kisi1.soyad = "Temur";
        //kisi1.yas=-40;

        kisi1.setYas(40);

        // değişkene direk erişimi kapatıp
        // bir metod ile korumalı veri gonderme ve alma
        // işlemine Encapsulation denir.

        System.out.println(kisi1.getYas());
    }
}

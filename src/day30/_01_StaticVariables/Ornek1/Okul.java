package day30._01_StaticVariables.Ornek1;

public class Okul {

    public static void main(String[] args) {

        Ogrenci ogr1 = new Ogrenci("İsmet", "Temur");
        Ogrenci ogr2 = new Ogrenci("Mehmet", "Demir");
        Ogrenci ogr3 = new Ogrenci("Ayşe", "Yıldız");
        //...
        //...
        Ogrenci ogr500 = new Ogrenci("Mehmet", "Özcan");
        // Aynı verinin çok kez girişi engellendi
        // Aynı verinin hazıfazada NESNE sayısı kadar
        // tekrarlanması engellendi

        System.out.println(ogr1);
    }
}

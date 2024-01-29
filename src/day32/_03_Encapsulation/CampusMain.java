package day32._03_Encapsulation;

import java.util.Scanner;

public class CampusMain {

    public static void main(String[] args) {

        Scanner okuInt = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);

        Okul yeniOkul = new Okul("Yunus Emre Orta Okulu", 3); // max ogr 3

        do {
            System.out.print("Öğrenci Adı=");
            String ad = okuStr.nextLine();
            System.out.print("Öğrenci Soyadı=");
            String soyad = okuStr.nextLine();
            System.out.print("Öğrenci Yaşı=");
            int yas = okuInt.nextInt();

            if (yas < 15) {
                Ogrenci ogr = new Ogrenci(ad, soyad, yas);
                yeniOkul.getOgrencileri().add(ogr);
            } else System.out.println("Öğrenci yaşı okul için uyugn değil");

        } while (yeniOkul.getOgrencileri().size() < yeniOkul.getKontenjan());

        for (Ogrenci o : yeniOkul.getOgrencileri())
            System.out.println("o = " + o);
    }
}

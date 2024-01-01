package day21;

import java.util.ArrayList;
import java.util.Scanner;

public class _06_ArrayList_Example {

    public static void main(String[] args) {

        /**
         Bir öğretmenden girmek istediği kadar notu alınız,
         Öğretmene devam etmek istiyor musunuz (E/H) şeklinde sorunuz
         ve ortalamayı geçen öğrenci sayısını bulunuz.
         */

        Scanner okuInt = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);

        ArrayList<Integer> notlar = new ArrayList<>();
        int toplam = 0;
        String cevap = "";
        do {
            //notu oku
            System.out.print("Not giriniz=");
            int not = okuInt.nextInt();

            //ArrayList e ekle
            notlar.add(not);
            toplam = toplam + not;

            System.out.print("Devam etmek istiyor musunuz?(E/H)=");
            //Cevabı al döngü şartı olarak kullan
            cevap = okuStr.next();

        } while (cevap.equalsIgnoreCase("E")); // evet olduğu sürece dön

        System.out.println("notlar = " + notlar);

        int ort = toplam / notlar.size();
        System.out.println("ort = " + ort);

        int gecenSayisi = 0;
        for (int i = 0; i < notlar.size(); i++) {
            if (notlar.get(i) >= ort) gecenSayisi++;
        }

        System.out.println("gecenSayisi = " + gecenSayisi);
    }
}

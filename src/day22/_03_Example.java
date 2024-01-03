package day22;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Example {

    public static void main(String[] args) {

        // Bir canlı sözlük yapılmak isteniyor,
        // Kullanıcıdan kelime ve manası şeklinde
        // Devam ietmek istediği kadar bilgi alınız
        // 2 bilgi alınız.
        // Daha sonra kullanıcıdan bir kelime alarak
        // manasını yazdırınız.

        // kelimeler bi yerde , anlamları bi yerde olacak
        ArrayList<String> kelimeler = new ArrayList<>();
        ArrayList<String> manalari = new ArrayList<>();

        ArrayList<ArrayList<String>> sozluk = new ArrayList<>();
        sozluk.add(kelimeler);
        sozluk.add(manalari);

        Scanner okuStr = new Scanner(System.in);

        String cevap = "";
        do {
            System.out.print("Kelime giriniz=");
            String kelime = okuStr.nextLine();
            kelimeler.add(kelime);  //sozluk.get(0).add(kelime);

            System.out.print("Manasını giriniz=");
            String mana = okuStr.nextLine();
            manalari.add(mana); //sozluk.get(1).add(kelime);

            System.out.print("Devam etmek istiyor musunuz?(E/H)=");
            cevap = okuStr.nextLine();

        } while (cevap.equalsIgnoreCase("E"));

        System.out.print("Aranacak Kelime=");
        String arananKelime = okuStr.nextLine();

        // şimdi arana kelimeyi bulalım
        for (int i = 0; i < kelimeler.size(); i++) {  // sozluk.get(0).size()
            if (kelimeler.get(i).equalsIgnoreCase(arananKelime)) //kelime bulundu
            {
                System.out.println(manalari.get(i));
            }
        }
    }
}

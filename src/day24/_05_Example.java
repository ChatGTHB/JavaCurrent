package day24;

import java.util.HashMap;
import java.util.Scanner;

public class _05_Example {
    public static void main(String[] args) {

        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secekte kelimenin kendisi alınız ve manasını alınız)
        // 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secekte verilen bir kelime nin manasını yazıdırnız)
        // 5- Silme
        // 6- Çıkış

        // Kelime ve manası, kelimeden de manaya ulaşabilmem lazım
        Scanner okuInt = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);
        HashMap<String, String> sozluk = new HashMap<>();
        int secim = 0;
        do {
            // kullanıcıya menüyü göster
            System.out.print("MENÜ\n1-EKLEME\n2-DÜZLETME\n3-LİSTELEME" + "\n4-ARAMA\n5-SİLME\n6-ÇIKIŞ\nSeçiminiz=");
            secim = okuInt.nextInt();
            // seçimini al
            // seçime göre işlemi yap
            switch (secim) {
                case 1: // ekleme işlemleri
                    System.out.print("Kelime giriniz=");
                    String kelime = okuStr.nextLine();
                    System.out.print("Anlamı=");
                    String anlami = okuStr.nextLine();
                    sozluk.put(kelime, anlami);
                    System.out.println("Ekleme işlemi yapılmıştır");
                    break;
                case 2: //düzeltme işlemleri ;
                    break;
                case 3: //listeleme işlemleri ;
                    break;
                case 4: //arama işlemleri ;
                    System.out.print("Aranan Kelime giriniz=");
                    kelime = okuStr.nextLine();
                    System.out.println(sozluk.get(kelime));
                    break;
                case 5: //silme işlemleri ;
                    break;
            }
        } while (secim != 6);
    }
}

package day30._03_Ornek;

public class GununSorusu {

    static int b = 0; // sen bi tanesin, tipe ait sadece 1 tane
    int a; // her nesnenin a sı var

    public static void main(String[] args) {

        GununSorusu gununSorusu1 = new GununSorusu();
        gununSorusu1.a = 5;

        GununSorusu gununSorusu2 = new GununSorusu();
        gununSorusu2.a = 7;

        // Soru 1 :
        // a nın değeri şu anda kaç oldu ? a yı yazdırsam kaç yazar?

        // Verilecek cevap şu : Hocam hangi a yı soruyorsun,
        System.out.println("gununSorusu1.a = " + gununSorusu1.a); // 5, b=0
        System.out.println("gununSorusu2.a = " + gununSorusu2.a); // 7, b=0

        // Soru 2 : b'nin değeri şu anda kaçtır ?
        System.out.println("GununSorusu.b = " + GununSorusu.b); // 0

        // Soru 3 :
        gununSorusu1.artir(); // gununSorusu1.a sı 1 tane arttı : 6  , b 1 arttı
        gununSorusu2.artir(); // gununSorusu2.a sı 1 tane arttı : 8  , b 1 arttı
        // Şu anda a nın ve b nin değeri kaçtır

        System.out.println("gununSorusu1.a = " + gununSorusu1.a); // 6
        System.out.println("gununSorusu2.a = " + gununSorusu2.a); // 8
        System.out.println("GununSorusu.b = " + GununSorusu.b); // 2
    }

    void artir() {
        a++;
        b++;
    }
}

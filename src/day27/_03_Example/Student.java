package day27._03_Example;

import java.util.ArrayList;

public class Student {
    String name;
    int maxSaat;
    ArrayList<Lesson> dersleri = new ArrayList<>();

    static void universiteKurallari() {

        System.out.println("Kural 1: Çaysız ve üzümsüz derse gelme");
        System.out.println("Kural 2: Uykunu mutlaka al, sağlık en önemlisi");
        System.out.println("Kural 3: Her zaman dinç ve dinamik ol ve pozitif ol");
        System.out.println("Kural 4: En başta verdiğin sözü unutma, şu an kamptasın ");
        System.out.println("Kural 5: İnş, biz bu işi başaracağız.");
    }

    void dersEkle(Lesson ders) {

        // dersleri listesinde derslerin miktarı max saat ulaşmamışsa
        // 1.ders geldiğinde listede 0 saat var, eklenebilir
        // 2.ders geldiğinde listede 3 saat var eklenebilir
        // 3.ders geldiğinde listede 9 saat var, eklenemz
        int listedeVarOlanToplamSaat = 0;
        for (Lesson lesson : this.dersleri)
            listedeVarOlanToplamSaat += lesson.saat;

        if (listedeVarOlanToplamSaat + ders.saat < 10) this.dersleri.add(ders);
        else System.out.println("Max saati aştınız ders eklenemez " + ders.name);
    }
}

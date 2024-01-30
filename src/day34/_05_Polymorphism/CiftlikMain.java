package day34._05_Polymorphism;

public class CiftlikMain {

    public static void main(String[] args) {

        Kopek kopek1 = new Kopek("karabaş");
        kopek1.ses(); // havladı
        kopek1.kokladi(); // kokladi

        Kedi kedi1 = new Kedi("köpük");
        kedi1.ses(); // miyavladı
        kedi1.tirmaladi(); // tırmaladı

        kopekSesi(kopek1);
        kediSesi(kedi1);

        System.out.println("-------------------");
        hayvanSesi(kopek1); //
        hayvanSesi(kedi1); //
        // hem kendi türünde hem de extend olduğu tür
        // de de olabilmesine çok biçimlilik yani
        // Polymorphism denir
    }

    public static void hayvanSesi(Hayvan h) {
        // h nini tipi alsan kendi tipi olacak
        h.ses(); // herkes kendi sesini çıkarır

    }

    public static void kopekSesi(Kopek kp) {
        kp.ses(); // havadı
    }

    public static void kediSesi(Kedi kd) {
        kd.ses(); // miyavladı
    }
}

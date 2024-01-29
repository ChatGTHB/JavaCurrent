package day31._05_Enum;

public class AylarMain {

    public static void main(String[] args) {

        // Gun sayısını bulmak için bir metod yazıyorum
        // Türkçe yazılışı bir metod gerekecekti
        // Sıra numarası için de yine metod

        // Java der ki eğer bu enum elemanları için
        // her birine ait sabit değerlere ihtiyacın var ise
        // mesala OCAK -> Ocak, 1, 31 gibi sabit değerlerinde
        // SEMBOL un kendisinde olmasını istiyorsan sana güzel
        // çözümüm var diyor

        Aylar ay = Aylar.AGUSTOS;

        System.out.println(ay.ayAd);
        System.out.println(ay.ayNo);
        System.out.println(ay.gunSayisi);
    }
}

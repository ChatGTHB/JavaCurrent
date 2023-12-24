package day16;

public class _05_JavaArrayIntro {
    public static void main(String[] args) {

        int sayi;  // 1 tane sayı saklamak için

        int ogrNot = 0;

        int ogrNot1;
        int ogrNot2;
        //..
        //..
        int ogrNot50 = 50;

        // 1 tanımlamada yani 1 kalemde çoklu veri tutabilecek
        // değişkenler lazım
        int[] notlar = new int[50]; // içide 50 tane sayı saklayabilen değişken

        notlar[0] = 50;
        notlar[1] = 70;
        //..
        //..
        notlar[49] = 89;

        System.out.println("notlar[0], 1. Öğrenci notu =" + notlar[0]);
        System.out.println("50. yani,notlar[49],son öğrencini notu = " + notlar[49]);
        System.out.println("kaç not var ? = " + notlar.length);
    }
}

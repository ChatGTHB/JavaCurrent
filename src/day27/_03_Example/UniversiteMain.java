package day27._03_Example;

import java.util.Arrays;

public class UniversiteMain {
    public static void main(String[] args) {

        Student.universiteKurallari();

        Lesson ders1=new Lesson();
        ders1.name="Java101";
        ders1.saat=3;

        Lesson ders2=new Lesson();
        ders2.name="Algr101";
        ders2.saat=6;

        Lesson ders3=new Lesson();
        ders3.name="Math101";
        ders3.saat=4;

        Student ogr1=new Student();
        ogr1.name="Esma";
        ogr1.maxSaat=10;

        ogr1.dersEkle(ders1);
        ogr1.dersEkle(ders2);
        ogr1.dersEkle(ders3);

        // TODO: transcript : yani dersleri yazdırınız

        System.out.println("ogr1.dersleri = " + ogr1.dersleri); // TODO
    }
}

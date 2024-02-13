package day38;

import java.util.Arrays;

public class _02_JavaVeriTipleri {

    public static void main(String[] args) {

        // ilkel tipler, primitive tipler, short,byte,long,double
        int sayi1 = 5;
        int sayi2 = 10;

        sayi1 = sayi2;  // sayi1=10,  sayi2=10 zaten 10 idi
        sayi1 = 45;
        sayi2 = 60;
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

        //referans tipler : diziler,arraylistler,nesneler
        int[] dizi1 = {1, 2, 3, 4};
        int[] dizi2 = {5, 6};
        System.out.println("dizi1 = " + Arrays.toString(dizi1));
        System.out.println("dizi2 = " + Arrays.toString(dizi2));

        dizi1 = dizi2;
        System.out.println("dizi1 = " + Arrays.toString(dizi1));//5,6
        System.out.println("dizi2 = " + Arrays.toString(dizi2));//5,6

        dizi1[0] = 67;
        System.out.println("dizi1 = " + Arrays.toString(dizi1));//67,6
        System.out.println("dizi2 = " + Arrays.toString(dizi2));//67,6

        dizi2[0] = 80;
        System.out.println("dizi1 = " + Arrays.toString(dizi1));//80,6
        System.out.println("dizi2 = " + Arrays.toString(dizi2));//80,6

        // Nesne tipler: NULL alabilen ilkel tip
        //String,Double,Integer,Float,Byte, null, davranışı ilkel
        String ad1 = "ismet";
        String ad2 = "Ayşe";

        System.out.println("ad1 = " + ad1); // ismet
        System.out.println("ad2 = " + ad2); // ayşe

        ad1 = ad2;
        System.out.println("ad1 = " + ad1); // ayşe
        System.out.println("ad2 = " + ad2); // ayşe

        ad1 = "kaya";
        System.out.println("ad1 = " + ad1); // kaya  : ilkel tip gibi davrandı
        System.out.println("ad2 = " + ad2); // ayşe

        // Nesne tiplere değer atama
        String s1;
        String s2 = null;
        String s3 = ""; // değer atandı
        String s4 = "ismet"; // değer atandı
        String s5 = "Ahmet"; // değer atandı , ilkel tip yine

        //s1.concat("merhaba"); // pointer yok, bir şey eklenmez, dolayısyla çalıştırmıyorum
        s2.concat("merhaba");
    }
}













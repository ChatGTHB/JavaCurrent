package day25._01_Example;

// Tiplerin yani class ların tanımlandığı yer

import java.util.ArrayList;
import java.util.Scanner;

public class _01_JavaClassAndObject {

    // Metot
    public static void main(String[] args) {
        // Ana method : programın başladığı ve bittiği yer

        int sayi;
        Scanner oku = new Scanner(System.in);
        ArrayList<Integer> liste = new ArrayList<>();

        Araba benimArabam = new Araba();
        benimArabam.renk = "kırmızı";
        benimArabam.yil = 2024;
        benimArabam.motorHacmi = 1600;
        benimArabam.marka = "Togg";

        System.out.println("benimArabam.marka = " + benimArabam.marka);
        System.out.println("benimArabam.yil = " + benimArabam.yil);
        System.out.println("benimArabam.motorHacmi = " + benimArabam.motorHacmi);
        System.out.println("benimArabam.renk = " + benimArabam.renk);
    }
    // Metot
}

// Tiplerin yani classların tanımlandığı yer
class Araba {
    String renk;
    int yil;
    String marka;
    int motorHacmi;
}
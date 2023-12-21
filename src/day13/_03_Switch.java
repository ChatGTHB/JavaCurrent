package day13;

import java.util.Scanner;

public class _03_Switch {
    public static void main(String[] args) {
        // Girilen bir sayının birler basamağının değerini yazı ile yazdırınız.
        // mesala
        // 234  -> birler basamağı -> 4  -> dört
        //  45  -> beş
        //   6  -> altı

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı giriniz=");
        int sayi=oku.nextInt();

        int birlerBasamagi = sayi%10;

        switch (birlerBasamagi){
            case 0 : System.out.println("Sıfır"); break;
            case 1 : System.out.println("Bir"); break;
            case 2 : System.out.println("İki"); break;
            case 3 : System.out.println("Üç"); break;
            case 4 : System.out.println("Dört"); break;
            case 5 : System.out.println("Beş"); break;
            case 6 : System.out.println("Altı"); break;
            case 7 : System.out.println("yedi"); break;
            case 8 : System.out.println("Sekiz"); break;
            case 9 : System.out.println("Dokuz"); break;
        }

    }
}

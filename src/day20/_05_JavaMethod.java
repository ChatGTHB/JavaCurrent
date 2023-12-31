package day20;

import java.util.Scanner;

public class _05_JavaMethod {
    public static void main(String[] args) {

        // girilen 2 sayıdan büyük olanını yazdırınız.

        enBuyukYaz();  // hem okuyacak hem yazacak
        enBuyukYaz();

        enBuyukYaz(56, 70); // birden fazla parametre kullanımı
    }

    public static void enBuyukYaz(int s1, int s2) {
        if (s1 > s2) System.out.println(s1 + " büyük");
        else if (s2 > s1) System.out.println(s2 + " büyük");
        else System.out.println("eşit");
    }


    public static void enBuyukYaz() {
        Scanner oku = new Scanner(System.in);
        System.out.print("1.Sayı giriniz: ");
        int s1 = oku.nextInt();
        System.out.print("2.Sayı giriniz: ");
        int s2 = oku.nextInt();

//        if (s1>s2)
//            System.out.println(s1+ " büyük");
//        else
//            if (s2>s1)
//                System.out.println(s2+ " büyük");
//            else
//                System.out.println("eşit");

        enBuyukYaz(s1, s2);
    }
}

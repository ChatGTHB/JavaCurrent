package day18;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Example {

    public static void main(String[] args) {

        // 10 elemanlı bir diziyi random(10 dahil sayılarla) doldurduktan sonra,
        // kullanıcının  gireceği bir rakamı arattırınız.
        // bu rakam var ise indexini yazdırınız.

        int[] dizi = new int[10];  // 10 elemanlı bir dizi tanımladım

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 11);  // dizinin elemanlarını random doldurdum
        }

        Scanner oku = new Scanner(System.in);
        System.out.print("Aranacak sayı(0-10)= ");
        int arananRakam = oku.nextInt(); // kullanıcıdan gireceği bir rakamı aldık

        for (int i = 0; i < dizi.length; i++) { // aranan rakam dizide var mı
            if (dizi[i] == arananRakam) System.out.println("Sayı var, oda numarası(indexi)" + i);
        }
        System.out.println("dizi = " + Arrays.toString(dizi));
    }
}

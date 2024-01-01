package day21;

import java.util.Scanner;

public class _01_JavaMethod {
    public static void main(String[] args) {

        /**
         Kullanıcının gireceği bir sayıya kadar olan sayıların toplamını
         bir fonksiyonda buldurup mainden yazdırınız
         5 -> 1+2+3+4+5
         */

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = oku.nextInt();

        int toplam = toplamBul(sayi); // Math.Max(4,5);

        System.out.println("toplam = " + toplam);
    }

    public static int toplamBul(int sayi) {
        int toplam = 0;
        for (int i = 1; i <= sayi; i++) {
            toplam = toplam + i;
        }
        return toplam;
    }
}

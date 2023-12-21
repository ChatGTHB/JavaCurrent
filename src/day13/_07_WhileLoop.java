package day13;

import java.util.Scanner;

public class _07_WhileLoop {
    public static void main(String[] args) {
        // Girilen 6 sayıdan sadece pozitif olanlarının
        // toplamını bulunuz

        Scanner oku=new Scanner(System.in);

        int sayac=0, toplam=0;

        while (sayac < 6) {
            System.out.print("Sayi giriniz=");
            int sayi = oku.nextInt();

            if (sayi > 0)
               toplam=toplam+sayi;

            sayac++;
        }

        System.out.println("toplam = " + toplam);


    }
}

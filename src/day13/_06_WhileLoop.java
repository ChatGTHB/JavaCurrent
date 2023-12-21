package day13;

import java.util.Scanner;

public class _06_WhileLoop {
    public static void main(String[] args) {
        //Girilen  5 tam sayının toplamının sonucunu yazdırınız

        //döngünü içinde hangi adımlar olacak
        // sayi iste
        // okuna sayı toplam
        // sayac++
        // peki döngü şartı ?

        Scanner oku=new Scanner(System.in);

        int sayac=0, toplam=0;

        while (sayac <5) {
            System.out.print("Sayi giriniz=");
            int sayi = oku.nextInt();

            toplam=toplam+sayi;
            sayac++;
        }

        System.out.println("toplam = " + toplam);
    }
}

package day14;

import java.util.Scanner;

public class _03_DoWhile {
    public static void main(String[] args) {

        // Kullanıcı 0 değeri girene kadar sayı isteyiniz ve sayıları
        // toplayınız; 0 girdiğinde toplamı yazınız

        // döngünün içindekiler neler?
        // sayı oku, toplam=toplam+sayi,
        // döngünün şartı sayı!=0

        Scanner oku = new Scanner(System.in);
        int toplam = 0, sayi;

        System.out.print("Sayi giriniz=");
        sayi = oku.nextInt();
        toplam = toplam + sayi;

        while (sayi != 0) {  // şartı kontrol et, sonra dön
            System.out.print("Sayi giriniz=");
            sayi = oku.nextInt();
            toplam = toplam + sayi;
        }
        System.out.println("toplam = " + toplam);
        toplam = 0;
        // kardeşi Do_While
        // şartı kontrol etmeden 1 kez çalış, sonra kontrol ederk çalış
        do {  // bu döngü şarta bağlı olmaksızı 1 kere çalışır,
            System.out.print("2.döngü Sayi giriniz=");
            sayi = oku.nextInt();
            toplam = toplam + sayi;
        } while (sayi != 0);

        System.out.println("toplam = " + toplam);

        // While : önce kontrol sonra döngü
        // do_while : önce 1 kez çalış , sonra kontrol, sonra döngü

        // kontrol önce ise WHİLE
        // kontrol sonda ise DO_WHİLE
    }
}

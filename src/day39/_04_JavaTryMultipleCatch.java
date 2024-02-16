package day39;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04_JavaTryMultipleCatch {
    public static void main(String[] args) {

        System.out.println("Program başladı");

        Scanner oku = new Scanner(System.in);

        try {
            System.out.print("Sayı1=");
            int sayi1 = oku.nextInt();

            System.out.print("Sayı2=");
            int sayi2 = oku.nextInt();

            int bolum = sayi1 / sayi2; //sayı 0 a bölünemez
            System.out.println("bolum = " + bolum);

//            String kelime="";   // bu 2 satır Genel hata için açılacak
//            char harf=kelime.charAt(3);
        } catch (InputMismatchException ex) //belirli bir hata
        {
            System.out.println("Lütfen sayı giriniz");
        } catch (ArithmeticException ex) //belirli bir hata
        {
            System.out.println("Lütfen bölen için sıfır girmeyiniz");
        } catch (Exception ex) //Genel kalan tüm hatalar, default
        {
            System.out.println("Hata oluştu, tekrar deneyiniz.");
        }
        System.out.println("Program bitti");
    }
}

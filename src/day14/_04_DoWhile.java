package day14;

import java.util.Scanner;

public class _04_DoWhile {
    public static void main(String[] args) {

        // Kullanıcıdan x girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.

        // döngünün içerisinde neler olacak?
        // okuma işlemi var, eğer x den farklı ise yazma işlemi var
        // şart girilen x den farklı olduğu sürece dönecek

        Scanner oku = new Scanner(System.in);
        String girilen;

        do {
            System.out.print("ifade giriniz=");
            girilen = oku.next();

            if (!girilen.equalsIgnoreCase("x")) System.out.println("program çalışıyor");

        } while (!girilen.equalsIgnoreCase("x"));

        System.out.println("program bitti");
    }
}

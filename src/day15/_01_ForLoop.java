package day15;

import java.util.Scanner;

public class _01_ForLoop {
    public static void main(String[] args) {

        // Kullanıcının gireceği bir rakama(dahil) kadar
        // olan sayıların toplamını bulunuz.

        Scanner oku = new Scanner(System.in);
        System.out.print("Kaça kadar toplanacak=");
        int sinir = oku.nextInt();

        int toplam = 0;
        // genelde sayac yerine i veya j kullanılır
        for (int i = 1; i <= sinir; i++)
            toplam = toplam + i;
        System.out.println("toplam = " + toplam);
    }
}

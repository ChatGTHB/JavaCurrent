package day17;

import java.util.Scanner;

public class _04_JavaSplitMethod {
    public static void main(String[] args) {
        // Kullanıcının gireceği bir cumlede kaç kelime olduğunu bulunuz
        // Bugun hava cok guzel -> 4

        Scanner oku = new Scanner(System.in);
        System.out.print("cümle=");
        String cumle = oku.nextLine();

        // 1.Yöntem
        int boslukSayisi = 0;
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == ' ') boslukSayisi++;  // burada bosluk sayısını buluyorum
        }

        System.out.println("kelimeSayisi = " + (boslukSayisi + 1));

        //2.Yöntem
        String[] kelimeler = cumle.split(" "); // bosluga göre böl ve elemanları dizi olarak ver
        System.out.println("kelimeler = " + kelimeler.length);

        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println("kelimeler = " + kelimeler[i]);
        }

        //3.Yöntem
        System.out.println("kelimeler = " + cumle.split(" ").length);
    }
}

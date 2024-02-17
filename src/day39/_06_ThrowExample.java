package day39;

import java.util.Scanner;

public class _06_ThrowExample {

    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.println("Yeni şifre oluşturma");

        System.out.print("Yeni şifre=");
        String yeniSifre = oku.nextLine();

        if (yeniSifre.length() < 8) {
            System.out.println("Lütfen Dikkat");
            System.out.println("Şifre en az 8 karakter olmalı");
            // log tutma
            // hatalı girme sayısı aştığında bloke etme işlemi
            // eski şifrelerden birisi mi kontrol
        }

        if (yeniSifre.length() > 15) {
            System.out.println("Lütfen Dikkat");
            System.out.println("Şifre en fazla 15 karakter olmalı");
            // log tutma
            // hatalı girme sayısı aştığında bloke etme işlemi
            // eski şifrelerden birisi mi kontrol
        }


    }
}

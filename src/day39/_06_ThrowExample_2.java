package day39;

import java.util.Scanner;

public class _06_ThrowExample_2 {

    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.println("Yeni şifre oluşturma");

        try {
            System.out.print("Yeni şifre=");
            String yeniSifre = oku.nextLine();

            if (yeniSifre.length() < 8) throw new Exception("Şifre en az 8 karakter olmalı");

            if (yeniSifre.length() > 15) throw new Exception("Şifre en fazla 15 karakter olmalı");
        } catch (Exception ex) {
            System.out.println("Lütfen Dikkat");
            System.out.println(ex.getMessage());
            // log tutma
            // hatalı girme sayısı aştığında bloke etme işlemi
            // eski şifrelerden birisi mi kontrol
        }

    }
}

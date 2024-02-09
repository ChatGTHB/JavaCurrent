package day37;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _09_StringToLocalDateAndTimeParse {

    public static void main(String[] args) {
        // Kullanıcıdan alınan ve string durumundaki time veya tarih
        // bilgisinin time veya tarih bilgisine çevrilmesi

        Scanner oku = new Scanner(System.in);
        System.out.print("Tarih Giriniz (25.01.2023) =");
        String strTarih = oku.nextLine();

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate tarih = LocalDate.parse(strTarih, f);


        System.out.println("tarih = " + tarih.format(f));

        // TODO 1: Şu anki saati alınan saati geriye doğru saniye saniye saydırınız.
        // TODO 2: kullanıcıdan alınan saati geriye doğru saniye saniye saydırınız.
        // TODO 3: Kullanıcıdan alacağınız bir Toplam rakamı, kullanıcının vereceği  başlangıç tarihine göre
        //         yine kullanıcnın verdiği kadar taksit yaptırarak, ödeme planını ekrana yazdırınız.
        //         Kullanıcıdan tarih, para miktarı ve taksit sayısı alınacak
        //         Çıktı olarak taksit no, taksit tarihi, ödenecek miktar şeklinde liste verilecek
    }
}

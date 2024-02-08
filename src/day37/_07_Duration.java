package day37;

import java.time.Duration;
import java.time.LocalTime;

public class _07_Duration {
    public static void main(String[] args) {

        // Duration : localTime ve LocalDateTime lar arası fark için kullanılır
        long startTime = System.currentTimeMillis(); // şu andaki milisaniye aldın

        //LocalTime
        LocalTime dersBaslangic = LocalTime.of(19, 0, 0);
        LocalTime dersBitis = LocalTime.of(21, 50, 5);

        Duration gunlukDersSaati = Duration.between(dersBaslangic, dersBitis);
        System.out.println("gunlukDersSaati = " + gunlukDersSaati);

        System.out.println("toHours() = " + gunlukDersSaati.toHours()); // toplamın saat hali
        System.out.println("toMinutes() = " + gunlukDersSaati.toMinutes()); // toplam dak hali
        System.out.println("getSeconds() = " + gunlukDersSaati.getSeconds()); // toplam sn hali

        System.out.println("*******  Kodun performansı *******");

        long finishTime = System.currentTimeMillis(); // şu andaki aldım
        System.out.println("Geçen Süre = " + (finishTime - startTime) + " ms");
    }
}

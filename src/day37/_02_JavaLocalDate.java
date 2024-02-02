package day37;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class _02_JavaLocalDate {

    public static void main(String[] args) {
        // LocalDate Sadece gun ay yıl bilgisini tutar
        LocalDate tarih = LocalDate.now();

        DateTimeFormatter oz6 = DateTimeFormatter.ofPattern("MMMM dd EEEE yyyy");
        System.out.println("tarih = " + tarih.format(oz6));

        System.out.println("*** Başka dilde gösterim ***");
        System.out.println("Almanca tarih=" + tarih.format(oz6.withLocale(Locale.GERMANY)));

        // Lokalizasyon tanımlama ne demek
        // en-US : Amerikanın ingilizce konuşulan bölgesinin dili
        // en-UK : İngilterenin ingilizce konuşulan bölgesinin dili
        // fr-CA
        // en-CA
        // tr-TR
        // zh-CH

        Locale lCince = new Locale("zh", "CH"); // dil, ülke
        System.out.println("Çince tarih=" + tarih.format(oz6.withLocale(lCince)));

        Locale[] kullanilabilirLokaller = Locale.getAvailableLocales();

        for (Locale l : kullanilabilirLokaller) {
            System.out.print("Dili=" + l.getDisplayLanguage());
            System.out.print(",Ülkesi=" + l.getDisplayCountry());
            System.out.print(",Dili=" + l.getLanguage());
            System.out.println(",Ülkesi=" + l.getCountry());
        }

        System.out.println("*************");
        // tarih = 2053-5-20 kendimiz bir tarih eşitlemesi nasıl yaabiliriz
        LocalDate tarih1 = LocalDate.of(2053, 5, 20);
        LocalDate tarih2 = LocalDate.of(2053, Month.MAY, 20);
        System.out.println("tarih2.format(oz6) = " + tarih2.format(oz6));
    }
}

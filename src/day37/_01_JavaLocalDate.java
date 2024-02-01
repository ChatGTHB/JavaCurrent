package day37;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class _01_JavaLocalDate {

    public static void main(String[] args) {
        // LocalDate Sadece gun ay yıl bilgisini tutar
        LocalDate tarih = LocalDate.now();

        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth()); // ayın adını
        System.out.println("getMonth().getValue() = " + tarih.getMonth().getValue());//ay no
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth()); // aynı kaçıncı günü
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());
        System.out.println("getDayOfWeek().getValue() = " + tarih.getDayOfWeek().getValue());
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());

        // kendisindeki hazır formatlar
        System.out.println("ISO_DATE = " + tarih.format(DateTimeFormatter.ISO_DATE));
        System.out.println("SHORT = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDIUM = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        // İstediğim formatta gösterim
        System.out.println(" *********  İstediğimiz formatta gösterim **********");
        DateTimeFormatter ozelFormat1=DateTimeFormatter.ofPattern("dd/MM/YYYY"); // tarih şablonu
        System.out.println("tarih dd/MM/YYYY = " + tarih.format(ozelFormat1));

        DateTimeFormatter ozelFormat2=DateTimeFormatter.ofPattern("d.M.YY"); // tarih şablonu
        System.out.println("tarih d.M.YY = " + tarih.format(ozelFormat2));

        DateTimeFormatter of3=DateTimeFormatter.ofPattern("EEEE dd.MM.YYYY"); // tarih şablonu
        System.out.println("tarih EEEE dd.MM.YYYY = " + tarih.format(of3));

        DateTimeFormatter of4=DateTimeFormatter.ofPattern("EE dd.MM.YYYY"); // tarih şablonu
        System.out.println("tarih EE dd.MM.YYYY = " + tarih.format(of4));

        DateTimeFormatter of5=DateTimeFormatter.ofPattern("MMMM EEEE dd.MM.YYYY"); // tarih şablonu
        System.out.println("tarih MMMM EEEE dd.MM.YYYY = " + tarih.format(of5));
    }
}

package day37;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _05_JavaLocalDateTime {

    public static void main(String[] args) {
        // LocalDateTime hem tarih hem de saat bilgisini tutar

        LocalDateTime dt = LocalDateTime.now();
        System.out.println("dt = " + dt);

        System.out.println("dt.getYear() = " + dt.getYear());
        System.out.println("dt.getHour() = " + dt.getHour());
        System.out.println("dt.getMonth() = " + dt.getMonth());
        // bütün zaman parçaları alınabilir

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm");
        System.out.println("dt = " + dt.format(f));
    }
}

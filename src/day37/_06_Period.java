package day37;

import java.time.LocalDate;
import java.time.Period;

public class _06_Period {
    public static void main(String[] args) {
        // Period 2 tarih arasındaki farkı tutar
        // LocalDate ler için kullanılır

        LocalDate dogumTarihi = LocalDate.of(1978, 10, 25);
        LocalDate buGun = LocalDate.now();

        Period fark = Period.between(dogumTarihi, buGun); // 2 tarih arasındaki zaman parçası
        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println(fark.getYears() + " yaşındasınız");

        System.out.println("****************************");
        Period period3Gun = Period.ofDays(3); // 3 gunluk zaman parcasi
        Period period3Ay = Period.ofMonths(3); // 3 aylık zaman parçası

        System.out.println("*****************************");
        LocalDate kursBaslangic = LocalDate.of(2023, 11, 20);
        Period kursSure = Period.ofMonths(6);
        LocalDate kursBitis = kursBaslangic.plus(kursSure); //minus azaltma
        System.out.println(kursBitis);
        System.out.println("kursBitis.gunu = " + kursBitis.getDayOfWeek());
    }
}

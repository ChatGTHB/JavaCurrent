package day37;

import java.time.LocalDate;

public class _10_ComparingDateAndTime {

    public static void main(String[] args) {

        LocalDate buGun = LocalDate.now();
        LocalDate dun = buGun.minusDays(1);

        boolean sonraMi = buGun.isAfter(dun); // bugün dün den sonra mı
        System.out.println("sonraMi = " + sonraMi);

        boolean onceMi = buGun.isBefore(dun); // bugün dün den önce mi
        System.out.println("onceMi = " + onceMi);

        boolean esitMi = buGun.isEqual(dun); // bugün dün e eşit mi
        System.out.println("esitMi = " + esitMi);

        boolean artikYilMi = buGun.isLeapYear(); // artık yıl mı (Şubat 29 gün mü)
        System.out.println("artikYilMi = " + artikYilMi);
    }
}

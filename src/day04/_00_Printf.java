package day04;

public class _00_Printf {

    public static void main(String[] args) {

        int sayi = 5;
        double oran = 10 / (double) 3;

        System.out.println("sayi = " + sayi);
        System.out.println("oran = " + oran);

        System.out.printf("sayilar = %d - %f", sayi, oran);
        System.out.println();
        System.out.printf("sayilar = %5d - %.2f", sayi, oran);
        System.out.println();
        System.out.printf("sayilar = %-5d - %.2f", sayi, oran);
    }
}

package day31._04_EnumSoru;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {

    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        ArrayList<Pizza> siparisler = new ArrayList<>();

        int secim = 0;
        do {
            menu();
            secim = oku.nextInt();
            switch (secim) {
                case 1:
                    Pizza sp = new Pizza(PizzaSize.SMALL);
                    siparisler.add(sp);
                    break;
                case 2:
                    Pizza mp = new Pizza(PizzaSize.MEDIUM);
                    siparisler.add(mp);
                    break;
                case 3:
                    Pizza lp = new Pizza(PizzaSize.LARGE);
                    siparisler.add(lp);
                    break;
                case 4:
                    siparisYazdir(siparisler);
                    break;
            }
        } while (secim <= 4); // olduğu sürece dön
    }

    public static void siparisYazdir(ArrayList<Pizza> siparisler) {
        int s = 0, m = 0, l = 0;

        for (Pizza p : siparisler) {
            if (p.size == PizzaSize.SMALL) s++;
            else if (p.size == PizzaSize.MEDIUM) m++;
            else if (p.size == PizzaSize.LARGE) l++;
        }

        System.out.println("Siparişlerinizi");
        if (s > 0) System.out.println("small pizza dan " + s + " adet");
        if (m > 0) System.out.println("medium pizza dan " + m + " adet");
        if (l > 0) System.out.println("large pizza dan " + l + " adet");
    }

    public static void menu() {
        System.out.println("******** Pizza Menü *******");
        System.out.println("1 - Small");
        System.out.println("2 - Medium");
        System.out.println("3 - Large");
        System.out.println("4 - İşleme Al-Spiariş Göster");
        System.out.println("5 - Çıkış");
        System.out.print("Seciminiz=");
    }
}

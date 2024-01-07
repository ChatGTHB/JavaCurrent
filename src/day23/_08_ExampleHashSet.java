package day23;

import java.util.HashSet;

public class _08_ExampleHashSet {

    public static void main(String[] args) {

        /**
         * 1den 20ye kadar (20 dahil) olan sayılardan random olarak
         * tekrar olmayacak şekilde 10 tanesini bir diziye atayınız.
         * Yani 10 tane random sayı istiyoruz ama içinde tekrar olmayacak.
         */

        HashSet<Integer> sayilar = new HashSet<>();

        while (sayilar.size() < 10) { //10 olduğunda duracak
            int randomSayi = (int) (Math.random() * 20) + 1;
            sayilar.add(randomSayi);
        }
        System.out.println("sayilar = " + sayilar);
    }
}

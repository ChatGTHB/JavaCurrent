package day23;

import java.util.HashSet;

public class _02_Sets {

    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(38);
        hashSet.add(22);
        hashSet.add(4);

        System.out.println("hashSet = " + hashSet);

                        // Bakalım eklenecek mi
        hashSet.add(4); // Eklemek isteseniz de SET ler tekrar eklemez
        hashSet.add(2); // Eklemek isteseniz de SET ler tekrar eklemez

        System.out.println("hashSet = " + hashSet);
    }
}

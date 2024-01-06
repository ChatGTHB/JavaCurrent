package day23;

import java.util.HashSet;

public class _05_Sets {
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(5);  // silinen eleman
        hashSet.add(7);
        hashSet.add(34);
        hashSet.add(3);
        hashSet.add(4);

        System.out.println("Hash Set Size = " + hashSet.size());
        System.out.println("Hash Set = " + hashSet);

        hashSet.remove(5); // elemanın değerine göre siler, index yok
        System.out.println("Hash Set Size = " + hashSet.size());
        System.out.println("Hash Set = " + hashSet);

        if (hashSet.contains(7)) {
            System.out.println("Var");
        } else System.out.println("Yok");

        hashSet.clear();
        System.out.println("Hash Set = " + hashSet);
    }
}

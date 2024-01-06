package day23;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class _06_Question {
    public static void main(String[] args) {

        /**
         10 elamanlı bir diziyi random (10(dahil) a kadar olan sayılarla
         doldurduktan sonra, tekrarlı değerleri almayacak şekilde yeni bir
         diziye atınız.
         */

        Integer[] dizi = new Integer[10];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 11);
        }

        System.out.println("dizi = " + Arrays.toString(dizi));

        // 1.Yöntem
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        Collections.addAll(treeSet1, dizi);

        System.out.println("Tree Set 1 = " + treeSet1);

        // 2.Yöntem
        TreeSet<Integer> treeSet2 = new TreeSet<>(Arrays.asList(dizi));

        System.out.println("Tree Set 2 = " + treeSet2);

        // 3.Yöntem
        TreeSet<Integer> treeSet3 = new TreeSet<>();
        treeSet3.addAll(Arrays.asList(dizi));

        System.out.println("Tree Set 3 = " + treeSet3);
    }
}

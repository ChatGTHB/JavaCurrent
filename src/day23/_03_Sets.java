package day23;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _03_Sets {
    public static void main(String[] args) {

        // SETS          : TEKRAR YOK
        // HashSet       : HIZLI, bunun için içidekileri kendi mantığına sıralar
        // LinkedHashSet : EKLENME SIRASIna göre sıralı tutar
        // TreeSet       : HER ZAMAN SIRALI, kendinden sortlu

        // Hızlı, bunun için kendine göre bir algoritmayla sıralı tutuyor
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("bir");
        hashSet.add("iki");
        hashSet.add("üç");
        hashSet.add("dört");
        hashSet.add("beş");
        System.out.println("Hash Set = " + hashSet);

        // EKLEME SIRASIna göre sıralı tutar
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("bir");
        linkedHashSet.add("iki");
        linkedHashSet.add("üç");
        linkedHashSet.add("dört");
        linkedHashSet.add("beş");
        System.out.println("Linked Hash Set = " + linkedHashSet);

        // KENDİNDEN SIRALI (SORTLU)
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("bir");
        treeSet.add("iki");
        treeSet.add("üç");
        treeSet.add("dört");
        treeSet.add("beş");
        System.out.println("Tree Set = " + treeSet);
    }
}

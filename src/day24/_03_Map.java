package day24;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class _03_Map {
    public static void main(String[] args) {

        // HashMap       : Hızlı çalışmak için , kendi algoritmasına göre sırada saklar
        // LinkedHashMap : Eklendiği sıraya göre içindeki elemanları saklar
        // TreeMap       : İçideki elemanları herzaman KEY e göre sıralı saklar

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(9, "tilki");
        hashMap.put(2, "kedi");
        hashMap.put(30, "köpek");
        hashMap.put(11, "kuş");
        hashMap.put(4, "kurt");

        System.out.println("HashMap = " + hashMap);

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(9, "tilki");
        linkedHashMap.put(2, "kedi");
        linkedHashMap.put(30, "köpek");
        linkedHashMap.put(11, "kuş");
        linkedHashMap.put(4, "kurt");

        System.out.println("LinkedHashMap = " + linkedHashMap);

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(9, "tilki");
        treeMap.put(2, "kedi");
        treeMap.put(30, "köpek");
        treeMap.put(11, "kuş");
        treeMap.put(4, "kurt");

        System.out.println("TreeMap = " + treeMap);
    }
}

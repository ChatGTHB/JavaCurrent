package day24;

import java.util.HashMap;

public class _01_Map {
    public static void main(String[] args) {

        // Set -> HashSet, LinkedHashSet, TreeSet
        // Map -> HashMap, LinkedHashMap, TreeMap

        // Map =  Anahtar + Set -> Anahtarlı set
        // Anahtar + Değer -> Key + Value

        // Anahtarın ve valuenin tipini biz vereceğiz,
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1001, "İsmet Temur");
        hashMap.put(2001, "Esma");
        hashMap.put(2, "Oğuzhan");
        hashMap.put(1003, "Kaan");
        hashMap.put(1001, "Ahmet Kaya"); // Aynısı olamayacağı için
        // eskisini değiştirdi. Setledi yani güncelledi

        System.out.println("Hash Map = " + hashMap);

        System.out.println("hashMap.get(2001) = " + hashMap.get(2001));
        System.out.println("hashMap.get(1003) = " + hashMap.get(1003));

        System.out.println("hashMap.containsKey(1003) = " + hashMap.containsKey(1003));
        System.out.println("hashMap.containsValue(Kaan) = " + hashMap.containsValue("Kaan"));

        System.out.println("hashMap.keySet() = " + hashMap.keySet());
        System.out.println("hashMap.values() = " + hashMap.values());

        hashMap.remove(1001);
        System.out.println("Hash Map = " + hashMap);
        System.out.println("hashMap.size() = " + hashMap.size());

        hashMap.clear();
        System.out.println("Hash Map = " + hashMap);
    }
}

package day24;

import java.util.HashMap;
import java.util.Map;

public class _02_Map {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1001, "Ismet Temur");
        hashMap.put(1002, "Cihat Yılmaz");
        hashMap.put(2001, "Talip Yıldız");
        hashMap.put(5001, "Eyüpcan Bilgin");
        hashMap.put(1002, "Hatice Bayrak"); // 1002 güncelleniyor

        System.out.println("hashMap.keySet() = " + hashMap.keySet());
        System.out.println("hashMap.values() = " + hashMap.values());

        System.out.println();

        for (Integer key : hashMap.keySet()) {
            System.out.println("key = " + key);
        }

        System.out.println();

        for (String value : hashMap.values()) {
            System.out.println("value = " + value);
        }

        System.out.println();

        for (Map.Entry<Integer, String> keyAndValue : hashMap.entrySet()) {
            System.out.println(keyAndValue.getKey() + "-" + keyAndValue.getValue());
        }
    }
}

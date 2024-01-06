package day23;

import java.util.Iterator;
import java.util.TreeSet;

public class _04_Sets {
    public static void main(String[] args) {

        TreeSet<String> renkler = new TreeSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");
        renkler.add("RED");

        // Ekrana yazdırma (fotoğraf)
        System.out.println("renkler = " + renkler);

        // Ekrana tek tek nasıl yazdırırım
        for (String eleman : renkler) // sıra garanti değil
            System.out.println("eleman = " + eleman);

//        int[] dizi={34,5,6,7,8,89,899,77};
//        for(int eleman : dizi)
//            System.out.println("eleman = " + eleman);

        // SETLERİ hafızadaki sırasına göre nasıl garanti olarak alırdım ?
        Iterator gosterge = renkler.iterator(); // renklerin başına konumlandı
        while (gosterge.hasNext()) // sıradaki eleman var ise
        {
            System.out.println("renkler = " + gosterge.next());
            // sıradaki eleman
            // .Next gostergenin gösterdiği elemanı temsil ediyor
        }
    }
}

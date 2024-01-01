package day21;

import java.util.ArrayList;

public class _04_ArrayList {

    public static void main(String[] args) {

        int sayi = 5;             // 1 tane sayı tutabilen ve ismi sayi olan hafıza bölgesi
        int[] dizi = new int[5];  // 5 tane sayı tutabilen ve ismi dizi olan hafıza bölgesi (apartman)
        // 5 tane 5 kalıyor, 3 tane kullansan 2 tanesi atıl kalıyor, uzunluk hep sabit
        // ARRAY

        // dizinin yerine şöyle bir şey olsa, uzunluğu başta hiç olmasa, ben ekledikçe artsa
        // sildikçe azalsa , yani alışveriş listesi gibi, boyutu esnek olsun
        // dizini kuzeni : ARRAY in LİST hali

        ArrayList<Integer> list = new ArrayList<>(); // ekledikçe uzayacak, sildikçe kısalacak
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Double> doubleList = new ArrayList<>();

        ArrayList<String> isimler = new ArrayList<>();
        System.out.println("isimler = " + isimler);// direkt fotoğraf

        isimler.add("Burak"); // eleman ekleme
        isimler.add("Aslı");
        isimler.add("Selda");
        isimler.add("Serkan");

        System.out.println("isimler = " + isimler);
        System.out.println("isimler.size() = " + isimler.size());

        isimler.add(1, "Mertcan"); // araya ekleme, diğerleri bir üste kayar
        System.out.println("isimler = " + isimler);

        isimler.set(2, "Ulvi");  // verilen indexdeli, elemanı değiştirmek
        System.out.println("isimler = " + isimler);

        boolean varMi = isimler.contains("Burak");
        System.out.println("varMi = " + varMi);

        isimler.remove(1); // rakam verildiğinde index olarak görür ve siler
        System.out.println("isimler = " + isimler);

        int indexOfSelda = isimler.indexOf("Selda"); // verilenin indexi ni gönderir
        System.out.println("indexOfSelda = " + indexOfSelda);

        String ilkEleman = isimler.get(0); // verilen indexdeki elemanı verir
        System.out.println("ilkEleman = " + ilkEleman);

        isimler.clear(); // Listi temizler
        System.out.println("isimler = " + isimler);
    }
}

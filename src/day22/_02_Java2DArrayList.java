package day22;

import java.util.ArrayList;

public class _02_Java2DArrayList {

    public static void main(String[] args) {

        int sayi = 5; // tek bir rakam saklayabilen değişken.
        int[] dizi = new int[10]; // 10 elemanlı tek boyutlu bir hafıza bölgesi 1D
        int[][] tablo = new int[2][5]; // 10 eleman ama 2 satır halinde 2D

        ArrayList<Integer> liste = new ArrayList<>(); // tek satır 1D, ucu açık

        // bir öğretmenin notDefteri olsun
        ArrayList<Integer> matNotlari = new ArrayList<>(); // ayrı yaprak, liste, 1D
        ArrayList<Integer> fizNotlari = new ArrayList<>(); // ayrı yaprak, liste, 1D
        ArrayList<Integer> kimNotlari = new ArrayList<>(); // ayrı yaprak, liste, 1D

        matNotlari.add(50);
        matNotlari.add(70);
        matNotlari.add(80);

        fizNotlari.add(40);
        fizNotlari.add(60);

        kimNotlari.add(90);
        kimNotlari.add(50);
        kimNotlari.add(60);
        kimNotlari.add(87);

        /******************************/
        ArrayList<ArrayList<Integer>> notlarListesi = new ArrayList<>();
        notlarListesi.add(matNotlari);
        notlarListesi.add(fizNotlari);
        notlarListesi.add(kimNotlari);

        matNotlari.get(0);  // mat notlarının ilkini verir.
        notlarListesi.get(0).get(0); // 0.listenin, 0.elemanı , aynı satır sütun gibi.
        // defterin.  0.Sayfasının.   0.Elemanı
        // notlarListesi.get(0)  -> ilk eklenen listeyi verir
        notlarListesi.get(0).add(67);  // matNotlarına 1 eleman daha eklendi

        for (int i = 0; i < notlarListesi.size(); i++) { // notlar.length

            for (int j = 0; j < notlarListesi.get(i).size(); j++) {  //notlar[i].length
                System.out.print(notlarListesi.get(i).get(j) + "\t"); // notlar[i][j]
            }
            System.out.println();
        }
    }
}

package day23;

import java.util.ArrayList;

public class _01_Sets {

    public static void main(String[] args) {

        int sayi = 5;

        int[] dizi = new int[10];      // 1D
        int[][] tablo = new int[2][5]; // 2D

        ArrayList<Integer> liste = new ArrayList<>();               // 1D
        ArrayList<ArrayList<Integer>> listeler = new ArrayList<>(); // 2D

        /********************************************************/

        // Javacım senden şu ana kadar lazım durumda uygun değişkenleri aldım, teşekkür ederim.
        // fakat bana şöyle dizi lazım; içine verileri attığımda tekrar eden veri gelirse EKLEMESİN,
        // 2.cisi, bu dizi
        // a) istersem, ne eklersem ekliyim, herzaman içindekileri SIRALI tutsun,
        // b) istersem, eklenme sırasında tutsun
        // c) istersem, en hızlı çalışmak için, kendisi istediği sırada tutsun

        // Tek tek eleman eleman işlemler için değil de, işlem yapılacağı zaman, bütün elemanların işleme
        // alınmasına uygun olan bu toplu işlem dizisine SET denir.
        // a) TreeSet       -> her zaman sıralı
        // b) LinkedHashSet -> eklenme sırasına göre
        // c) HashSet       -> hızlı çalışsın sırası önemli değil

        // Bunlarda INDEX yok
    }
}

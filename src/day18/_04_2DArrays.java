package day18;

public class _04_2DArrays {

    public static void main(String[] args) {

        int[] dizi = new int[10]; // 10 tane, elemanları boş dizi,  default 0
        int[] dizi2 = {2, 3, 4, 5, 66, 7, 8, 99, 23, 3}; // 10 tane , elemanları dolu bir dizi

        int[][] tablo = new int[2][5]; // 2 satırlı, 5 sütunlu, 10 elemanlı

        int[][] tablo2 = {{5, 6, 7, 34, 5},   // 1.satır
                {56, 7, 89, 34, 6}    // 2.satır
        };

        //1.Yöntem
        for (int i = 0; i < 5; i++) { // bu for ilk satırın tüm elemnalarını yazdırır
            System.out.println(tablo2[0][i]);
        }

        for (int i = 0; i < 5; i++) { // bu for 2. satırın tüm elemnalarını yazdırır
            System.out.println(tablo2[1][i]);
        }
        System.out.println("*****");

        // 2.yöntem
        for (int satir = 0; satir < 2; satir++) {       // 2 satır
            for (int sutun = 0; sutun < 5; sutun++) {   // 5 sütun
                System.out.print(tablo2[satir][sutun] + "\t");
            }
            System.out.println();
        }
    }
}

package day16;

import java.util.Scanner;

public class _06_JavaArray {
    public static void main(String[] args) {
        // Dizi nasıl okunur ve nasıl yazdırılır ?

        Scanner oku = new Scanner(System.in);
        int[] dizi = new int[10];

        for (int i = 0; i < dizi.length; i++) {
            System.out.print("dizinin " + i + ".elemanı=");
            dizi[i] = oku.nextInt();
        }

        for (int i = 0; i < dizi.length; i++)
            System.out.println("dizi[" + i + "]=" + dizi[i]);

        // For döngüsünde duracak nokta olarak sabit son rakamı
        // vermek yerine, dizi.length şeklinde kullanılırsa,
        // daha sonradan dizi boyutu değiştirildiğinde ,
        // for ların son duracağı noktaları değiştirmek
        // zorunda kalmayız
    }
}

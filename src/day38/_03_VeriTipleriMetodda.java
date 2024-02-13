package day38;

import java.util.Arrays;

public class _03_VeriTipleriMetodda {
    public static void main(String[] args) {
        //ilkel tipler
        int sayi = 5;
        sayiArtir(sayi);
        System.out.println("sayi = " + sayi);

        // referans tip
        int[] dizi = {1, 2, 3};
        diziSifirla(dizi);
        System.out.println("dizi = " + Arrays.toString(dizi)); //0,0,0

        //String yine ilkel tip gibi davranacak, nesne tipler
    }

    public static void diziSifirla(int[] dizi2) { // dizi1=dizi2
        dizi2[0] = 0;
        dizi2[1] = 0;
        dizi2[2] = 0;
    }

    public static void sayiArtir(int a) {  // sayi=a, sayinin değeri geldi, kendisi geldi
        a++; // 6
    }
}

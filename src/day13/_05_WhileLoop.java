package day13;

public class _05_WhileLoop {
    public static void main(String[] args) {
       // Ekrana 5 kez merhaba yazdırınız
//      1- sayac=0;
//      2- "merahaba" yaz
//      3- sayac=sayac+1
//      4- sayac < 5 => 2 ye git

        int sayac=0;

        while (sayac < 5) {  // şart sağlandığı sürece DÖN
            System.out.println("merhaba");
            sayac = sayac + 1;   // sayac++;
        }

        System.out.println("program bitti");
    }
}

package day20;

public class _03_JavaMethod {

    public static void main(String[] args) {

        merhabaYaz();  // veri almayan ve veri döndürmeyen
        merhabaYaz();

        merhabaYazIsme("ismet"); // veri alıyor fakat döndürmüyor
        merhabaYazCok(5);     //veri alıyor fakat döndürmüyor
    }

    public static void merhabaYaz() {
        System.out.println("Merhaba Dünya");
    }

    public static void merhabaYazIsme(String ad) {
        System.out.println("Merhaba " + ad);
    }

    public static void merhabaYazCok(int miktar) { // başla
        for (int i = 0; i < miktar; i++) {
            System.out.println("Merhaba");
        }
    }//dur
}

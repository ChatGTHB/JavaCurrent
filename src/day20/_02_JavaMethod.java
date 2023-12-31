package day20;

public class _02_JavaMethod {
    public static void main(String[] args) {

        double rastgeleSayi = Math.random();  // veri almıyor ama geriye veri döndürüyor
        int max = Math.max(5, 6);             // veri alıyor ve geriye veri döndürüyor
        System.out.println();                 // veri almıyor ve geriye veri döndürmüyor

        System.out.println("Merhaba Dünya"); // veri alıyor, geriye dönüş yok
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");

        merhabaYaz();// veri almıyor ve geri bir şey göndermiyor
        merhabaYaz();
        merhabaYaz();
    }

    public static void merhabaYaz() {
        System.out.println("Merhaba Dünya_metod");
    }
}

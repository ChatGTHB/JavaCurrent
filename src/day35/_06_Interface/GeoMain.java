package day35._06_Interface;

public class GeoMain {

    public static void main(String[] args) {

        Dikdortgen d = new Dikdortgen(4, 5);
        System.out.println(d.alani());
        System.out.println(d.cevresi());

        Kare k = new Kare(5);
        System.out.println(k.alani());
        System.out.println(k.cevresi());
    }
}

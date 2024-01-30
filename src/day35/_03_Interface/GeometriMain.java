package day35._03_Interface;

public class GeometriMain {

    public static void main(String[] args) {

        Cember c = new Cember();
        c.ciz();

        Dikdortgen d = new Dikdortgen();
        d.ciz();

        Kare k = new Kare();
        k.ciz();
        // Interfacelerden nesne üretilemez fakat referans tipi
        // oluşturulabilir. Bunu bize Polymorphism sağladı.
        ICizdirir d2 = new Dikdortgen();
    }
}

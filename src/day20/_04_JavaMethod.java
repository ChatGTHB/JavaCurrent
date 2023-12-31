package day20;

public class _04_JavaMethod {
    public static void main(String[] args) {

        // bir sayının tek mi çift mi olduğunu yazdırınız.
        int sayi = 55;

        // 1.Yöntem
        if (sayi % 2 == 0) System.out.println("Çift");
        else System.out.println("Tek");

        //2.Yöntem
        tekMiCiftMiYaz(60);
        tekMiCiftMiYaz(55);
        tekMiCiftMiYaz(46);
    }

    public static void tekMiCiftMiYaz(int sayi) {
        if (sayi % 2 == 0) System.out.println(sayi + " : Çift");
        else System.out.println(sayi + " : Tek");
    }
}

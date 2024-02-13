package day38;

public class _05_CharVeSayi {
    public static void main(String[] args) {
        // char aslında arka planda sayı  , karakter tablosu ASCII tablosu

        char basHarf = 'A';
        int sayi = 65;
        char harf2 = (char) sayi; // bu sayının tablodaki karşılığına bakıyor

        System.out.println("basHarf = " + basHarf);
        System.out.println("harf2 = " + harf2);

        // katakter tablosunda ABCD... Z   -32-  abcd....z
        char harf3 = (char) 97;
        System.out.println("harf3 = " + harf3);

        for (int i = 0; i <= 255; i++) {
            char harf = (char) i;
            System.out.println(i + ".harf = " + harf);
        }
    }
}

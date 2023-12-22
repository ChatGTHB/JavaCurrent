package day14;

public class _05_ForLoop {
    public static void main(String[] args) {

        // 1 den 5 e kadar olan sayıları ekrana yazdırınız.

        int sayac = 1;
        while (sayac <= 5) {

            System.out.println("sayac while = " + sayac);
            sayac++;
        }

        // Javayı yazanlar demişlerki
        // bir döngünü başı belli, sonu belli, artış değeri belli ise
        // daha kolayı var
        for (sayac = 1; sayac <= 5; sayac++)  // %65
            System.out.println("sayac for = " + sayac);

        // Döngü Kuralı :
        // bir döngünün kaç kere döneceği belli ise : FOR
        // bir döngünü kaç kere döneceği belli DEĞİL ise : WHİLE
        // while durumnda Kontrol SONDA ise : DO_WHİLE
    }
}

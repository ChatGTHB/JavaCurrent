package day15;

public class _02_ForLoop {
    public static void main(String[] args) {

        // 1 den 100 kadar olan çift sayıların toplamını bulunuz.
        // aynı zaman da ,Toplam değeri 60 ı geçtiğinde
        // 60 geçtiniz yazdırınız.
        // 60 ı geçtiğinde döngü dursun

        // Döngünün paramatreleri neler :
        // başlangıç değer :2
        // sınır değer 100
        // artış değeri 2 şer

        int toplam = 0;
        for (int i = 2; i < 100; i = i + 2) {
            toplam = toplam + i;

            if (toplam > 60) {
                System.out.println("60 ı geçtiniz");
                break; // break çalıştığında içindeki
                // döngüyü kırar, bitirir
            }
        }
        System.out.println("toplam = " + toplam);
    }
}

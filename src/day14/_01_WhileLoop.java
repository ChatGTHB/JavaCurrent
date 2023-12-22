package day14;

public class _01_WhileLoop {
    public static void main(String[] args) {

        // 1 den 100 e kadar olan sayıların toplamını bulunuz

        // Döngünün içinde neler olacak ?
        // toplam=toplam+sayac
        // sayac++
        // döngü şartı sayac < 100

        int sayac = 1, toplam = 0;

        while (sayac < 100) {
            toplam = toplam + sayac;
            sayac++;
        }
        System.out.println("toplam = " + toplam);
    }
}

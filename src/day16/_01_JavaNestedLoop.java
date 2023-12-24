package day16;

public class _01_JavaNestedLoop {
    public static void main(String[] args) {

        //  Aşağıdaki görünümü tek yıldız kullanarak yazdırınız.
        //  *****
        //  *****
        //  *****
        //  *****
        //  *****

        for (int j = 1; j <= 5; j++) {
            // Yukarıdaki döngü bu döngüyü 5 kez çalıştır
            for (int i = 1; i <= 5; i++) {
                System.out.print("*"); // 25 kez çalışır}
            }
            System.out.println();
        }
    }
}
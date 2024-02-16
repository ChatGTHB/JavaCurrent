package day39;

public class _05_TryCatchFinaly {
    public static void main(String[] args) {

        System.out.println("Program başladı");
        String str = "";
        long startTime = 0;

        try {
            startTime = System.currentTimeMillis();
            System.out.println("Hatadan önceki kısım");
            char ilkHarf = str.charAt(3);
            System.out.println("Hatadan sonraki kısım");
        } catch (Exception ex) {
            System.out.println("Hata olduğunda çalışan kısım");
        } finally  //hata olsada çalışır , olmasada çalışacak kısım,
        {
            long gecenSure = System.currentTimeMillis() - startTime;
            System.out.println("gecenSure = " + gecenSure);
            System.out.println("try-catch bloğuyla ilgili son yapılacaklar");
        }

        System.out.println("diğer kodlar");
        System.out.println("program bitti");
    }
}

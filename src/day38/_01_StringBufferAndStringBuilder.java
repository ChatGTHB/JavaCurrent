package day38;

public class _01_StringBufferAndStringBuilder {

    public static void main(String[] args) {

        String cumle = "";

        cumle = cumle + "Bugün"; // + işareti stringlerde birleştirme yapar
        cumle = cumle + " hava";
        cumle = cumle + " soğuk";

        System.out.println(cumle + " ve karlı");
        System.out.println(cumle); // atanmazsa en son hali geçerli

        cumle.concat(", yaz mevsimini arıyoruz"); // concat de birleştirme yapar
        System.out.println(cumle);
        cumle = cumle.concat(", yaz mevsimini arıyoruz"); // atama gerektirir
        System.out.println(cumle);

        System.out.println("\n****   StringBuilder *****");
        /****   StringBuilder *****/
        String cumle2 = "Bugün" + // atama gerektirmez
                " hava" +
                " soğuk";

        System.out.println(cumle2);

        // +,concat, append(sb) : neden 3 tane var

        long startTime = System.currentTimeMillis();
        String test1 = "";
        for (int i = 0; i < 30000; i++)
            test1 = test1 + " merhaba";

        System.out.println("+ için geçen süre = " + (System.currentTimeMillis() - startTime) + " ms");

        startTime = System.currentTimeMillis();
        String test2 = "";
        for (int i = 0; i < 30000; i++)
            test2 = test2.concat(" merhaba");

        System.out.println("concat için geçen süre = " + (System.currentTimeMillis() - startTime) + " ms");

        startTime = System.currentTimeMillis();
        StringBuilder test3 = new StringBuilder();
        for (int i = 0; i < 30000; i++)
            test3.append(" merhaba"); // otomatik kendine ekliyor

        System.out.println("StringBuilder için geçen süre = " + (System.currentTimeMillis() - startTime) + " ms");

        // Performans testi sonucu :
        // eğer 3 kadar ekleme işlemi olacaksa + kullanılır, pratik olduğu için
        // ancak daha fazla ekleme olacaksa 10 adede kadar concat kullanılabilir
        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır.

        System.out.println("***********************\n\n");
        /****** StringBuilder ı biraz yakından tanıyalım    ***/
        StringBuilder sb = new StringBuilder();
        sb.append("Bugün");  // kendine ekleme, atama gerektirmez, (+ da ve concat de gerekirdi)
        sb.append(" hava");
        sb.append(" soğuk");
        System.out.println("sb = " + sb);

        System.out.println("sb.length() = " + sb.length());
        sb.append(4); // eklenen diğer tipleri string otomatik çevirip ekler
        System.out.println("sb = " + sb);

        sb.reverse(); // String tersine çeviriyor
        System.out.println("sb = " + sb);
        sb.reverse();
        System.out.println("sb = " + sb);

        sb.delete(0, 5); // (index)0 dahil , 5 hariç olmak üzere siler.
        System.out.println("sb = " + sb);

        sb.deleteCharAt(3); // sadece belirtilen index deki karakteri siler
        System.out.println("sb = " + sb);

        sb.insert(5, "kelime "); // 5 nolu index e kelime yi ekle : araya ekleme
        System.out.println("sb = " + sb);

        sb = new StringBuilder("Bugün hava soğuk");
        System.out.println("sb = " + sb);
        sb.replace(3, 8, "bu");
        System.out.println("sb = " + sb); // verilen aralığı bu stringle değiştir

        String strSb = sb.toString(); // bütün string fonk kullanılabilir.


        StringBuffer sBuffer = new StringBuffer(); // tamamen StringBuilder ile aynı
        // tek farkı, paralel çalıan yazılımlarda, StringBuffer kullanılır
        // örnek olarak oyunlarda aynı anda çıkan düşman savaşçı aynı anda ateş ediyor, alttada bir log olsa
        // yapılan işlemleri yazan string olarak bu durumda pararlel olan bu çalışmaya uygun sıralı birleştirme yapabilmesi lazım
        // işte bu gibi durumlarda kullanılır.
    }
}
















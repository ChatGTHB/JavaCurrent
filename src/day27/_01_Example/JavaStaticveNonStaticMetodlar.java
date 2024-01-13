package day27._01_Example;

public class JavaStaticveNonStaticMetodlar {

    public static void main(String[] args) {

        Utility utility = new Utility(); // nesne
        int randomSayi1 = utility.randomSayiVer(10);
        // nesne ye bağlı (static yok)
        // metodun içinde nesneye ait özellikler(field)
        // kullanılacaksa, yani içinde thisle belirtilen
        // değişkenler kullanılacaksa STATIC YOK

        int randomSayi2 = Utility.randomSayiVer2(10);
        // static : zaten var, oluşturulmaya ihtiyacı yok
        // yani nesnenin oluşturulmasına ihtiyaç yok
        // tipin adı ile direk kullanılabilir.
        // içinde NESNE ye ait değişkenler kullanılmayacak
        // ise ozaman hızlı ve pratik kullanım için
        // ve programları her yerinden direkt çağırabilmek
        // için STATIC kelimesi eklenir.
        // Math.Max() gibi kulalnılacak toollar için
        // static kullanılır. STATIC metodların içinden
        // ANCAK direkt olarak STATIC metodları çağrılabilir.
        // Bir diğer kullanım amacı: TİPİ ilgilendiren
        // metodlar içinde STATIC kullanılılabilir.
    }
}

package day38;

public class _04_StringKarsilastirma {
    public static void main(String[] args) {
        String kelime1="merhaba";
        String kelime2="merhaba";

        if (kelime1 == kelime2)
            System.out.println("Eşit 1 ");

        if (kelime1.equals(kelime2))
            System.out.println("Eşit 2");

        System.out.println("********************");

        String kelime3=new String("merhaba"); // scnanner
        String kelime4=new String("merhaba"); // scnanner
        if (kelime3 == kelime4) //referansları karşılatırıyor
            System.out.println("Eşit 3 ");

        if (kelime3.equals(kelime4)) // değerleri karşılaştırıyor
            System.out.println("Eşit 4");

        // Çünkü ==  REFERANSLARI karşılaştırır
        // equals ise DEĞERLERİ kaşrılaştırır

    // ÖZET : Nesne(String) ve referans(dizi,ArrayList,Nesneler) tiplerde
        //        HERZAMAN EQUALS kullanılır.
        //        İlkel (Sayısal, boolean) tiplerde == kullanılır

    }
}

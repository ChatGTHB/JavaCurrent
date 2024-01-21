package day30._03_Example;

public class QuestionOfTheDay {

    static int b = 0; // sen bi tanesin, tipe ait sadece 1 tane
    int a; // her nesnenin a sı var

    public static void main(String[] args) {

        QuestionOfTheDay questionOfTheDay1 = new QuestionOfTheDay();
        questionOfTheDay1.a = 5;

        QuestionOfTheDay questionOfTheDay2 = new QuestionOfTheDay();
        questionOfTheDay2.a = 7;

        // Example 1 :
        // a nın değeri şu anda kaç oldu ? a yı yazdırsam kaç yazar?

        // Verilecek cevap şu : Hocam hangi a yı soruyorsun,
        System.out.println("gununSorusu1.a = " + questionOfTheDay1.a); // 5, b=0
        System.out.println("gununSorusu2.a = " + questionOfTheDay2.a); // 7, b=0

        // Example 2 : b'nin değeri şu anda kaçtır ?
        System.out.println("GununSorusu.b = " + QuestionOfTheDay.b); // 0

        // Example 3 :
        questionOfTheDay1.artir(); // gununSorusu1.a sı 1 tane arttı : 6  , b 1 arttı
        questionOfTheDay2.artir(); // gununSorusu2.a sı 1 tane arttı : 8  , b 1 arttı
        // Şu anda a nın ve b nin değeri kaçtır

        System.out.println("gununSorusu1.a = " + questionOfTheDay1.a); // 6
        System.out.println("gununSorusu2.a = " + questionOfTheDay2.a); // 8
        System.out.println("GununSorusu.b = " + QuestionOfTheDay.b); // 2
    }

    void artir() {
        a++;
        b++;
    }
}

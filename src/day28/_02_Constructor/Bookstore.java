package day28._02_Constructor;

public class Bookstore {
    public static void main(String[] args) {

        Book kitap1 = new Book();
        kitap1.name = "Harry Potter";
        kitap1.publishYear = 1997;
        kitap1.author = "JK Rowling";

        Book kitap2 = new Book("Yüzükler", 1954, "JRR Tolkien");

        Book kitap3 = new Book("Çay ve Kuru Üzüm");

        kitap1.kitapYazdir();
        kitap2.kitapYazdir();
        kitap3.kitapYazdir();
    }
}

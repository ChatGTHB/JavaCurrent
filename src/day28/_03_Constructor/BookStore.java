package day28._03_Constructor;

public class BookStore {

    public static void main(String[] args) {

        Book kit1 = new Book();
        kit1.name = "Harry Poter";
        kit1.author = "JK Rowling";
        kit1.publishYear = 1997;

        System.out.println(kit1);
    }
}

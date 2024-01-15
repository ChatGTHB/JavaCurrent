package day28._03_Constructor;

public class BookStore {

    public static void main(String[] args) {

        Book book1 = new Book();
        book1.name = "Harry Poter";
        book1.author = "JK Rowling";
        book1.publishYear = 1997;

        System.out.println(book1);
    }
}

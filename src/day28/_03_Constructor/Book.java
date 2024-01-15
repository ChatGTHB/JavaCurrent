package day28._03_Constructor;

public class Book {
    String name;
    int publishYear;
    String author;

    public Book() {
        this("", 0, "");// parametreden ilgili Yapıcı metoda gider.
        // this : yapıcı metod
    }

    public Book(String name) {
        //this.name = name;
        this(name, 0, ""); // parametreden ilgili Yapıcı metoda gider.
    }

    public Book(String name, int publishYear, String author) {
        this.name = name;
        this.publishYear = publishYear;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" + "name='" + name + '\'' + ", publishYear=" + publishYear + ", author='" + author + '\'' + '}';
    }
}

package day28._03_Constructor;

public class Book {
    String name;
    int publishYear;
    String author;

    // Default constructor
    public Book() {
        this("", 0, ""); // Calls the constructor with all parameters.
        // 'this' is used to call the constructor
    }

    // Constructor with only the name
    public Book(String name) {
        this(name, 0, ""); // Calls the constructor with all parameters.
    }

    // Constructor with all fields
    public Book(String name, int publishYear, String author) {
        this.name = name;
        this.publishYear = publishYear;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", publishYear=" + publishYear +
                ", author='" + author + '\'' +
                '}';
    }
}

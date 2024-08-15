package day28._02_Constructor;

public class Book {
    String name;
    int publishYear;
    String author;

    // Default constructor
    Book() {
        // When a parameterized constructor is added,
        // it's necessary to define the no-argument constructor as well.
        this.name = "";
        this.publishYear = 0;
        this.author = "";
    }

    // Constructor with all fields
    Book(String name, int publishYear, String author) {
        this.name = name;
        this.publishYear = publishYear;
        this.author = author;
    }

    // Constructor with only the name field
    Book(String name) {
        this.name = name;
        this.publishYear = 0;
        this.author = "";
    }

    // Method to print book details
    void printBookDetails() {
        System.out.println(this.name + " " + this.publishYear + " " + this.author);
    }
}

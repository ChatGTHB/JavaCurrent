package day28._02_Constructor;

public class Bookstore {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.name = "Harry Potter";
        book1.publishYear = 1997;
        book1.author = "J.K. Rowling";

        Book book2 = new Book("The Lord of the Rings", 1954, "J.R.R. Tolkien");

        Book book3 = new Book("Tea and Dried Grapes");

        // Printing the details of each book
        book1.printBookDetails();
        book2.printBookDetails();
        book3.printBookDetails();
    }
}

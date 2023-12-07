package day08;

public class _04_StringToUpperCase {
    public static void main(String[] args) {

        // ToUpperCase : Returns the uppercase form of the string

        String text = "hello world!";

        System.out.println("text = " + text);                               // hello world!
        System.out.println("text.toUpperCase() = " + text.toUpperCase());   // HELLO WORLD!

        System.out.println("text.startsWith(M) = " + text.startsWith("M")); // false
        System.out.println("text.toUpperCase().startsWith() = " + text.toUpperCase().startsWith("H")); // true
    }
}

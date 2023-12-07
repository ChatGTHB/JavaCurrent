package day08;

public class _03_StringToLowerCase {
    public static void main(String[] args) {

        // toLowerCase : Converts string to lowercase

        String text = "Hello World!";

        System.out.println("text = " + text);                              // Hello World!
        System.out.println("text.toLowerCase() = " + text.toLowerCase());  // hello world!

        System.out.println("text.startsWith(m) = " + text.startsWith("m")); // false
        System.out.println(text.toLowerCase().startsWith("h"));             // true
    }
}

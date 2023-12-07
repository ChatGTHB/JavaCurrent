package day08;

public class _02_StringEndsWith {
    public static void main(String[] args) {

        // EndsWith("")  : Does it end with the given characters?
        // boolean

        String text = "Manisa";

        System.out.println("text.endsWith(sa) = " + text.endsWith("sa")); // true
        System.out.println("text.endsWith(a) = " + text.endsWith("a"));   // true
        System.out.println("text.endsWith(Ma) = " + text.endsWith("Ma")); //false
    }
}

package day08;

public class _07_StringReplaceFirst {
    public static void main(String[] args) {

        // ReplaceFirst: replaces only the first of the character/s in a string with the given one

        String text = "Hello World!";
        System.out.println("text = " + text);

        System.out.println("text.replaceFirst(e,a) = " + text.replaceFirst("e", "a"));      // Hallo World!
        System.out.println("text.replaceFirst(lo, de) = " + text.replaceFirst("lo", "de")); // Helde World!
        System.out.println("text.replaceFirst(e, aaa) = " + text.replaceFirst("e", "aaa")); // Haaallo World!
        System.out.println("text.replaceFirst(e,  ) = " + text.replaceFirst("e", ""));      // Hllo World!
        System.out.println("text.replaceFirst(e,***) = " + text.replaceFirst("e", "***"));  // H***llo World!
    }
}

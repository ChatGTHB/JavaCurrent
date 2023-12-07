package day08;

public class _06_StringReplace {
    public static void main(String[] args) {

        // replace: replaces the character/s in a string with the given one, converts them all

        String text = "Hello World!";
        System.out.println("text = " + text);

        System.out.println("text.replace(e,a) = " + text.replace("e", "a"));      // Hallo World!
        System.out.println("text.replace(lo, de) = " + text.replace("lo", "de")); // Helde World!
        System.out.println("text.replace(e, aaa) = " + text.replace("e", "aaa")); // Haaallo World!
        System.out.println("text.replace(o,  ) = " + text.replace("o", ""));      // Hell Wrld!
        System.out.println("text.replace(e,***) = " + text.replace("e", "***"));  // H***llo World!
    }
}

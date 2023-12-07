package day07;

public class _01_StringIndexOf {
    public static void main(String[] args) {

        // IndexOf(letters)           -> give Index of given letters
        // Today returns IndexOf("T") -> 0

        //            012345678
        String sentence = "Hello World!";

        System.out.println("sentence.indexOf(H) = " + sentence.indexOf("H"));   // 0
        System.out.println("sentence.indexOf(l) = " + sentence.indexOf("l"));   // 2
        System.out.println("sentence.indexOf(o) = " + sentence.indexOf("o"));   // 4
        System.out.println("sentence.indexOf(Wo) = " + sentence.indexOf("Wo")); // 6
        System.out.println("sentence.indexOf( ) = " + sentence.indexOf(" "));   // 5
        System.out.println("sentence.indexOf(A) = " + sentence.indexOf("A"));   // -1  not
        System.out.println("sentence.indexOf(z) = " + sentence.indexOf("z"));   // -1

        System.out.println("sentence.indexOf(l,3) = " + sentence.indexOf("l", 3)); // 3
        // Start searching after 3

        System.out.println("sentence.indexOf(l,7) = " + sentence.indexOf("l", 7)); // 9
        // Start searching after 7
    }
}

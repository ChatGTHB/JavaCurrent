package day07;

public class _05_StringContains {

    public static void main(String[] args) {

        // contains : Returns whether the searched letter/s are in the string or not
        // Returns the result in boolean

        String sentence = "Hello World!";

        boolean isThere = sentence.contains("o");  // true
        System.out.println("isThere = " + isThere);

        System.out.println("isThere o= " + sentence.contains("o"));   // 2.yöntem
        System.out.println("isThere lo =" + sentence.contains("lo")); // true
        System.out.println("isThere z =" + sentence.contains("z"));   // false
        System.out.println("isThere aü =" + sentence.contains("aü")); // false
    }
}

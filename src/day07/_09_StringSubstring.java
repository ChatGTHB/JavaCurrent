package day07;

public class _09_StringSubstring {
    public static void main(String[] args) {

        // Substring: Gets a fragment from a string
        //         012345678901234567
        String s1 = "Hello, members of the Association of Lovers of Java";

        String part1 = s1.substring(3, 9); // Start from 3 to 9
        // Index in 3 parameters, get from 3 to 9, 9 not included
        System.out.println("part1 = " + part1); // lo, me

        System.out.println("s1.substring(8,15) = " + s1.substring(8, 15));
        // embers

        System.out.println("s1.substring(8) = " + s1.substring(8));
        // embers of the Association of Lovers of Java
    }
}

package day07;

public class _07_StringEqualsIgnoreCase {
    public static void main(String[] args) {

        // EqualsIgnoreCase
        // equals works the same, it just doesn't distinguish between case and case

        String s1 = "heLlO";
        String s2 = "HelLO";

        System.out.println("s1.equals(s2) = " + s1.equals(s2));                     // false
        System.out.println("s1.equalsIgnoreCase(s2) = " + s1.equalsIgnoreCase(s2)); // true
    }
}

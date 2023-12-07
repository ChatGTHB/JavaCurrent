package day07;

public class _06_StringEquals {
    public static void main(String[] args) {

        // Equals: Asks if 1 string is equal to the other
        // result boolean

        String s1 = "hello";
        String s2 = "HELLO";

        boolean result = s1.equals(s2);            // Is S1 equal to S2?
        System.out.println("isEquals= " + result); // false

        System.out.println("isEquals= " + s1.equals(s2));      // Method 2  false
        System.out.println("isEquals= " + s1.equals("hello")); // true
    }
}

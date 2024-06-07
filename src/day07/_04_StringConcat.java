package day07;

public class _04_StringConcat {

    public static void main(String[] args) {

        // concat : concatenates one string to another

        String s1 = "Hello";
        String s2 = "World!";

        System.out.println("unified version= " + s1 + s2);
        System.out.println("unified version= " + s1.concat(s2)); // unified version
        System.out.println("unified version= " + s1.concat(" ").concat(s2));
        System.out.println("unified version= " + s1.concat(" " + s2));

        System.out.println("s1 = " + s1); // The value of S1 has not changed
        System.out.println("s2 = " + s2); // The value of S2 has not changed
    }
}

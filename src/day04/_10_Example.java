package day04;

public class _10_Example {

    public static void main(String[] args) {

        String name = "Joseph Burns";
        int classNumber = 5;
        char branch = 'A';
        boolean isPass = true;

        System.out.println(name + " " + classNumber + " " + branch + " " + isPass);
        // I go from left to right to combine.
        // If there is a string on the left, I automatically convert it to a string next to it, that is, I add it.

        System.out.println("Hello!" + 1 + 2); // Hello!12
        System.out.println(1 + 2 + "Hello!"); // Hello!
        // Since it came from the left, it first added 1+2 to 3, and then when it came to the hello string, it was ADDED to it.

        // How to convert numbers to String?
        int number = 56;
        String strNumber = String.valueOf(number); //You have converted the number to string
    }
}

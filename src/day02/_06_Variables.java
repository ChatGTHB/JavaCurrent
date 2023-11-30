package day02;

public class _06_Variables {
    public static void main(String[] args) {

        int number; // I said allocate enough space to store an integer as much as an int, I called it number

        int Number; // number Number is completely different like a and z
        int numbEr; // completely different
        int total;  // The name should be meaningful, it should be clear what it is used for,
        // and it should not be so long that it would be difficult to write.

        number = 5; // I assigned the value 5 to the place named number in memory
        System.out.println("number"); // If it is between "", I will write it exactly
        System.out.println(number); // I write the VALUE, I know it is the Variable name

        // I want to give a nice output like Number Value = 5
        System.out.print("Number Value=");
        System.out.println(number);

        // How would I write the same in a single print?
        System.out.println("Number Value=" + number);
        // + means concatenation when one side is a word
    }
}

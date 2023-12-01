package day04;

public class _01_JavaString {

    public static void main(String[] args) {

        int number = 0; //int: type, number: name of the variable, 0: initial value

        String name = "Joseph";

        System.out.println("number = " + number); // number = 0
        System.out.println("name = " + name);     // ad = ismet

        String surname = "Burns";
        System.out.println("surname = " + surname); // surname = Burns

        String fullName = name + " " + surname;  // The "+" sign functions as addition in numbers and addition in words.
        System.out.println("fullName = " + fullName); // fullName = Joseph Burns

        System.out.println("Full Name = " + name + " " + surname); // method 2
    }
}

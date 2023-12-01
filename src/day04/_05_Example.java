package day04;

public class _05_Example {

    public static void main(String[] args) {

        /**
         10/3 ->  3.333333    expected situation
         Let's talk about what the computer does
         int/int -> It gives the integer part, so 10/3   -> 3
         */

        /**
         If you want a fractional result, at least one of them must be a double so that the computer will give a flawed result.
         double/int or int/double or double/double must be -> 3.33333
         */

        int number1 = 10;
        int number2 = 3;

        int fullResult = number1 / number2;  // int/int
        System.out.println("fullResult = " + fullResult); // 3

        // If you want fractional results
        double doubleResult = number1 / (double) number2;
        System.out.println("doubleResult = " + doubleResult); // 3.33333
    }
}

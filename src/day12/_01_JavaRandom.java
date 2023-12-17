package day12;

public class _01_JavaRandom {
    public static void main(String[] args) {

        // Math.Random() : Produces a double number. Produces from 0 to 0.9999999999.
        // System.out.println(Math.random());

        int randomNumber = (int) (Math.random() * 25);
        System.out.println("randomNumber = " + randomNumber);
    }
}

//        0 - 0,9999999999
//
//        Up to 10    -> 9 max
//        Up to 100   -> 99 max
//        Up to 25    -> 24 max
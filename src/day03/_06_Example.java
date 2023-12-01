package day03;

public class _06_Example {
    public static void main(String[] args) {

        /**
         Give the person's weight (kg) and height (m) yourself.
         weight and height fractional, for example 65.4 weight, 1.65 m
         After writing your weight: .... and height = .... on the screen
         Find the body mass index: weight (height weight)
         */

        double weight = 65.4;
        double height = 1.65;
        double bodyMassIndex = weight / (height * height);

        System.out.println("Your weight=" + weight + " Your height=" + height);
        System.out.println("Your body mass index=" + bodyMassIndex);
    }
}

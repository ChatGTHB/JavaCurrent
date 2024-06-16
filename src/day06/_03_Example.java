package day06;

import java.util.Scanner;

public class _03_Example {

    public static void main(String[] args) {

        // Take the user's weight (kg) as double, height (m) as double and print your height ... and weight ... on one line.
        // Also find the body mass index and print it in (kg/ (height*height))

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight (kg)= ");
        double weight = input.nextDouble();

        System.out.print("Enter your height (m)= ");
        double height = input.nextDouble();

        double bodyMassIndex = weight / (height * height);
        System.out.println("Your height= " + height + " m, your weight=" + weight + "kg");
        System.out.println("Your BMI = " + bodyMassIndex);
    }
}
package day05;

import java.util.Scanner;

public class _08_ExampleDouble {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight: ");
        double weight = input.nextDouble();

        System.out.println("Your weight = " + weight + "kg");
    }
}
package day25._01_Example;

// The place where types (classes) are defined

import java.util.ArrayList;
import java.util.Scanner;

public class _01_JavaClassAndObject {

    // Method
    public static void main(String[] args) {
        // Main method: the starting and ending point of the program
        int number;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // Creating an object of the class Araba
        Araba myCar = new Araba();
        myCar.color = "red";
        myCar.year = 2024;
        myCar.engineCapacity = 1600;
        myCar.brand = "Togg";

        // Printing the properties of myCar
        System.out.println("myCar.brand = " + myCar.brand);
        System.out.println("myCar.year = " + myCar.year);
        System.out.println("myCar.engineCapacity = " + myCar.engineCapacity);
        System.out.println("myCar.color = " + myCar.color);
    }
    // Method
}

// The place where types (classes) are defined
class Araba {
    String color;
    int year;
    String brand;
    int engineCapacity;
}

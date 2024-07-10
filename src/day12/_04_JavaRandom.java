package day12;

import java.util.Scanner;

public class _04_JavaRandom {
    public static void main(String[] args) {

        // (int)(Math.Random()*10)   -> 0-9,  0-19 , 0-29
        // I want between 20-30 patterns => produce about 10 then add 20
        // What is the between? ?
        // 1) Generate up to range 0- 9
        // 2) Add the minimum to the resulting result: 20- 29

        // Generate numbers for the entered min and max range
        Scanner input = new Scanner(System.in);
        System.out.print("Min (Lower Limit) = ");
        int min = input.nextInt();

        System.out.print("Max (Upper Limit) = ");
        int max = input.nextInt();

        int randomNumber = (int) (Math.random() * (max - min)) + min;
        // Generate by range, then add min
        System.out.println("randomNumber = " + randomNumber);
    }
}

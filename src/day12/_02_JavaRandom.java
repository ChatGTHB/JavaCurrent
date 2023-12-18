package day12;

import java.util.Scanner;

public class _02_JavaRandom {
    public static void main(String[] args) {

        // 1)- Try to guess by generating random numbers up to an entered number.
        // 2)- If the user guesses the number correctly, "Congratulations!" print it.
        // 3)- For example, if I enter 5, it will generate numbers up to 5, I will try to guess it.

        Scanner input = new Scanner(System.in);
        System.out.print("Number limit to be produced :");
        int limit = input.nextInt();

        int numberKept = (int) (Math.random() * limit);

        System.out.print("Your guess: ");
        int guess = input.nextInt();

        if (numberKept == guess) System.out.println("Congratulations you got it");
        else System.out.println("You didn't know , " + numberKept);
    }
}

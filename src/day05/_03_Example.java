package day05;

import java.util.Scanner;

public class _03_Example {
    public static void main(String[] args) {

        // Print an entered name to the screen again.
        Scanner read = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = read.next();  // next() reads a word

        System.out.println("name = " + name);

        /**
         read.next();      -> reads a word
         read.nextLine();  -> reads the entire line

         read.nextInt();   -> reads an integer
         read.nextShort(); -> a short reads an integer
         read.nextByte();  -> reads a byte integer
         read.nextLong();  -> a long reads an integer

         read.nextFloat(); -> reads an imperfect number
         read.nextDouble();-> reads a long long number

         read.nextBoolean();-> reads a boolean value (true/false)
         */
    }
}

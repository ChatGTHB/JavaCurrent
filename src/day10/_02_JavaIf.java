package day10;

import java.util.Scanner;

public class _02_JavaIf {
    public static void main(String[] args) {

        //  According to a student's grade entered,
        //  if it is 50 and greater than 50, you pass,
        //  if it is smaller, you fail.

        Scanner input = new Scanner(System.in);

        System.out.print("Student grade= ");
        int studentGrade = input.nextInt();

        if (studentGrade >= 50) System.out.println("You've passed, congratulations!");

        if (studentGrade < 50) System.out.println("Sorry, you're stuck");
    }
}

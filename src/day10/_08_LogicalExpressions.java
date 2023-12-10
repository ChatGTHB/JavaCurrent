package day10;

import java.util.Scanner;

public class _08_LogicalExpressions {
    public static void main(String[] args) {

        // Logical expressions
        // and       &&
        // or        ||

        // Question: If a number entered is greater than 0 and less than 100,
        // it is a valid grade, if not, it is not a valid grade

        Scanner input = new Scanner(System.in);

        System.out.print("Student Grade: ");
        int studentGrade = input.nextInt();

        if (0 < studentGrade && studentGrade <= 100) System.out.println("Valid grade");
        else System.out.println("Invalid Grade");
    }
}

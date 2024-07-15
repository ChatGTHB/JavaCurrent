package day17;

import java.util.Scanner;

public class _03_JavaArray {
    public static void main(String[] args) {
        // Enter the grades for a class of 50 students,
        // find how many grades are above the average,
        // and print those grades.

        Scanner scanner = new Scanner(System.in);
        int[] grades = new int[50]; // Array to store 50 grades

        int totalGrades = 0; // Variable to store the sum of grades

        // Reading grades and calculating the total
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
            totalGrades += grades[i];
        }

        int average = totalGrades / grades.length;  // Calculating the average
        System.out.println("Average = " + average);

        int countAboveAverage = 0; // Variable to count grades above average

        // Finding and printing grades above average
        for (int grade : grades) {
            if (grade >= average) {
                System.out.println("Grade = " + grade);
                countAboveAverage++;
            }
        }

        System.out.println("Number of grades above average = " + countAboveAverage);
    }
}

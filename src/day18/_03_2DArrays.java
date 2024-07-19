package day18;

import java.util.Scanner;

public class _03_2DArrays {
    public static void main(String[] args) {
        // What is a 2D Array?
        int number = 0;  // Holds one number

        int[] array = new int[10]; // Holds 10 numbers, like an apartment building

        int[] course1Grades = new int[50];  // Holds 50 grades for course 1
        int[] course2Grades = new int[50];  // Holds 50 grades for course 2
        int[] course3Grades = new int[50];  // Holds 50 grades for course 3

        // How to define three arrays of 50 elements each in one go
        int[][] allCourseGrades = new int[3][50];  // A 2D array: 3 arrays of 50 elements each

        //       [row][column]
        allCourseGrades[0][0] = 80;  // Accessing the first element using two indices

        System.out.println("allCourseGrades[0][0] = " + allCourseGrades[0][0]);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a grade for the first student in the first course: ");
        allCourseGrades[0][0] = scanner.nextInt();
        System.out.println("Updated allCourseGrades[0][0] = " + allCourseGrades[0][0]);
    }
}

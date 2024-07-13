package day12;

import java.util.Scanner;

public class _06_IfElseIf {
    public static void main(String[] args) {

        // Example: Get the grade from the user in the format "Physics:90".
        // Print the corresponding letter grade based on the following:
        // >= 90 for A
        // >= 80 for B
        // >= 70 for C
        // >= 60 for D
        // >= 40 for E
        // < 40 for F

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the subject and grade (e.g., Physics:90): ");
        String subjectAndGrade = scanner.nextLine(); // e.g., Physics:90

        // Method 1
        int index = subjectAndGrade.indexOf(":"); // Gets the index of ":"
        String strGrade = subjectAndGrade.substring(index + 1);  // "90"
        int studentGrade = Integer.parseInt(strGrade);

        // Method 2
        String strGrade2 = subjectAndGrade.replaceAll("[^0-9]", ""); // "90"
        int studentGrade2 = Integer.parseInt(strGrade2);

        // Ladder if: chained if statements
        if (studentGrade >= 90) {
            System.out.println("A");
        } else if (studentGrade >= 80) {
            System.out.println("B");
        } else if (studentGrade >= 70) {
            System.out.println("C");
        } else if (studentGrade >= 60) {
            System.out.println("D");
        } else if (studentGrade >= 40) {
            System.out.println("E");
        } else {
            System.out.println("F");
        }
    }
}

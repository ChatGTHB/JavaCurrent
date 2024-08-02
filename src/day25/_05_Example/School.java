package day25._05_Example;

import java.util.Scanner;


public class School {
    public static void main(String[] args) {
        // Create an array to store 3 students
        Student[] students = new Student[3];

        // Create a Scanner object to capture user input
        Scanner scanner = new Scanner(System.in);

        // Capture information for 3 students
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Enter student's first name: ");
            students[i].firstName = scanner.nextLine();
            System.out.print("Enter student's last name: ");
            students[i].lastName = scanner.nextLine();
            System.out.print("Enter student's grade: ");
            students[i].grade = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter student's address: ");
            students[i].address = scanner.nextLine();
            System.out.println();
        }

        // Print student details
        for (int i = 0; i < students.length; i++) {
            System.out.println("Details for student " + (i + 1) + ":");
            System.out.println("First Name: " + students[i].firstName);
            System.out.println("Last Name: " + students[i].lastName);
            System.out.println("Grade: " + students[i].grade);
            System.out.println("Address: " + students[i].address);
            System.out.println();
        }
    }
}

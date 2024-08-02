package day25._04_Example;

import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        // Create a student object
        Student student = new Student();

        // Create a Scanner object to capture user input
        Scanner scanner = new Scanner(System.in);

        // Capture student information from the user
        System.out.print("Enter student's first name: ");
        student.firstName = scanner.nextLine();
        System.out.print("Enter student's last name: ");
        student.lastName = scanner.nextLine();
        System.out.print("Enter student's grade: ");
        student.grade = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter student's address: ");
        student.address = scanner.nextLine();

        // Print student details
        System.out.println("Student's First Name: " + student.firstName);
        System.out.println("Student's Last Name: " + student.lastName);
        System.out.println("Student's Grade: " + student.grade);
        System.out.println("Student's Address: " + student.address);
    }
}

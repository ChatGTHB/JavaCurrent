package day25._02_Example;

public class School {
    public static void main(String[] args) {
        // Create a student object
        Student student = new Student();
        student.schoolNumber = 1001;
        student.firstName = "Kaan";
        student.lastName = "Gül";
        student.address = "Üsküdar";
        student.grade = 12;

        // Print student details
        System.out.println("student.schoolNumber = " + student.schoolNumber);
        System.out.println("student.firstName = " + student.firstName);
        System.out.println("student.lastName = " + student.lastName);
        System.out.println("student.grade = " + student.grade);
        System.out.println("student.address = " + student.address);
    }
}

// Define the Student class
class Student {
    int schoolNumber;
    String firstName;
    String lastName;
    int grade;
    String address;
}

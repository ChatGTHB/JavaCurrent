package day25._03_Example;

public class School {
    public static void main(String[] args) {
        // Create a student object
        Student student = new Student();

        // Set student properties
        student.schoolNumber = 2001;
        student.firstName = "Ayse";
        student.lastName = "Okkali";
        student.grade = 12;
        student.address = "Kadıköy";

        // Print student details
        System.out.println("student.schoolNumber = " + student.schoolNumber);
        System.out.println("student.firstName = " + student.firstName);
        System.out.println("student.lastName = " + student.lastName);
        System.out.println("student.grade = " + student.grade);
        System.out.println("student.address = " + student.address);
    }
}

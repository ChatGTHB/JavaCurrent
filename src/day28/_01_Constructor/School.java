package day28._01_Constructor;

import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student1 = new Student(); // Object creation moment
        student1.id = 1;
        student1.firstName = "John";
        student1.lastName = "Doe";
        student1.grade = 5;
        System.out.println(student1.firstName);

        Student student2 = new Student(2, "Jane", "Smith", 6);
        System.out.println(student2.firstName);
    }
}

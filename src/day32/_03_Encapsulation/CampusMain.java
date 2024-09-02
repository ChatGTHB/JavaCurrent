package day32._03_Encapsulation;

import java.util.Scanner;

public class CampusMain {
    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);

        School newSchool = new School("Yunus Emre Middle School", 3); // max students: 3

        do {
            System.out.print("Student Name=");
            String name = scanStr.nextLine();
            System.out.print("Student Surname=");
            String surname = scanStr.nextLine();
            System.out.print("Student Age=");
            int age = scanInt.nextInt();

            if (age < 15) {
                Student student = new Student(name, surname, age);
                newSchool.getStudents().add(student);
            } else {
                System.out.println("Student's age is not suitable for the school");
            }

        } while (newSchool.getStudents().size() < newSchool.getCapacity());

        for (Student s : newSchool.getStudents())
            System.out.println("Student = " + s);
    }
}

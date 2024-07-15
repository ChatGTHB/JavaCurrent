package day17;

public class _01_JavaArrayIntro {
    public static void main(String[] args) {
        int number;  // To store a single number

        int studentGrade = 0;

        int studentGrade1;
        int studentGrade2;
        //..
        //..
        int studentGrade50 = 50;

        // We need variables that can hold multiple values in one declaration.
        int[] grades = new int[50]; // An array to store 50 integers

        grades[0] = 50;
        grades[1] = 70;
        //..
        //..
        grades[49] = 89;

        System.out.println("grades[0], 1st student's grade = " + grades[0]);
        System.out.println("grades[49], 50th student's grade = " + grades[49]);
        System.out.println("Number of grades = " + grades.length);
    }
}

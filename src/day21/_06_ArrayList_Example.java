package day21;

import java.util.ArrayList;
import java.util.Scanner;

public class _06_ArrayList_Example {
    public static void main(String[] args) {
        /**
         * Take as many grades as the teacher wants to enter.
         * Ask the teacher if they want to continue (Y/N).
         * Find the number of students who passed the average.
         */

        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerStr = new Scanner(System.in);

        ArrayList<Integer> grades = new ArrayList<>();
        int total = 0;
        String response = "";
        do {
            // Read the grade
            System.out.print("Enter grade: ");
            int grade = scannerInt.nextInt();

            // Add to the ArrayList
            grades.add(grade);
            total += grade;

            System.out.print("Do you want to continue? (Y/N): ");
            // Read the response and use it as the loop condition
            response = scannerStr.next();

        } while (response.equalsIgnoreCase("Y")); // continue as long as the answer is yes

        System.out.println("grades = " + grades);

        int average = total / grades.size();
        System.out.println("average = " + average);

        int passingCount = 0;
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) >= average) passingCount++;
        }
        System.out.println("passingCount = " + passingCount);
    }
}

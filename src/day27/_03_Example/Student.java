package day27._03_Example;

import java.util.ArrayList;

public class Student {
    String name;
    int maxHours; // maxSaat: Maximum number of hours the student can take
    ArrayList<Course> courses = new ArrayList<>(); // dersleri: List to keep track of the student's courses

    // Static method to print university rules
    static void printUniversityRules() {

        System.out.println("Rule 1: Don't come to class without tea and raisins.");
        System.out.println("Rule 2: Always get enough sleep, health is the most important thing.");
        System.out.println("Rule 3: Always be alert, dynamic, and positive.");
        System.out.println("Rule 4: Don't forget the promise you made at the start, you're currently in camp.");
        System.out.println("Rule 5: Hopefully, we will succeed in this.");
    }

    // Method to add a course to the student's course list
    void addCourse(Course course) {

        // If the total hours of courses in the list have not reached the max hours:
        // 1. When the first course is added, the total hours in the list are 0, so it can be added.
        // 2. When the second course is added, the total hours in the list are 3, so it can be added.
        // 3. When the third course is added, the total hours in the list are 9, so it cannot be added.
        int currentTotalHours = 0;
        for (Course c : this.courses)
            currentTotalHours += c.hours;

        if (currentTotalHours + course.hours <= this.maxHours) {
            this.courses.add(course);
        } else {
            System.out.println("You've exceeded the maximum hours, the course cannot be added: " + course.name);
        }
    }
}

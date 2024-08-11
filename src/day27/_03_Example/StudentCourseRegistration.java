package day27._03_Example;

public class StudentCourseRegistration {
    public static void main(String[] args) {
        // Print the university rules
        Student.printUniversityRules();

        // Create courses
        Course course1 = new Course();
        course1.name = "Java101";
        course1.hours = 3;

        Course course2 = new Course();
        course2.name = "Algr101";
        course2.hours = 6;

        Course course3 = new Course();
        course3.name = "Math101";
        course3.hours = 4;

        // Create a student
        Student student1 = new Student();
        student1.name = "Esma";
        student1.maxHours = 10;

        // Add courses to the student's list
        student1.addCourse(course1);
        student1.addCourse(course2);
        student1.addCourse(course3);

        // TODO Method 1: Simple printing of the student's courses
        System.out.println("student1.courses = " + student1.courses);

        // TODO Method 2: Detailed printing of the student's transcript
        printTranscript(student1);
    }

    // Method for Method 2: Print the student's transcript in detail
    public static void printTranscript(Student student) {
        System.out.println("Transcript for " + student.name + ":");
        for (Course course : student.courses) {
            System.out.println("Course: " + course.name + " | Hours: " + course.hours);
        }
        System.out.println("Total Hours: " + student.courses.stream().mapToInt(course -> course.hours).sum());
    }
}

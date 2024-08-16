package day30._01_StaticVariables._01_Example;

public class Student {
    String firstName;
    String lastName;
    static String schoolName = "Yildirim Elementary School"; // You are unique, one of a kind
    // Applies to all, a single common element
    // We use STATIC for variables that are common for all objects.
    // static = you are unique
    // static helps save memory.
    // Assigned to all, stored in memory as a single instance
    // It becomes a type, class-level variable

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + this.firstName + '\'' +
                ", lastName='" + this.lastName + '\'' + ", schoolName='" + schoolName + '\'' +
                '}';
    }
}

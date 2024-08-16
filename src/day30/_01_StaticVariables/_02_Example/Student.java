package day30._01_StaticVariables._02_Example;

public class Student {
    private int id = 1;
    String fullName;
    private static int counter = 1;
    // You are unique,
    // Without static, it would always start from 0.
    // Since it's static, it maintains its value and increments by 1.
    // Static is used for information shared among all objects or for operations like counters.

    public Student(int id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    } // Needed for the first 4 lines in the main method,
    // but not required after the static variable is used.

    public Student(String fullName) {
        this.fullName = fullName;
        this.id = counter++;
        // counter = counter + 1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}

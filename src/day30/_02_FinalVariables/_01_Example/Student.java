package day30._02_FinalVariables._01_Example;

public class Student {
    private static int counter = 1; // Accessible only within the class
    final int id;   // Final variables can be assigned either at declaration or in the constructor
    // and cannot be changed afterward.
    String fullName;

    public Student(String fullName) {
        this.fullName = fullName;
        this.id = counter++;
    }

    @Override
    public String toString() {
        // this.id = 56;  // Cannot assign a value afterward, it should not be changed.

        return "Student{" + "id=" + id + ", fullName='" + fullName + '\'' + '}';
    }
}

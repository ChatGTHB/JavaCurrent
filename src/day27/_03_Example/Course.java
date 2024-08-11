package day27._03_Example;

public class Course {
    // Field to store the name of the course
    String name;

    // Field to store the number of hours the course takes
    int hours;

    // Override toString() method to provide a string representation of the Course object
    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", hours=" + hours +
                '}';
    }
}

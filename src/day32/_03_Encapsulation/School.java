package day32._03_Encapsulation;

import java.util.ArrayList;

public class School {
    private String schoolName;
    private int capacity;
    private final ArrayList<Student> students = new ArrayList<>();

    // Constructor
    public School(String schoolName, int capacity) {
        setSchoolName(schoolName);
        setCapacity(capacity);
    }

    // Getter and Setter for schoolName
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    // Getter and Setter for capacity
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // Getter for students
    public ArrayList<Student> getStudents() {
        return students;
    }
}

package day32._03_Encapsulation;

public class Student {
    private int schoolID; // 7th task: unique ID for each student
    private String name;
    private String surname;
    private int age;
    private static int counter = 0; // 7th task: counter for generating unique IDs

    // Constructor
    public Student(String name, String surname, int age) {
        setName(name);
        setSurname(surname);
        setAge(age);
        this.schoolID = counter++; // 7th task: assign unique ID to each student
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for surname
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Override toString method for easy printing of student information
    @Override
    public String toString() {
        return "Student{" +
                "schoolID=" + schoolID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}

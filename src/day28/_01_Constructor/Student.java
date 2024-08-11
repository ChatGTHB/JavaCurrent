package day28._01_Constructor;

public class Student {
    int id;
    String firstName;
    String lastName;
    int grade;

    public Student() { // These special methods are called constructors.
        // We can perform actions when the object is created here.
        System.out.println("Object created");
        System.out.println("Go to the beach");
        // or set the name to something specific
    }

    public Student(int id, String firstName, String lastName, int grade) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }
}

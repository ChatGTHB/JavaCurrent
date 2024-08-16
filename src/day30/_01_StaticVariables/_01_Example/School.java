package day30._01_StaticVariables._01_Example;

public class School {
    public static void main(String[] args) {
        Student student1 = new Student("John", "Smith");
        Student student2 = new Student("Michael", "Brown");
        Student student3 = new Student("Emily", "Johnson");
        // ...
        // ...
        Student student500 = new Student("David", "Williams");
        // Repeated entry of the same data is prevented
        // The same data is not repeated in memory for each object instance

        System.out.println(student1);
    }
}
